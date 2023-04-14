from urllib.parse import urlparse, urlunparse
from selenium import webdriver
from datetime import datetime
from bs4 import BeautifulSoup
import requests
import certifi
import time
import re


from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

def scrap_recipe(i, recipe_url):
    print("recipe url is ", i, recipe_url)

    options = Options()
    options.add_argument("--incognito")

    driver = webdriver.Chrome(options=options)
    driver.get(recipe_url)
    # driver.get("file:///home/esubalew/Desktop/esubalew/python/scraping/test.html")
    time.sleep(10) # wait for the page to load
    soup = BeautifulSoup(driver.page_source, "html.parser")


    # num_of_photos_div = soup.find("div", {"id": "recipe-review-bar_1-0"})
    # num_of_photos = num_of_photos_div.find("div", {"id": "recipe-review-bar__photo-count_1-0"}).text.strip()

    # match = re.search(r'\d+', num_of_photos)
    # if match:
    #     num_photos = int(match.group())
    # else:
    #     print("No number found in the text.")
    #     return "check recipe photos"


    category_names = recipe_categories(soup)
    title, description, recipe_by, published_date = recipe(soup)
    rating_points, rating_count = recipe_rattings(soup)
    image_links = recipe_images(driver, soup)
    prep_time, cook_time, additional_time, total_time, servings, recipe_yield = detail_times(soup)
    ingredients, to_serves = recipe_ingredients(soup)
    steps = recipe_steps(soup)
    nutrition_info = recipe_nutritions(soup)

    full_recipe_dict = {}
    full_recipe_dict['slug'] =  recipe_url[len("https://www.allrecipes.com/recipe/"):-1]
    full_recipe_dict['category_names'] = category_names
    full_recipe_dict['title'] = title
    full_recipe_dict['description'] = description
    full_recipe_dict['recipe_by'] = recipe_by
    full_recipe_dict['published_date'] = published_date
    full_recipe_dict['rating_points'] = rating_points
    full_recipe_dict['rating_count'] = rating_count
    full_recipe_dict['image_links'] = image_links
    full_recipe_dict['prep_time'] = prep_time
    full_recipe_dict['cook_time'] = cook_time
    full_recipe_dict['additional_time'] = additional_time
    full_recipe_dict['total_time'] = total_time
    full_recipe_dict['servings'] = servings
    full_recipe_dict['recipe_yield'] = recipe_yield
    full_recipe_dict['ingredients'] = ingredients
    full_recipe_dict['steps'] = steps
    full_recipe_dict['nutrition_info'] = nutrition_info

    # # full_recipe_dict = {'slug': '81321/restaurant-style-sweet-potato-casserole', 'category_names': ['Side Dish', 'Vegetables', 'Sweet Potatoes', 'Sweet Potatoes With Marshmallow Recipes'], 'title': 'Restaurant-Style Sweet Potato Casserole', 'description': "The brown sugar, cream, marshmallows, and oatmeal streusel give this casserole a taste similar to sweet potato pie, yet the dish goes great alongside meals as varied as low-key chicken dinners or festive holiday banquets. And the great part is, if you're planning to use this for entertaining, you can make everything but the streusel a day ahead so you won't be stressed at crunch time.", 'recipe_by': 'kelcampbell', 'published_date': '2020-03-04 00:00:00', 'rating_points': '4.9', 'rating_count': '8', 'image_links': ['https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fpublic-assets-ucg.meredithcorp.io%2F4df8e36df71f154b56a7489ffc166973%2F6071232.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F6027716.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F4143066.jpg&q=60&c=sc&orient=true&poi=auto'], 'prep_time': '20 mins', 'cook_time': '2 hrs 10 mins', 'additional_time': None, 'total_time': '2 hrs 30 mins', 'servings': '12', 'recipe_yield': '12 servings', 'ingredients': [('2 ½', 'pounds', 'sweet potatoes'), ('1', 'teaspoon', 'vegetable oil, or as needed'), ('¾', 'cup', 'dark brown sugar'), ('½', 'cup', 'heavy whipping cream'), ('¼', 'cup', 'melted butter'), ('¼', 'teaspoon', 'ground cinnamon'), ('¼', 'teaspoon', 'salt')], 'steps': ['Preheat oven to 400 degrees F (200 degrees C).', 'Rub the skin of each sweet potato with vegetable oil; place potatoes on a baking sheet.', 'Bake in the preheated oven until tender, about 1 hour; remove and cool slightly. Reduce oven temperature to 350 degrees F (175 degrees C).', 'When sweet potatoes are cool enough to handle, scrape flesh into a large bowl; discard skins. Beat sweet potatoes with an electric mixer until smooth.', 'Measure 6 cups of mashed sweet potato into a large bowl; beat in 3/4 cup brown sugar, cream, 1/4 cup melted butter, 1/4 teaspoon cinnamon, and salt. Pour sweet potato mixture into an 8x8-inch baking dish.', 'Place the rolled oats into the bowl of a food processor or blender, and pulse until oats are finely ground. Place oats, 2 tablespoons brown sugar, flour, and 1/8 teaspoon cinnamon into a bowl. Cut 2 tablespoons cold butter into the oat mixture with a pastry blender or fork until crumbly; sprinkle evenly over sweet potato mixture.', 'Bake in the preheated oven until sweet potatoes are heated through and oatmeal streusel is lightly browned, 70 to 80 minutes. Remove from oven, sprinkle immediately with marshmallows, and let stand until marshmallows are melted, about 10 minutes.'], 'nutrition_info': [['Calories', '269', None], ['Total Fat', '10g', '13%'], ['Saturated Fat', '6g', '31%'], ['Cholesterol', '29mg', '10%'], ['Sodium', '340mg', '15%'], ['Total Carbohydrate', '43g', '16%'], ['Dietary Fiber', '3g', '12%'], ['Total Sugars', '29g', None], ['Protein', '3g', None], ['Vitamin C', '19mg', '93%'], ['Calcium', '58mg', '4%'], ['Iron', '1mg', '5%'], ['Potassium', '485mg', '10%']]}
    print(full_recipe_dict)


    driver.quit()
    time.sleep(3)
########################################################################################################
def recipe_images(driver, soup):

    try:
        link = driver.find_element(By.CLASS_NAME, 'gallery-photos')
        # Click on the "Load More" button until all images are loaded
        while True:
            try:
                link.click()
                time.sleep(5)

            except:
                break

        soup = BeautifulSoup(driver.page_source, "html.parser")

        # locate all the img tags in the HTML
        div_element = soup.find('div', {'id': 'photo-dialog__page_1-0'})
        img_tags = div_element.find_all('img')
    except NoSuchElementException:
        try:
            # find all the img tags inside the div with id="article__photo-ribbon_1-0"
            img_tags = soup.find("div", {"id": "article__photo-ribbon_1-0"}).find_all("img")
        except AttributeError:
            return None

    image_links = []

    # loop through the img tags and extract the src attribute
    for img in img_tags:
        if img["src"]: 
            image_links.append(img["src"])
        else:
            image_links.append(img["data-src"])

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
    # print(image_links)
    return image_links
########################################################################################################
def add_recipe_to_db(url):
    data = {'url': url}

    headers = {
        'username': 'esubalew11@gmail.com',
        'password': '105672864563817565',
        'login_with': 'google'
    }

    return requests.post("http://localhost:8080/api/ds_her/v1/category/add",
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15, json = data, headers=headers, verify=certifi.where())



########################################################################################################
def recipe_nutritions(soup):
    nutrition_info = []#{}

    ############## Calories #######################
    fullnutrient = []
    calories = soup.find('tr', {'class': 'mntl-nutrition-facts-label__calories'})
    calories_amount = calories.find_all('span')[1].text.strip()
    # print( f"Calories {calories_amount}")

    fullnutrient.append( "Calories" )
    fullnutrient.append( calories_amount )
    fullnutrient.append( None )

    nutrition_info.append(fullnutrient)
    ############## Calories end ####################

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

    # print(nutrition_info)
    return nutrition_info
########################################################################################################
def recipe_steps(soup):
    steps_div = soup.find("div", {"id": "recipe__steps_1-0"})
    steps_list = steps_div.find_all("li")

    steps = []

    for step in steps_list:
        step_text = step.p.text.strip()
        steps.append(step_text)

    # print(steps)
    return steps

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
    # print("Ingredients:")
    # for quantity, unit, name in ingredients:
    #     print(f"quantity {quantity} unit = {unit} name = {name}")


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

        # print("\nTo Serve:")
        # for quantity, unit, name in to_serves:
        #     print(f"quantity {quantity} unit = {unit} name = {name}")
    except:
        to_serves = None
    
    return ingredients, to_serves
########################################################################################################

########################################################################################################
def recipe(soup):
    title = soup.select_one(".article-post-header h1").text.strip()
    description = soup.select_one(".article-post-header p").text.strip()
    recipe_by = soup.select_one(".mntl-attribution__item-name").text.strip()
    # published_date = soup.select_one(".mntl-attribution__item-date").text.strip().replace("Updated on ", "")
    date_text = soup.select_one(".mntl-attribution__item-date").text.strip()
    # replace "Updated on" or "Published on" with an empty string
    published_date = convert_date(re.sub(r'(Updated|Published) on ', '', date_text))

    # print(title)
    # print(description)
    # print(recipe_by)
    # print(published_date)
    return title, description, recipe_by, published_date
########################################################################################################

########################################################################################################
def recipe_rattings(soup):

    rating_div = soup.find("div", {"id": "recipe-review-bar_1-0"})
    rating_points = rating_div.find("div", {"id": "mntl-recipe-review-bar__rating_1-0"}).text.strip()
    rating_count = rating_div.find("div", {"id": "mntl-recipe-review-bar__rating-count_1-0"}).text.replace('(', '').replace(')', '').strip()
    return rating_points, rating_count
########################################################################################################


########################################################################################################
def recipe_categories(soup):

    category_names = []

    breadcrumbs = soup.find("ul", {"id": "breadcrumbs__list_1-0"})
    for crumb in breadcrumbs.find_all("a"):
        category_names.append(crumb.text)

    return category_names
########################################################################################################

########################################################################################################
def detail_times(soup):
    try:
        prep_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Prep Time:").find_next_sibling("div").string.strip()#.split()
    except AttributeError:
        prep_time = None
    try:
        cook_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Cook Time:").find_next_sibling("div").string.strip()#.split()
    except AttributeError:
        cook_time = None
    try:
        additional_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Additional Time:").find_next_sibling("div").string.strip()#.split()
    except AttributeError:
        additional_time = None
    try:
        total_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Total Time:").find_next_sibling("div").string.strip()#.split()
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
        
    return prep_time, cook_time, additional_time, total_time, servings, recipe_yield
########################################################################################################

def convert_date(date_str):
    # Parse the input date string into a datetime object
    date_obj = datetime.strptime(date_str, '%B %d, %Y')
    
    # Format the datetime object as a string in the desired format
    formatted_date = datetime.strftime(date_obj, '%Y-%m-%d %H:%M:%S')
    
    # Return the formatted date string
    return formatted_date

headers = {
        'username': 'esubalew11@gmail.com',
        'password': '105672864563817565',
        'login_with': 'google'
    }

# print(response_body['url'])

for i in range(1):
#     # category_url =  requests.get("http://localhost:8080/api/ds_her/v1/category/get", timeout=15, headers=headers, verify=certifi.where())
#     # response_body = category_url.json()
#     # scrap_recipe(i, response_body['url'])
    scrap_recipe(i, "https://www.allrecipes.com/recipe/81321/restaurant-style-sweet-potato-casserole/")