from bs4 import BeautifulSoup
import requests
import time
import certifi

########################################################################################################
def add_category_url_to_db(url):
    data = {'url': url}

    headers = {
        'username': 'esubalew.a2009@gmail.com',
        'password': 'Hereseb@1',
        'login_with': 'email_password'
    }

    return requests.post("https://datascienceplc.com/expertsway/api/ds_lc/v1/lesson/add",
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15, json = data, headers=headers, verify=certifi.where())

########################################################################################################
def scrap_urls(parent_urls):
    for parent_url in parent_urls:
        print("parent url is ", parent_url)
        source=requests.get(parent_url,
            # proxies={'http': '222.255.169.74:8080'},
            timeout=5)
        soup=BeautifulSoup(source.text,'html')

        # find all <a> tags that have a "href" attribute starting with "https://www.allrecipes.com/recipes/"
        links = [a['href'] for a in soup.find_all('a', href=lambda href: href and href.startswith('https://www.allrecipes.com/recipes/'))]

        # print(links)
        for link in links:
            category_url = link[len('https://www.allrecipes.com/recipes/'):].strip()
            if category_url:
                print(category_url)
                # add_category_url_to_db(category_url)

        # print("total links ", len(links))
########################################################################################################33

parent_urls = {
    "https://www.allrecipes.com/recipes/23070/everyday-cooking/cookware-and-equipment/air-fryer/",
    # "https://www.allrecipes.com/recipes/16492/everyday-cooking/special-collections/allrecipes-allstars/"
}
scrap_urls(parent_urls)