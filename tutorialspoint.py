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
'Learn MySQL': [
{'name': 'MySQL - Home', 'url': '/mysql/index.htm' },
{'name': 'MySQL - Introduction', 'url': '/mysql/mysql-introduction.htm' },
{'name': 'MySQL - Installation', 'url': '/mysql/mysql-installation.htm' },
{'name': 'MySQL - Administration', 'url': '/mysql/mysql-administration.htm' },
{'name': 'MySQL - PHP Syntax', 'url': '/mysql/mysql-php-syntax.htm' },
{'name': 'MySQL - Connection', 'url': '/mysql/mysql-connection.htm' },
{'name': 'MySQL - Create Database', 'url': '/mysql/mysql-create-database.htm' },
{'name': 'MySQL - Drop Database', 'url': '/mysql/mysql-drop-database.htm' },
{'name': 'MySQL - Select Database', 'url': '/mysql/mysql-select-database.htm' },
{'name': 'MySQL - Data Types', 'url': '/mysql/mysql-data-types.htm' },
{'name': 'MySQL - Create Tables', 'url': '/mysql/mysql-create-tables.htm' },
{'name': 'MySQL - Drop Tables', 'url': '/mysql/mysql-drop-tables.htm' },
{'name': 'MySQL - Insert Query', 'url': '/mysql/mysql-insert-query.htm' },
{'name': 'MySQL - Select Query', 'url': '/mysql/mysql-select-query.htm' },
{'name': 'MySQL - Where Clause', 'url': '/mysql/mysql-where-clause.htm' },
{'name': 'MySQL - Update Query', 'url': '/mysql/mysql-update-query.htm' },
{'name': 'MySQL - Delete Query', 'url': '/mysql/mysql-delete-query.htm' },
{'name': 'MySQL - Like Clause', 'url': '/mysql/mysql-like-clause.htm' },
{'name': 'MySQL - Sorting Results', 'url': '/mysql/mysql-sorting-results.htm' },
{'name': 'MySQL - Using Join', 'url': '/mysql/mysql-using-joins.htm' },
{'name': 'MySQL - NULL Values', 'url': '/mysql/mysql-null-values.htm' },
{'name': 'MySQL - Regexps', 'url': '/mysql/mysql-regexps.htm' },
{'name': 'MySQL - Transactions', 'url': '/mysql/mysql-transactions.htm' },
{'name': 'MySQL - Alter Command', 'url': '/mysql/mysql-alter-command.htm' },
{'name': 'MySQL - Indexes', 'url': '/mysql/mysql-indexes.htm' },
{'name': 'MySQL - Temporary Tables', 'url': '/mysql/mysql-temporary-tables.htm' },
{'name': 'MySQL - Clone Tables', 'url': '/mysql/mysql-clone-tables.htm' },
{'name': 'MySQL - Database Info', 'url': '/mysql/mysql-database-info.htm' },
{'name': 'MySQL - Using Sequences', 'url': '/mysql/mysql-using-sequences.htm' },
{'name': 'MySQL - Handling Duplicates', 'url': '/mysql/mysql-handling-duplicates.htm' },
{'name': 'MySQL - SQL Injection', 'url': '/mysql/mysql-sql-injection.htm' },
{'name': 'MySQL - Database Export', 'url': '/mysql/mysql-database-export.htm' },
{'name': 'MySQL - Database Import', 'url': '/mysql/mysql-database-import.htm' },
],
'MySQL Useful Resources': [
{'name': 'MySQL - Useful Functions', 'url': '/mysql/mysql-useful-functions.htm' },
{'name': 'MySQL - Statements Reference', 'url': '/mysql/mysql_statements_reference.htm' },
{'name': 'MySQL - Quick Guide', 'url': '/mysql/mysql-quick-guide.htm' },
{'name': 'MySQL - Useful Resources', 'url': '/mysql/mysql-useful-resources.htm' },
{'name': 'MySQL - Discussion', 'url': '/mysql/mysql-discussion.htm' },
],
}
    scrap_lessons(sections)


# python, java
course_name = "Mysql"
tutorial = "mysql"
base_url="https://www.tutorialspoint.com"


# scrap_sections()
start_scraping_lessons()