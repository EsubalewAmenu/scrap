from urllib.parse import urlparse, urlunparse
from datetime import datetime
from bs4 import BeautifulSoup
import requests
import certifi
import time
import re


from selenium import webdriver
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
    
    full_data = prepare_the_recipe(driver, recipe_url, soup)

    driver.quit()

    return full_data



def prepare_the_recipe(driver, recipe_url, soup):
    category_names = recipe_categories(soup)
    title, description, recipe_by, recipe_by_username, published_date = recipe(soup)
    rating_points, rating_count = recipe_rattings(soup)
    image_links = recipe_images(driver, soup)
    prep_time, cook_time, refrigerate_time, additional_time, total_time, servings, recipe_yield = detail_times(soup)
    ingredients, to_serves = recipe_ingredients(soup)
    steps = recipe_steps(soup)
    nutrition_info = recipe_nutritions(soup)

    full_recipe_dict = {}
    full_recipe_dict['slug'] =  recipe_url[len("https://www.allrecipes.com/recipe/"):-1]
    full_recipe_dict['category_names'] = category_names
    full_recipe_dict['title'] = title
    full_recipe_dict['description'] = description
    full_recipe_dict['recipe_by'] = recipe_by
    full_recipe_dict['recipe_by_username'] = recipe_by_username
    full_recipe_dict['published_date'] = published_date
    full_recipe_dict['rating_points'] = rating_points
    full_recipe_dict['rating_count'] = rating_count
    full_recipe_dict['image_links'] = image_links
    full_recipe_dict['prep_time'] = prep_time
    full_recipe_dict['cook_time'] = cook_time
    full_recipe_dict['refrigerate_time'] = refrigerate_time
    full_recipe_dict['additional_time'] = additional_time
    full_recipe_dict['total_time'] = total_time
    full_recipe_dict['servings'] = servings
    full_recipe_dict['recipe_yield'] = recipe_yield
    full_recipe_dict['ingredients'] = ingredients
    full_recipe_dict['steps'] = steps
    full_recipe_dict['nutrition_info'] = nutrition_info

    # full_recipe_dict = {'slug': '14009/muesli', 'category_names': ['Breakfast and Brunch', 'Cereals'], 'title': 'Muesli', 'description': "This muesli recipe is a nutritious and delicious breakfast cereal. Use any dried fruit you desire. You can also use almonds in place of walnuts if you like. It's wonderful served in bowls with milk and fresh berries or sliced fresh fruit.", 'recipe_by': 'Allrecipes Member', 'recipe_by_username': 'Allrecipes Member', 'published_date': '2022-08-25 00:00:00', 'rating_points': '4.8', 'rating_count': '190', 'image_links': ['https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F9436232.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F9039483.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fpublic-assets-ucg.meredithcorp.io%2F15d808635b2950a8fbd9a9e3831368f7%2F6253825.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F3589497.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F3453282.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F3803001.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F1126784.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F888014.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F779199.jpg&q=60&c=sc&orient=true&poi=auto', 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F779197.jpg&q=60&c=sc&orient=true&poi=auto'], 'prep_time': '10 mins', 'cook_time': None, 'refrigerate_time': None, 'additional_time': None, 'total_time': '10 mins', 'servings': '16', 'recipe_yield': '8 cups', 'ingredients': [('4 ½', 'cups', 'rolled oats'), ('1', 'cup', 'raisins'), ('½', 'cup', 'toasted wheat germ'), ('½', 'cup', 'wheat bran'), ('½', 'cup', 'oat bran'), ('½', 'cup', 'chopped walnuts'), ('¼', 'cup', 'packed brown sugar'), ('¼', 'cup', 'raw sunflower seeds')], 'steps': [{'text': 'Combine oats, raisins, wheat germ, wheat bran, oat bran, walnuts, brown sugar, and sunflower seeds in a large bowl; mix well. Store muesli in an airtight container at room temperature for up to 2 months.', 'image': 'https://www.allrecipes.com/thmb/cWQJSNLA0HcNt7HkYPVi7MoXpHQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/888014-f94dab3b95ce41ebad1fa04b5539f804.jpg'}], 'nutrition_info': [['Calories', '188', None], ['Total Fat', '6g', '7'], ['Saturated Fat', '1g', '4'], ['Sodium', '4mg', '0'], ['Total Carbohydrate', '32g', '12'], ['Dietary Fiber', '5g', '17'], ['Total Sugars', '9g', None], ['Protein', '6g', None], ['Vitamin C', '1mg', '3'], ['Calcium', '29mg', '2'], ['Iron', '2mg', '12'], ['Potassium', '257mg', '5']]}
    # print(full_recipe_dict)


    return full_recipe_dict
########################################################################################################
def recipe_images(driver, soup):

    num_of_photos_div = soup.find("div", {"id": "recipe-review-bar_1-0"})
    num_of_photos = num_of_photos_div.find("div", {"id": "recipe-review-bar__photo-count_1-0"}).text.strip()

    match = re.search(r'\d+', num_of_photos)
    if match:
        num_photos = int(match.group())
    else:
        print("No number found in the text.")
        raise NoSuchElementException

    if num_photos == 0:
        print("No image")
        return None

    img_tags = soup.find("div", {"id": "article__photo-ribbon_1-0"}).find_all("img")

    if num_photos - len(img_tags) <= 1:
        img_tags = []
        try:
            # find all the img tags inside the div with id="article__photo-ribbon_1-0"
            img_tags = soup.find("div", {"id": "article__photo-ribbon_1-0"}).find_all("img")
        except AttributeError:
            if num_photos != 1:
                print("exception")
                raise NoSuchElementException

        if num_photos- len(img_tags) == 1:
            img_tags.insert(0, soup.find("img", {"class": "primary-image__image"}))
            if len(img_tags) == 0:
                img_tags.insert(0, soup.find("img", {"class": "universal-image__image"}))

    elif driver.find_elements(By.CLASS_NAME, 'gallery-photos'):
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
            if len(img_tags) == 0:
                raise NoSuchElementException
        except NoSuchElementException:
            print("inside gallery-photos exception")

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
def recipe_nutritions(soup):
    try:
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
                    daily_value = daily_value.replace('%', '')
                except:
                    daily_value = None

                fullnutrient.append( nutrient_name )
                fullnutrient.append( nutrient_value )
                fullnutrient.append( daily_value )

                nutrition_info.append(fullnutrient)
                # nutrition_info[nutrient] = daily_value

        # print(nutrition_info)
        return nutrition_info
    except:
        return None
########################################################################################################
# def recipe_steps(soup):
#     steps_div = soup.find("div", {"id": "recipe__steps_1-0"})
#     steps_list = steps_div.find_all("li")

#     steps = []

#     for step in steps_list:
#         step_text = step.p.text.strip()
#         steps.append(step_text)

#     # print(steps)
#     return steps
def recipe_steps(soup):
    steps_div = soup.find("div", {"id": "recipe__steps_1-0"})
    steps_list = steps_div.find_all("li")

    steps = []

    for step in steps_list:
        step_text = step.p.text.strip()
        if step.find('img'):
            if step.img.has_attr('data-src'):
                step_img = step.img['data-src']
            elif step.img.has_attr('src'):
                step_img = step.img['src']
            else:
                step_img = None
            steps.append({'text': step_text, 'image': step_img})
        else:
            steps.append({'text': step_text, 'image': None})

    return steps

########################################################################################################
def recipe_ingredients(soup):
    # find the first ul element with class "mntl-structured-ingredients__list"
    ingredient_list = soup.find("ul", class_="mntl-structured-ingredients__list")

    # create a list to hold the ingredient data
    ingredients = []
    for li in ingredient_list.find_all("li"):
        try:
            quantity = li.find("span", {"data-ingredient-quantity": True}).text.strip()
        except:
            quantity = ""
        try:
            unit = li.find("span", {"data-ingredient-unit": True}).text.strip()
        except:
            unit = ""
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
    recipe_by_username = soup.select_one(".mntl-attribution__item-name").text.strip() 
    date_text = soup.select_one(".mntl-attribution__item-date").text.strip()
    published_date = convert_date(re.sub(r'(Updated|Published) on ', '', date_text))

    return title, description, recipe_by, recipe_by_username,published_date
########################################################################################################

########################################################################################################
def recipe_rattings(soup):
    rating_div = soup.find("div", {"id": "recipe-review-bar_1-0"})
    try:
        rating_points = rating_div.find("div", {"id": "mntl-recipe-review-bar__rating_1-0"}).text.strip()
        rating_count = rating_div.find("div", {"id": "mntl-recipe-review-bar__rating-count_1-0"}).text.replace('(', '').replace(')', '').strip()
    except AttributeError:
        rating_points = 0
        rating_count = 0
    return rating_points, rating_count
########################################################################################################


########################################################################################################
def recipe_categories(soup):

    category_names = []

    breadcrumbs = soup.find("ul", {"id": "breadcrumbs__list_1-0"})
    for crumb in breadcrumbs.find_all("a"):
        if crumb.text != "Recipes":
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
        refrigerate_time = soup.find("div", {"class": "mntl-recipe-details__label"}, string="Refrigerate Time:").find_next_sibling("div").string.strip()#.split()
    except AttributeError:
        refrigerate_time = None
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
        
    return prep_time, cook_time, refrigerate_time, additional_time, total_time, servings, recipe_yield
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

########################################################################################################
def add_recipe_to_db(recipe_data):
    # data = {'url': url}

    return requests.post("https://dashencon.com/recipes/api/ds_her/v1/recipe/add",
        timeout=15, json = recipe_data, headers=headers, verify=certifi.where())



recipe_data = scrap_recipe(1, "https://www.allrecipes.com/recipe/9111/cranberry-sauce/")
print(recipe_data)
# for i in range(5000):

#     recipe_url =  requests.get("http://localhost:8080/api/ds_her/v1/recipe/url/get", timeout=15, headers=headers, verify=certifi.where())
#     response_body = recipe_url.json()
#     print(response_body)
#     recipe_data = scrap_recipe(i, response_body['url'])
#     # recipe_data = scrap_recipe(i, "https://www.allrecipes.com/recipe/44045/irish-coffee/")

#     # print(recipe_data)

#     if not recipe_data['image_links']:
#         print("No image - jumped")
#         copy_response =  requests.get("http://localhost:8080/api/ds_her/v1/recipe/url/scraped/"+response_body['id'], timeout=15, headers=headers, verify=certifi.where())
#     elif not recipe_data['nutrition_info']:
#         print("No nutrition info - jumped")
#         copy_response =  requests.get("http://localhost:8080/api/ds_her/v1/recipe/url/scraped/"+response_body['id'], timeout=15, headers=headers, verify=certifi.where())
#     else:
#         # print(recipe_data)
#         server_response = add_recipe_to_db(recipe_data)
#         print( "server response status code ", server_response.status_code )
#         print( server_response.text )
#         if(server_response.status_code):
#             print("id is " , response_body['id'])
#             copy_response =  requests.get("http://localhost:8080/api/ds_her/v1/recipe/url/scraped/"+response_body['id'], timeout=15, headers=headers, verify=certifi.where())
#             print("backing up ", copy_response.json())

#     time.sleep(3)