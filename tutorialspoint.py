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

def scrap_lesson(endpoint):
    source=requests.get(base_url+endpoint,
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15)
    soup=BeautifulSoup(source.text,'html')

    lesson=soup.find("div",id='mainContent')

    jump_class_id = ['google-top-ads','top-ad-heading','mui-container-fluid','load','clear','clearer','bottom_navigation','google-bottom-ads']

    lesson_contents=lesson.find_all(['h1', 'h2', 'h3','hr','br','p','pre','ul','blockquote'])
    print(len(lesson_contents))

    for content in lesson_contents:
        print(content)
        # ids = []
        # classes = []

        # try:
        #     ids = content["id"]
        # except:
        #     pass

        # try:
        #     classes = content['class']
        # except:
        #     pass

        # # check_ids = ids in jump_class_id 
        # # check_clases = any(item in jump_class_id for item in classes)

        # # if check_ids is True or check_clases is True:
        # print("jump", ids,classes)
        #     pass
        # else:
        #     print("this will be added", ids,classes)


scrap_lesson(endpoint)