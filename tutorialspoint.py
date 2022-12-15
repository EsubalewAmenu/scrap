from bs4 import BeautifulSoup
import requests
import time


# python, java
course_name = "Java"
tutorial = "java"
base_url="https://www.tutorialspoint.com"


########################################################################################################
# source=requests.get(base_url+'/'+tutorial+"/index.htm",
#     # proxies={'http': '222.255.169.74:8080'},
#     timeout=5)
# soup=BeautifulSoup(source.text,'html')

# course_outline=soup.find_all("ul",class_='toc chapters')
# print('{')
# for i in course_outline:
#     section = i.find("li",class_='heading')
#     try:
#         print("'"+section.text.replace(course_name+" ", "")+"': [")

#         for tutors in i.find_all("li",class_=""):
#             a = tutors.find('a')
#             print("{'name': '"+a.text.replace(course_name+" - ", "")+"', 'url': '"+a['href']+"' },")
#         print('],')
#     except:
#         pass
# print('}')
########################################################################################################33

def check_classes_ids(tag):
    return (tag.name == 'div' and (tag.get('class') in [['cover'], ['clear'], ['center-aligned', 'tutorial-menu'], ["mui-container-fluid", "button-borders"], ['clearer']] or tag.get('id') in ['google-top-ads','load', "google-bottom-ads",'bottom_navigation'])) or tag.name == 'style'

def scrap_content(endpoint):
    source=requests.get(base_url+endpoint,
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15)
  
    soup=BeautifulSoup(source.text,'html')

    contents=soup.find("div",id='mainContent')

    for content in  contents.find_all(check_classes_ids):
        content.decompose()

    return ''.join([str(x) for x in contents.children])
    # return [content for content in contents.children]

sections = {
'Tutorial': [
{'name': 'Home', 'url': '/java/index.htm' },
{'name': 'Overview', 'url': '/java/java_overview.htm' },
{'name': 'Environment Setup', 'url': '/java/java_environment_setup.htm' },
{'name': 'Basic Syntax', 'url': '/java/java_basic_syntax.htm' },
{'name': 'Object & Classes', 'url': '/java/java_object_classes.htm' },
{'name': 'Constructors', 'url': '/java/java_constructors.htm' },
{'name': 'Basic Datatypes', 'url': '/java/java_basic_datatypes.htm' },
{'name': 'Variable Types', 'url': '/java/java_variable_types.htm' },
{'name': 'Modifier Types', 'url': '/java/java_modifier_types.htm' },
{'name': 'Basic Operators', 'url': '/java/java_basic_operators.htm' },
{'name': 'Loop Control', 'url': '/java/java_loop_control.htm' },
{'name': 'Decision Making', 'url': '/java/java_decision_making.htm' },
{'name': 'Numbers', 'url': '/java/java_numbers.htm' },
{'name': 'Characters', 'url': '/java/java_characters.htm' },
{'name': 'Strings', 'url': '/java/java_strings.htm' },
{'name': 'Arrays', 'url': '/java/java_arrays.htm' },
{'name': 'Date & Time', 'url': '/java/java_date_time.htm' },
{'name': 'Regular Expressions', 'url': '/java/java_regular_expressions.htm' },
{'name': 'Methods', 'url': '/java/java_methods.htm' },
{'name': 'Files and I/O', 'url': '/java/java_files_io.htm' },
{'name': 'Exceptions', 'url': '/java/java_exceptions.htm' },
{'name': 'Inner classes', 'url': '/java/java_innerclasses.htm' },
],
'Object Oriented': [
{'name': 'Inheritance', 'url': '/java/java_inheritance.htm' },
{'name': 'Overriding', 'url': '/java/java_overriding.htm' },
{'name': 'Polymorphism', 'url': '/java/java_polymorphism.htm' },
{'name': 'Abstraction', 'url': '/java/java_abstraction.htm' },
{'name': 'Encapsulation', 'url': '/java/java_encapsulation.htm' },
{'name': 'Interfaces', 'url': '/java/java_interfaces.htm' },
{'name': 'Packages', 'url': '/java/java_packages.htm' },
],
'Advanced': [
{'name': 'Data Structures', 'url': '/java/java_data_structures.htm' },
{'name': 'Collections', 'url': '/java/java_collections.htm' },
{'name': 'Generics', 'url': '/java/java_generics.htm' },
{'name': 'Serialization', 'url': '/java/java_serialization.htm' },
{'name': 'Networking', 'url': '/java/java_networking.htm' },
{'name': 'Sending Email', 'url': '/java/java_sending_email.htm' },
{'name': 'Multithreading', 'url': '/java/java_multithreading.htm' },
{'name': 'Applet Basics', 'url': '/java/java_applet_basics.htm' },
{'name': 'Documentation', 'url': '/java/java_documentation.htm' },
]
}




def add_scrap_content_to_db(tutorial, section, lesson, content):
    data = {'tutorial': tutorial,'section': section,'lesson': lesson,'content': content}
    return requests.post("https://ds.localhost/wp-json/ds_lc/v1/lesson/add",
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15, json = data,verify=False)

for section in sections:
    for lesson in sections[section]:
        print('lesson name ', lesson['name'],'url',base_url+lesson['url'])
        content = scrap_content(lesson['url'])
        add_to_db = add_scrap_content_to_db(tutorial,section,lesson['name'],content)
        print(section,lesson['name'], add_to_db)
        time.sleep(10)

# scrap_lesson(endpoint)