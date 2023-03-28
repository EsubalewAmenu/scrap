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
'Tutorial': [
{'name': 'Home', 'url': '/css/index.htm' },
{'name': 'Introduction', 'url': '/css/what_is_css.htm' },
{'name': 'Syntax', 'url': '/css/css_syntax.htm' },
{'name': 'Inclusion', 'url': '/css/css_inclusion.htm' },
{'name': 'Measurement Units', 'url': '/css/css_measurement_units.htm' },
{'name': 'Colors', 'url': '/css/css_colors.htm' },
{'name': 'Backgrounds', 'url': '/css/css_backgrounds.htm' },
{'name': 'Fonts', 'url': '/css/css_fonts.htm' },
{'name': 'Text', 'url': '/css/css_text.htm' },
{'name': 'Images', 'url': '/css/css_images.htm' },
{'name': 'Links', 'url': '/css/css_links.htm' },
{'name': 'Tables', 'url': '/css/css_tables.htm' },
{'name': 'Borders', 'url': '/css/css_borders.htm' },
{'name': 'Margins', 'url': '/css/css_margins.htm' },
{'name': 'Lists', 'url': '/css/css_lists.htm' },
{'name': 'Padding', 'url': '/css/css_padding.htm' },
{'name': 'Cursors', 'url': '/css/css_cursors.htm' },
{'name': 'Outlines', 'url': '/css/css_outlines.htm' },
{'name': 'Dimension', 'url': '/css/css_dimension.htm' },
{'name': 'Scrollbars', 'url': '/css/css_scrollbars.htm' },
],
'Advanced': [
{'name': 'Visibility', 'url': '/css/css_visibility.htm' },
{'name': 'Positioning', 'url': '/css/css_positioning.htm' },
{'name': 'Layers', 'url': '/css/css_layers.htm' },
{'name': 'Pseudo Classes', 'url': '/css/css_pseudo_classes.htm' },
{'name': 'Pseudo Elements', 'url': '/css/css_pseudo_elements.htm' },
{'name': '@ Rules', 'url': '/css/css_at_rules.htm' },
{'name': 'Text Effects', 'url': '/css/css_text_effects.htm' },
{'name': 'Media Types', 'url': '/css/css_media_types.htm' },
{'name': 'Paged Media', 'url': '/css/css_paged_media.htm' },
{'name': 'Aural Media', 'url': '/css/css_aural_media.htm' },
{'name': 'Printing', 'url': '/css/css_printing.htm' },
{'name': 'Layouts', 'url': '/css/css_layouts.htm' },
{'name': 'Validations', 'url': '/css/css_validations.htm' },
],
'CSS3 Tutorial': [
{'name': 'CSS3 - Tutorial', 'url': '/css/css3_tutorial.htm' },
{'name': 'CSS3 - Rounded Corner', 'url': '/css/css3_rounded_corner.htm' },
{'name': 'CSS3 - Border Images', 'url': '/css/css3_boarder_image.htm' },
{'name': 'CSS3 - Multi Background', 'url': '/css/css3_multi_background.htm' },
{'name': 'CSS3 - Color', 'url': '/css/css3_color.htm' },
{'name': 'CSS3 - Gradients', 'url': '/css/css3_gradients.htm' },
{'name': 'CSS3 - Shadow', 'url': '/css/css3_shadow.htm' },
{'name': 'CSS3 - Text', 'url': '/css/css3_text.htm' },
{'name': 'CSS3 - Web font', 'url': '/css/css3_web_font.htm' },
{'name': 'CSS3 - 2d transform', 'url': '/css/css3_2d_transform.htm' },
{'name': 'CSS3 - 3d transform', 'url': '/css/css3_3d_transform.htm' },
{'name': 'CSS3 - Animation', 'url': '/css/css3_animation.htm' },
{'name': 'CSS3 - Multi columns', 'url': '/css/css3_multi_columns.htm' },
{'name': 'CSS3 - User Interface', 'url': '/css/css3_userinterface.htm' },
{'name': 'CSS3 - Box Sizing', 'url': '/css/css3_box_sizing.htm' },
],
'Responsive': [
{'name': 'Responsive Web Design', 'url': '/css/css_responsive.htm' },
],
'References': [
{'name': 'Questions and Answers', 'url': '/css/css_questions_answers.htm' },
{'name': 'Quick Guide', 'url': '/css/css_quick_guide.htm' },
{'name': 'References', 'url': '/css/css_references.htm' },
{'name': 'Color References', 'url': '/css/css_color_references.htm' },
{'name': 'Web browser References', 'url': '/css/css_web_browser.htm' },
{'name': 'Web safe fonts', 'url': '/css/css_web_fonts.htm' },
{'name': 'Units', 'url': '/css/css_units.htm' },
{'name': 'Animation', 'url': '/css/css_animation.htm' },
],
'tools': [
{'name': 'PX to EM converter', 'url': '/css/css_converter.htm' },
{'name': 'Color Chooser & Animation', 'url': '/css/css_color_picker.htm' },
],
'Resources': [
{'name': 'Useful Resources', 'url': '/css/css_useful_resources.htm' },
{'name': 'Discussion', 'url': '/css/css_discussion.htm' },
],
}
    scrap_lessons(sections)


# python, java
course_name = "CSS"
tutorial = "css"
base_url="https://www.tutorialspoint.com"


# scrap_sections()
start_scraping_lessons()