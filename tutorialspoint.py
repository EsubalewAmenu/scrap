from bs4 import BeautifulSoup
import requests


base_url="https://www.tutorialspoint.com"

# ## scrap data from sourcepedia

# source=requests.get(base_url+"/python/index.htm",
#     # proxies={'http': '222.255.169.74:8080'},
#     timeout=5)
# soup=BeautifulSoup(source.text,'html')

# # ### find html tags with classes
# course_outline=soup.find_all("ul",class_='toc chapters')
# for i in course_outline:
#     secion = i.find("li",class_='heading')
#     print("secion - ", secion.text)

#     for tutors in i.find_all("li",class_=""):
#         a = tutors.find('a')
#         print('name',a.text,"tutor url",a['href'])
#     print('single sec end')

endpoint = "/python/python_variables.htm"


def check_classes_ids(tag):
    return (tag.name == 'div' and (tag.get('class') in [['clear'], ["mui-container-fluid", "button-borders"], ['clearer']] or tag.get('id') in ['google-top-ads','load', "google-bottom-ads",'bottom_navigation'])) or tag.name == 'style'

def scrap_lesson(endpoint):
    source=requests.get(base_url+endpoint,
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15)
    soup=BeautifulSoup(source.text,'html')

    lesson=soup.find("div",id='mainContent')

    for lesson_contents in  lesson.find_all(check_classes_ids):
        lesson_contents.decompose()

    print(lesson) 
scrap_lesson(endpoint)