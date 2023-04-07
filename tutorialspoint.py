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
'Basics Tutorial': [
{'name': 'Home', 'url': '/javascript/index.htm' },
{'name': 'Overview', 'url': '/javascript/javascript_overview.htm' },
{'name': 'Syntax', 'url': '/javascript/javascript_syntax.htm' },
{'name': 'Enabling', 'url': '/javascript/javascript_enabling.htm' },
{'name': 'Placement', 'url': '/javascript/javascript_placement.htm' },
{'name': 'Variables', 'url': '/javascript/javascript_variables.htm' },
{'name': 'Operators', 'url': '/javascript/javascript_operators.htm' },
{'name': 'If...Else', 'url': '/javascript/javascript_ifelse.htm' },
{'name': 'Switch Case', 'url': '/javascript/javascript_switch_case.htm' },
{'name': 'While Loop', 'url': '/javascript/javascript_while_loop.htm' },
{'name': 'For Loop', 'url': '/javascript/javascript_for_loop.htm' },
{'name': 'For...in', 'url': '/javascript/javascript_forin_loop.htm' },
{'name': 'Loop Control', 'url': '/javascript/javascript_loop_control.htm' },
{'name': 'Functions', 'url': '/javascript/javascript_functions.htm' },
{'name': 'Events', 'url': '/javascript/javascript_events.htm' },
{'name': 'Cookies', 'url': '/javascript/javascript_cookies.htm' },
{'name': 'Page Redirect', 'url': '/javascript/javascript_page_redirect.htm' },
{'name': 'Dialog Boxes', 'url': '/javascript/javascript_dialog_boxes.htm' },
{'name': 'Void Keyword', 'url': '/javascript/javascript_void_keyword.htm' },
{'name': 'Page Printing', 'url': '/javascript/javascript_page_printing.htm' },
],
'JavaScript Objects': [
{'name': 'Objects', 'url': '/javascript/javascript_objects.htm' },
{'name': 'Number', 'url': '/javascript/javascript_number_object.htm' },
{'name': 'Boolean', 'url': '/javascript/javascript_boolean_object.htm' },
{'name': 'Strings', 'url': '/javascript/javascript_strings_object.htm' },
{'name': 'Arrays', 'url': '/javascript/javascript_arrays_object.htm' },
{'name': 'Date', 'url': '/javascript/javascript_date_object.htm' },
{'name': 'Math', 'url': '/javascript/javascript_math_object.htm' },
{'name': 'RegExp', 'url': '/javascript/javascript_regexp_object.htm' },
{'name': 'HTML DOM', 'url': '/javascript/javascript_html_dom.htm' },
],
'JavaScript Advanced': [
{'name': 'Error Handling', 'url': '/javascript/javascript_error_handling.htm' },
{'name': 'Validations', 'url': '/javascript/javascript_form_validations.htm' },
{'name': 'Animation', 'url': '/javascript/javascript_animation.htm' },
{'name': 'Multimedia', 'url': '/javascript/javascript_multimedia.htm' },
{'name': 'Debugging', 'url': '/javascript/javascript_debugging.htm' },
{'name': 'Image Map', 'url': '/javascript/javascript_image_map.htm' },
{'name': 'Browsers', 'url': '/javascript/javascript_browsers_handling.htm' },
],
'JavaScript Useful Resources': [
{'name': 'Questions And Answers', 'url': '/javascript/javascript_questions_answers.htm' },
{'name': 'Quick Guide', 'url': '/javascript/javascript_quick_guide.htm' },
{'name': 'Functions', 'url': '/javascript/javascript_builtin_functions.htm' },
{'name': 'Resources', 'url': '/javascript/javascript_useful_resources.htm' },
],
}
    scrap_lessons(sections)


# python, java
course_name = "Javascript"
tutorial = "javascript"
base_url="https://www.tutorialspoint.com"


# scrap_sections()
start_scraping_lessons()