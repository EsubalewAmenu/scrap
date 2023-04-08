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


def start_scraping_lessons(): 
    sections = {
'Basics': [
{'name': 'C++ Home', 'url': '/cplusplus/index.htm' },
{'name': 'C++ Overview', 'url': '/cplusplus/cpp_overview.htm' },
{'name': 'C++ Environment Setup', 'url': '/cplusplus/cpp_environment_setup.htm' },
{'name': 'C++ Basic Syntax', 'url': '/cplusplus/cpp_basic_syntax.htm' },
{'name': 'C++ Comments', 'url': '/cplusplus/cpp_comments.htm' },
{'name': 'C++ Data Types', 'url': '/cplusplus/cpp_data_types.htm' },
{'name': 'C++ Variable Types', 'url': '/cplusplus/cpp_variable_types.htm' },
{'name': 'C++ Variable Scope', 'url': '/cplusplus/cpp_variable_scope.htm' },
{'name': 'C++ Constants/Literals', 'url': '/cplusplus/cpp_constants_literals.htm' },
{'name': 'C++ Modifier Types', 'url': '/cplusplus/cpp_modifier_types.htm' },
{'name': 'C++ Storage Classes', 'url': '/cplusplus/cpp_storage_classes.htm' },
{'name': 'C++ Operators', 'url': '/cplusplus/cpp_operators.htm' },
{'name': 'C++ Loop Types', 'url': '/cplusplus/cpp_loop_types.htm' },
{'name': 'C++ Decision Making', 'url': '/cplusplus/cpp_decision_making.htm' },
{'name': 'C++ Functions', 'url': '/cplusplus/cpp_functions.htm' },
{'name': 'C++ Numbers', 'url': '/cplusplus/cpp_numbers.htm' },
{'name': 'C++ Arrays', 'url': '/cplusplus/cpp_arrays.htm' },
{'name': 'C++ Strings', 'url': '/cplusplus/cpp_strings.htm' },
{'name': 'C++ Pointers', 'url': '/cplusplus/cpp_pointers.htm' },
{'name': 'C++ References', 'url': '/cplusplus/cpp_references.htm' },
{'name': 'C++ Date & Time', 'url': '/cplusplus/cpp_date_time.htm' },
{'name': 'C++ Basic Input/Output', 'url': '/cplusplus/cpp_basic_input_output.htm' },
{'name': 'C++ Data Structures', 'url': '/cplusplus/cpp_data_structures.htm' },
],
'Object Oriented': [
{'name': 'C++ Classes & Objects', 'url': '/cplusplus/cpp_classes_objects.htm' },
{'name': 'C++ Inheritance', 'url': '/cplusplus/cpp_inheritance.htm' },
{'name': 'C++ Overloading', 'url': '/cplusplus/cpp_overloading.htm' },
{'name': 'C++ Polymorphism', 'url': '/cplusplus/cpp_polymorphism.htm' },
{'name': 'C++ Abstraction', 'url': '/cplusplus/cpp_data_abstraction.htm' },
{'name': 'C++ Encapsulation', 'url': '/cplusplus/cpp_data_encapsulation.htm' },
{'name': 'C++ Interfaces', 'url': '/cplusplus/cpp_interfaces.htm' },
],
'Advanced': [
{'name': 'C++ Files and Streams', 'url': '/cplusplus/cpp_files_streams.htm' },
{'name': 'C++ Exception Handling', 'url': '/cplusplus/cpp_exceptions_handling.htm' },
{'name': 'C++ Dynamic Memory', 'url': '/cplusplus/cpp_dynamic_memory.htm' },
{'name': 'C++ Namespaces', 'url': '/cplusplus/cpp_namespaces.htm' },
{'name': 'C++ Templates', 'url': '/cplusplus/cpp_templates.htm' },
{'name': 'C++ Preprocessor', 'url': '/cplusplus/cpp_preprocessor.htm' },
{'name': 'C++ Signal Handling', 'url': '/cplusplus/cpp_signal_handling.htm' },
{'name': 'C++ Multithreading', 'url': '/cplusplus/cpp_multithreading.htm' },
{'name': 'C++ Web Programming', 'url': '/cplusplus/cpp_web_programming.htm' },
],
'Useful Resources': [
{'name': 'C++ Questions and Answers', 'url': '/cplusplus/cpp_questions_answers.htm' },
{'name': 'C++ Quick Guide', 'url': '/cplusplus/cpp_quick_guide.htm' },
{'name': 'C++ Object Oriented', 'url': '/cplusplus/cpp_object_oriented.htm' },
{'name': 'C++ STL Tutorial', 'url': '/cplusplus/cpp_stl_tutorial.htm' },
{'name': 'C++ Standard Library', 'url': '/cplusplus/cpp_standard_library.htm' },
{'name': 'C++ Useful Resources', 'url': '/cplusplus/cpp_useful_resources.htm' },
{'name': 'C++ Discussion', 'url': '/cplusplus/cpp_discussion.htm' },
],
}
    scrap_lessons(sections)


# python, java
course_name = "C++"
tutorial = "cplusplus"
base_url="https://www.tutorialspoint.com"


# scrap_sections()
start_scraping_lessons()