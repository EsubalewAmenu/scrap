from bs4 import BeautifulSoup
import requests
import time


# python, java
course_name = "Python"
tutorial = "python"
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
    'Basic Tutorial': [
        {'name': 'Home', 'url': '/python/index.htm' },
        {'name': 'Overview', 'url': '/python/python_overview.htm' },
        {'name': 'Environment Setup', 'url': '/python/python_environment.htm' },
        {'name': 'Basic Syntax', 'url': '/python/python_basic_syntax.htm' },
        {'name': 'Comments', 'url': '/python/python_comments.htm' },
        {'name': 'Variables', 'url': '/python/python_variables.htm' },
        {'name': 'Data Types', 'url': '/python/python_data_types.htm' },
        {'name': 'Operators', 'url': '/python/python_operators.htm' },
        {'name': 'Decision Making', 'url': '/python/python_decision_making.htm' },
        {'name': 'Loops', 'url': '/python/python_loops.htm' },
        {'name': 'Numbers', 'url': '/python/python_numbers.htm' },
        {'name': 'Strings', 'url': '/python/python_strings.htm' },
        {'name': 'Lists', 'url': '/python/python_lists.htm' },
        {'name': 'Tuples', 'url': '/python/python_tuples.htm' },
        {'name': 'Dictionary', 'url': '/python/python_dictionary.htm' },
        {'name': 'Date & Time', 'url': '/python/python_date_time.htm' },
        {'name': 'Functions', 'url': '/python/python_functions.htm' },
        {'name': 'Modules', 'url': '/python/python_modules.htm' },
        {'name': 'Files I/O', 'url': '/python/python_files_io.htm' },
        {'name': 'Exceptions', 'url': '/python/python_exceptions.htm' },
    ],
    'Advanced Tutorial': [
        {'name': 'Classes/Objects', 'url': '/python/python_classes_objects.htm' },
        {'name': 'Reg Expressions', 'url': '/python/python_reg_expressions.htm' },
        {'name': 'CGI Programming', 'url': '/python/python_cgi_programming.htm' },
        {'name': 'Database Access', 'url': '/python/python_database_access.htm' },
        {'name': 'Networking', 'url': '/python/python_networking.htm' },
        {'name': 'Sending Email', 'url': '/python/python_sending_email.htm' },
        {'name': 'Multithreading', 'url': '/python/python_multithreading.htm' },
        {'name': 'XML Processing', 'url': '/python/python_xml_processing.htm' },
        {'name': 'GUI Programming', 'url': '/python/python_gui_programming.htm' },
        {'name': 'Further Extensions', 'url': '/python/python_further_extensions.htm' },
    ],
    ' Useful Resources': [
        {'name': 'Questions and Answers', 'url': '/python/python_questions_answers.htm' },
        {'name': 'Quick Guide', 'url': '/python/python_quick_guide.htm' },
        {'name': 'Tools/Utilities', 'url': '/python/python_tools_utilities.htm' },
        {'name': 'Useful Resources', 'url': '/python/python_useful_resources.htm' },
        {'name': 'Discussion', 'url': '/python/python_discussion.htm' },
    ],
}




def add_scrap_content_to_db(tutorial, section, lesson, content):
    data = {'tutorial': tutorial,'section': section,'lesson': lesson,'content': content}
    # return requests.post("https://ds.localhost/wp-json/ds_lc/v1/lesson/add",
    return requests.post("https://dashencon.com/test/wp-json/ds_lc/v1/lesson/add",
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