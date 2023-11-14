from bs4 import BeautifulSoup
import requests
import time
import certifi

########################################################################################################
def add_recipe_url_to_db(url):
    data = {'url': url}

    headers = {
        'username': 'esubalew11@gmail.com',
        'password': '105672864563817565',
        'login_with': 'google'
    }

    return requests.post("http://localhost:8080/api/ds_her/v1/url/add",
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15, json = data, headers=headers, verify=certifi.where())

########################################################################################################
def scrap_urls(i, parent_url):
    print("parent url is ", i, 'https://www.allrecipes.com/recipes/'+parent_url)
    source=requests.get('https://www.allrecipes.com/recipes/'+parent_url,
        verify=certifi.where(),
        # proxies={'http': '222.255.169.74:8080'},
        timeout=5)
    soup=BeautifulSoup(source.text,'html')

    # Find the specific div element with an id of 'mntl-taxonomysc-article-list-group_1-0'
    div = soup.find('div', {'id': 'mntl-taxonomysc-article-list-group_1-0'})
    # Find all links that start with "https://www.allrecipes.com/recipe/" within the specific div element
    links = [link.get('href') for link in div.find_all('a') if link.get('href').startswith('https://www.allrecipes.com/recipe/')]

    # print(links)
    for link in links:
        # recipe_url = link[len('https://www.allrecipes.com/recipes/'):].strip()
        recipe_url = link.strip()
        if recipe_url:
            # print(recipe_url)
            print(add_recipe_url_to_db(recipe_url), recipe_url)

    time.sleep(10)
        # print("total links ", len(links))
########################################################################################################33

headers = {
        'username': 'esubalew11@gmail.com',
        'password': '105672864563817565',
        'login_with': 'google'
    }

# print(response_body['url'])

for i in range(100):
    category_url =  requests.get("http://localhost:8080/api/ds_her/v1/category/get", timeout=15, headers=headers, verify=certifi.where())

    # Check if the response status code is 200
    if category_url.status_code == 200:
        try:
            response_body = category_url.json()
            print(response_body)
        except Exception as json_error:
            print(f"Error decoding JSON: {json_error}")
            print("Response content:", category_url.text)

            
    print(category_url)
    response_body = category_url.json()
    scrap_urls(i, response_body['url'])
