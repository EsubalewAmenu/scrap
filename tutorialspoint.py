from bs4 import BeautifulSoup
import requests
import time


import certifi

# python, java
course_name = "Artificial intelligence with python"
tutorial = "artificial_intelligence_with_python"
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
        timeout=15, verify=certifi.where())
  
    soup=BeautifulSoup(source.text,'html')

    contents=soup.find("div",id='mainContent')

    for content in  contents.find_all(check_classes_ids):
        content.decompose()

    return ''.join([str(x) for x in contents.children])
    # return [content for content in contents.children]

sections = {
'AI with Python Tutorial': [
{'name': 'Home', 'url': '/artificial_intelligence_with_python/index.htm' },
{'name': 'AI with Python – Primer Concepts', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_primer_concepts.htm' },
{'name': 'AI with Python – Getting Started', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_getting_started.htm' },
{'name': 'AI with Python – Machine Learning', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_machine_learning.htm' },
{'name': 'AI with Python – Data Preparation', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_data_preparation.htm' },
{'name': 'Supervised Learning: Classification', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_supervised_learning_classification.htm' },
{'name': 'Supervised Learning: Regression', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_supervised_learning_regression.htm' },
{'name': 'AI with Python – Logic Programming', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_logic_programming.htm' },
{'name': 'Unsupervised Learning: Clustering', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_unsupervised_learning_clustering.htm' },
{'name': 'Natural Language Processing', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_natural_language_processing.htm' },
{'name': 'AI with Python – NLTK Package', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_nltk_package.htm' },
{'name': 'Analyzing Time Series Data', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_analyzing_time_series_data.htm' },
{'name': 'AI with Python – Speech Recognition', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_speech_recognition.htm' },
{'name': 'AI with Python – Heuristic Search', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_heuristic_search.htm' },
{'name': 'AI with Python – Gaming', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_gaming.htm' },
{'name': 'AI with Python – Neural Networks', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_neural_networks.htm' },
{'name': 'Reinforcement Learning', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_reinforcement_learning.htm' },
{'name': 'AI with Python – Genetic Algorithms', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_genetic_algorithms.htm' },
{'name': 'AI with Python – Computer Vision', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_computer_vision.htm' },
{'name': 'AI with Python – Deep Learning', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_deep_learning.htm' },
{'name': 'AI with Python – Quick Guide', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_quick_guide.htm' },
{'name': 'AI with Python – Useful Resources', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_useful_resources.htm' },
{'name': 'AI with Python – Discussion', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_discussion.htm' },
{'name': 'UPSC IAS Exams Notes', 'url': '/upsc_ias_exams.htm' },
{'name': 'Developer\'s Best Practices', 'url': '/developers_best_practices/index.htm' },
{'name': 'Questions and Answers', 'url': '/questions_and_answers.htm' },
{'name': 'Effective Resume Writing', 'url': '/effective_resume_writing.htm' },
{'name': 'HR Interview Questions', 'url': '/hr_interview_questions/index.htm' },
{'name': 'Computer Glossary', 'url': '/computer_glossary.htm' },
{'name': 'Who is Who', 'url': '/computer_whoiswho.htm' },
],
'AI with Python Resources': [
{'name': 'AI with Python – Quick Guide', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_quick_guide.htm' },
{'name': 'AI with Python – Useful Resources', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_useful_resources.htm' },
{'name': 'AI with Python – Discussion', 'url': '/artificial_intelligence_with_python/artificial_intelligence_with_python_discussion.htm' },
],
}




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

# scrap_lesson(endpoint)