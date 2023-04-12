from urllib.parse import urlparse, urlunparse
from selenium import webdriver
from bs4 import BeautifulSoup
import requests
import certifi
import time
import re

def scrap_recipe(i, recipe_url):
    print("recipe url is ", i, recipe_url)
    # source=requests.get(recipe_url,
    #     verify=certifi.where(),
    #     # proxies={'http': '222.255.169.74:8080'},
    #     timeout=5)
    # soup=BeautifulSoup(source.text,'html')

    driver = webdriver.Chrome()
    driver.get(recipe_url)
    time.sleep(5) # wait for the page to load

    soup = BeautifulSoup(driver.page_source, "html.parser")
    driver.quit()

    print("times :-------------------")
    detail_times(soup)
    print("categories :-------------------")
    recipe_categories(soup)
    print("rattings :-------------------")
    recipe_rattings(soup)
    print("main detail :-------------------")
    recipe(soup)
    print("ingredients :-------------------")
    recipe_ingredients(soup)
    print("images :-------------------")
    recipe_images(soup)
    print("steps :-------------------")
    recipe_steps(soup)
    print("nutritions :-------------------")
    recipe_nutritions(soup)

    time.sleep(3)


########################################################################################################
def recipe_nutritions(soup):
    nutrition_info = []#{}

    table_body = soup.find("tbody", class_="mntl-nutrition-facts-label__table-body")
    rows = table_body.find_all("tr")
    for row in rows:
        columns = row.find_all("td")
        nutrient = columns[0].text.strip()
    
        fullnutrient = []

        if nutrient != "% Daily Value *":

            # print(nutrient)
            nutrient_name, nutrient_value = nutrient.split("\n")
            # print(nutrient_name)
            # print(nutrient_value)
            try:
                daily_value = columns[1].text.strip()
            except:
                daily_value = None

            fullnutrient.append( nutrient_name )
            fullnutrient.append( nutrient_value )
            fullnutrient.append( daily_value )

            nutrition_info.append(fullnutrient)
            # nutrition_info[nutrient] = daily_value

    print(nutrition_info)
    
    calories = soup.find('tr', {'class': 'mntl-nutrition-facts-label__calories'})
    calories_amount = calories.find_all('span')[1].text.strip()
    print( f"Calories {calories_amount}")
########################################################################################################
def recipe_steps(soup):
    steps_div = soup.find("div", {"id": "recipe__steps_1-0"})
    steps_list = steps_div.find_all("li")

    steps = []

    for step in steps_list:
        step_text = step.p.text.strip()
        steps.append(step_text)

    print(steps)
########################################################################################################
def recipe_images(soup):
    image_links = []

    try:
        # find all the img tags inside the div with id="article__photo-ribbon_1-0"
        img_tags = soup.find("div", {"id": "article__photo-ribbon_1-0"}).find_all("img")
    except AttributeError:
        return None
    

    # loop through the img tags and extract the src attribute
    for img in img_tags:
        if img["src"]: 
            image_links.append(img["src"])

    # loop through the image links and remove the "w" and "h" parameters from the query string
    for i, link in enumerate(image_links):
        parsed_url = urlparse(link)
        query_dict = {}
        for query in parsed_url.query.split('&'):
            if '=' in query:
                key, value = query.split('=')
                query_dict[key] = value
        query_dict.pop('w', None)
        query_dict.pop('h', None)
        new_query_string = '&'.join([f"{k}={v}" for k, v in query_dict.items()])
        new_url = urlunparse((parsed_url.scheme, parsed_url.netloc, parsed_url.path, parsed_url.params, new_query_string, parsed_url.fragment))
        image_links[i] = new_url
    print(image_links)
########################################################################################################
def recipe_ingredients(soup):
    # find the first ul element with class "mntl-structured-ingredients__list"
    ingredient_list = soup.find("ul", class_="mntl-structured-ingredients__list")

    # create a list to hold the ingredient data
    ingredients = []
    for li in ingredient_list.find_all("li"):
        quantity = li.find("span", {"data-ingredient-quantity": True}).text.strip()
        unit = li.find("span", {"data-ingredient-unit": True}).text.strip()
        name = li.find("span", {"data-ingredient-name": True}).text.strip()

        ingredients.append((quantity, unit, name))

    # print the ingredient and "To Serve" lists
    print("Ingredients:")
    for quantity, unit, name in ingredients:
        print(f"quantity {quantity} unit = {unit} name = {name}")


    try:
        # find the second ul element with class "mntl-structured-ingredients__list"
        to_serve_list = soup.find_all("ul", class_="mntl-structured-ingredients__list")[1]

        # create a list to hold the ingredient data
        to_serves = []
        for li in to_serve_list.find_all("li"):
            quantity = li.find("span", {"data-ingredient-quantity": True}).text.strip()
            unit = li.find("span", {"data-ingredient-unit": True}).text.strip()
            name = li.find("span", {"data-ingredient-name": True}).text.strip()
            to_serves.append((quantity, unit, name))

        print("\nTo Serve:")
        for quantity, unit, name in to_serves:
            print(f"quantity {quantity} unit = {unit} name = {name}")
    except:
        to_serves = None
########################################################################################################

########################################################################################################
def recipe(soup):
    title = soup.select_one(".article-post-header h1").text.strip()
    description = soup.select_one(".article-post-header p").text.strip()
    recipe_by = soup.select_one(".mntl-attribution__item-name").text.strip()
    # published_date = soup.select_one(".mntl-attribution__item-date").text.strip().replace("Updated on ", "")
    date_text = soup.select_one(".mntl-attribution__item-date").text.strip()
    # replace "Updated on" or "Published on" with an empty string
    published_date = re.sub(r'(Updated|Published) on ', '', date_text)

    print(title)
    print(description)
    print(recipe_by)
    print(published_date)
########################################################################################################

########################################################################################################
def recipe_rattings(soup):

    rating_div = soup.find("div", {"id": "recipe-review-bar_1-0"})
    rating_points = rating_div.find("div", {"id": "mntl-recipe-review-bar__rating_1-0"}).text

    print("Rating points:", rating_points)
########################################################################################################


########################################################################################################
def recipe_categories(soup):

    category_names = []

    breadcrumbs = soup.find("ul", {"id": "breadcrumbs__list_1-0"})
    for crumb in breadcrumbs.find_all("a"):
        category_names.append(crumb.text)

    print(category_names)
########################################################################################################

########################################################################################################
def detail_times(soup):
    try:
        prep_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Prep Time:").find_next_sibling("div").string.strip().split()
    except AttributeError:
        prep_time = None
    try:
        cook_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Cook Time:").find_next_sibling("div").string.strip().split()
    except AttributeError:
        cook_time = None
    try:
        additional_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Additional Time:").find_next_sibling("div").string.strip().split()
    except AttributeError:
        additional_time = None
    try:
        total_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Total Time:").find_next_sibling("div").string.strip().split()
    except AttributeError:
        total_time = None
    try:
        servings = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Servings:").find_next_sibling("div").string.strip()
    except AttributeError:
        servings = None
    try:
        recipe_yield = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Yield:").find_next_sibling("div").string.strip()
    except AttributeError:
            recipe_yield = None
        
    print("Prep Time:", prep_time)
    print("Cook Time:", cook_time)
    print("Additional Time:", additional_time)
    print("Total Time:", total_time)
    print("Servings:", servings)
    print("Yield:", recipe_yield)
########################################################################################################

headers = {
        'username': 'esubalew11@gmail.com',
        'password': '105672864563817565',
        'login_with': 'google'
    }

# print(response_body['url'])

for i in range(1):
    # category_url =  requests.get("http://localhost:8080/api/ds_her/v1/category/get", timeout=15, headers=headers, verify=certifi.where())
    # response_body = category_url.json()
    # scrap_recipe(i, response_body['url'])
    scrap_recipe(i, "https://www.allrecipes.com/recipe/81321/restaurant-style-sweet-potato-casserole/")