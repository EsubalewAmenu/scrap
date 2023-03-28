from bs4 import BeautifulSoup
import requests
import time
import certifi

########################################################################################################
def scrap_sections():
    source=requests.get(base_url+'/'+tutorial+"/index.htm",
        # proxies={'http': '222.255.169.74:8080'},
        timeout=5)
    soup=BeautifulSoup(source.text,'html')

    course_outline=soup.find_all("ul",class_='toc chapters')
    print('{')
    for i in course_outline:
        section = i.find("li",class_='heading')
        try:
            print("'"+section.text.replace(course_name+" ", "")+"': [")

            for tutors in i.find_all("li",class_=""):
                a = tutors.find('a')
                print("{'name': '"+a.text.replace(course_name+" - ", "")+"', 'url': '"+a['href']+"' },")
            print('],')
        except:
            pass
    print('}')
########################################################################################################33

def check_classes_ids(tag):
    return (tag.name == 'div' and (tag.get('class') in [['cover'], ['clear'], ['center-aligned', 'tutorial-menu'], ["mui-container-fluid", "button-borders"], ['clearer']] or tag.get('id') in ['google-top-ads','load', "google-bottom-ads",'bottom_navigation'])) or tag.name == 'style'

def scrap_content(endpoint):
    source=requests.get(base_url+endpoint,
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15, verify=certifi.where())
  
    soup=BeautifulSoup(source.text,'html')

    contents=soup.find("div",id='mainContent')

    for content in  contents.find_all(check_classes_ids):
        content.decompose()

    return ''.join([str(x) for x in contents.children])
    # return [content for content in contents.children]

def start_scraping_lessons(): 
    sections = {
'Tutorial': [
{'name': 'Home', 'url': '/bitcoin/index.htm' },
{'name': 'Introduction', 'url': '/bitcoin/bitcoin_introduction.htm' },
{'name': 'Environmental Setup', 'url': '/bitcoin/bitcoin_environmental_setup.htm' },
{'name': 'Blockchain Technology', 'url': '/bitcoin/bitcoin_blockchain_technology.htm' },
{'name': 'Cryptocurrencies', 'url': '/bitcoin/bitcoin_cryptocurrencies.htm' },
{'name': 'Features', 'url': '/bitcoin/bitcoin_features.htm' },
{'name': 'How do they work', 'url': '/bitcoin/bitcoin_how_do_they_work.htm' },
{'name': 'Wallet', 'url': '/bitcoin/bitcoin_wallet.htm' },
{'name': 'Mining', 'url': '/bitcoin/bitcoin_mining.htm' },
{'name': 'Exchanges', 'url': '/bitcoin/bitcoin_exchanges.htm' },
{'name': 'Trading', 'url': '/bitcoin/bitcoin_trading.htm' },
{'name': 'Glossary', 'url': '/bitcoin/bitcoin_glossary.htm' },
{'name': 'Applications', 'url': '/bitcoin/bitcoin_applications.htm' },
{'name': 'Future', 'url': '/bitcoin/bitcoin_future.htm' },
{'name': 'Quick Guide', 'url': '/bitcoin/bitcoin_quick_guide.htm' },
{'name': 'Useful Resources', 'url': '/bitcoin/bitcoin_useful_resources.htm' },
{'name': 'Discussion', 'url': '/bitcoin/bitcoin_discussion.htm' },
],
}
    scrap_lessons(sections)




def add_scrap_content_to_db(tutorial, section, lesson, content):
    data = {'tutorial': tutorial,'section': section,'lesson': lesson,'content': content}
    # return requests.post("https://dashencon.com/test/wp-json/ds_lc/v1/lesson/add",

    headers = {
        'username': 'esubalew.a2009@gmail.com',
        'password': 'Hereseb@1',
        'login_with': 'email_password'
    }

    return requests.post("https://datascienceplc.com/expertsway/api/ds_lc/v1/lesson/add",
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15, json = data, headers=headers, verify=certifi.where())

def scrap_lessons(sections):
    for section in sections:
        for lesson in sections[section]:
            print('lesson name ', lesson['name'],'url',base_url+lesson['url'])
            content = scrap_content(lesson['url'])
            add_to_db = add_scrap_content_to_db(tutorial,section,lesson['name'],content)
            
            try:
                add_to_db.raise_for_status()
                print(section,lesson['name'], add_to_db)
            except requests.exceptions.HTTPError as e:
                print(f"Error: {e}")

            time.sleep(10)



# python, java
course_name = "Bitcoin"
tutorial = "bitcoin"
base_url="https://www.tutorialspoint.com"


# scrap_sections()
start_scraping_lessons()