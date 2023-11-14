from bs4 import BeautifulSoup
import requests
import time
import certifi

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


########################################################################################################
def add_category_url_to_db(url):
    data = {'url': url}

    headers = {
        'username': 'esubalew11@gmail.com',
        'password': '105672864563817565',
        'login_with': 'google'
    }

    return requests.post("http://localhost:8080/api/ds_her/v1/category/add",
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15, json = data, headers=headers, verify=certifi.where())

########################################################################################################
def scrap_urls(parent_urls):
    for index, parent_url in enumerate(parent_urls):
        print(index, parent_url)
        

        options = Options()
        options.add_argument("--incognito")

        driver = webdriver.Chrome(options=options)
        driver.get(parent_url)
        # driver.get("file:///home/esubalew/Desktop/esubalew/python/scraping/test.html")
        time.sleep(10) # wait for the page to load
        soup = BeautifulSoup(driver.page_source, "html.parser")


        # source=requests.get(parent_url,
        #  verify=certifi.where(),
        #     # proxies={'http': '222.255.169.74:8080'},
        #     timeout=5)
        # soup=BeautifulSoup(source.text,'html')

        # find all <a> tags that have a "href" attribute starting with "https://www.allrecipes.com/recipes/"
        links = [a['href'] for a in soup.find_all('a', href=lambda href: href and href.startswith('https://www.allrecipes.com/recipes/'))]

        print(links)
        for link in links:
            category_url = link[len('https://www.allrecipes.com/recipes/'):].strip()
            if category_url:
                print(add_category_url_to_db(category_url), category_url)

    time.sleep(10)
        # print("total links ", len(links))
########################################################################################################33

parent_urls = [
"https://www.allrecipes.com/recipes/215/salad/pasta-salad/",
"https://www.allrecipes.com/recipes/15328/main-dish/savory-pies/pasties/",
"https://www.allrecipes.com/recipes/346/bread/pastries/",
"https://www.allrecipes.com/recipes/435/appetizers-and-snacks/dips-and-spreads/pate/",
"https://www.allrecipes.com/recipes/14964/desserts/specialty-desserts/pavlova/",
"https://www.allrecipes.com/recipes/852/desserts/cookies/peanut-butter-cookies/",
"https://www.allrecipes.com/recipes/2411/desserts/pies/pecan-pie/",
"https://www.allrecipes.com/recipes/13343/side-dish/sauces-and-condiments/sauces/pesto/",
"https://www.allrecipes.com/recipes/1951/everyday-cooking/more-meal-ideas/pet-food/",
"https://www.allrecipes.com/recipes/17621/side-dish/sauces-and-condiments/canning-and-preserving/pickled/",
"https://www.allrecipes.com/recipes/1570/everyday-cooking/on-the-go/picnic/",
"https://www.allrecipes.com/recipes/818/desserts/pies/pie-crusts/",
"https://www.allrecipes.com/recipes/22857/main-dish/dumplings/pierogies/",
"https://www.allrecipes.com/recipes/367/desserts/pies/",
"https://www.allrecipes.com/recipes/250/main-dish/pizza/",
"https://www.allrecipes.com/recipes/1035/bread/pizza-dough-and-crusts/",
"https://www.allrecipes.com/recipes/16769/side-dish/grains/polenta/",
"https://www.allrecipes.com/recipes/16051/appetizers-and-snacks/snacks/popcorn/",
"https://www.allrecipes.com/recipes/14912/bread/quick-bread/popovers-and-yorkshire-pudding/",
"https://www.allrecipes.com/recipes/205/meat-and-poultry/pork/",
"https://www.allrecipes.com/recipes/674/main-dish/pork/pork-chops/",
"https://www.allrecipes.com/recipes/676/meat-and-poultry/pork/ribs/",
"https://www.allrecipes.com/recipes/17198/meat-and-poultry/pork/shoulder/",
"https://www.allrecipes.com/recipes/1014/meat-and-poultry/pork/tenderloin/",
"https://www.allrecipes.com/recipes/2268/main-dish/savory-pies/pot-pie/",
"https://www.allrecipes.com/recipes/1469/main-dish/beef/pot-roast/",
"https://www.allrecipes.com/recipes/1545/side-dish/potatoes/potato-pancakes/",
"https://www.allrecipes.com/recipes/217/salad/potato-salad/",
"https://www.allrecipes.com/recipes/1552/soups-stews-and-chili/soup/vegetable-soup/potato-soup/",
"https://www.allrecipes.com/recipes/1536/everyday-cooking/on-the-go/potluck/",
"https://www.allrecipes.com/recipes/395/desserts/cakes/pound-cake/",
"https://www.allrecipes.com/recipes/16220/bread/yeast-bread/pretzels/",
"https://www.allrecipes.com/recipes/1012/meat-and-poultry/beef/rib-roast/",
"https://www.allrecipes.com/recipes/16543/main-dish/pork/pulled-pork/",
"https://www.allrecipes.com/recipes/347/bread/quick-bread/pumpkin-bread/",
"https://www.allrecipes.com/recipes/819/desserts/pies/pumpkin-pie/",
"https://www.allrecipes.com/recipes/969/appetizers-and-snacks/nuts-and-seeds/pumpkin-seeds/",
"https://www.allrecipes.com/recipes/136/drinks/punch/",
"https://www.allrecipes.com/recipes/1444/holidays-and-events/purim/",
"https://www.allrecipes.com/recipes/1905/world-cuisine/latin-american/mexican/main-dishes/quesadillas/",
"https://www.allrecipes.com/recipes/16793/main-dish/quiche/",
"https://www.allrecipes.com/recipes/1947/everyday-cooking/quick-and-easy/",
"https://www.allrecipes.com/recipes/15592/ingredients/whole-grains/quinoa/",
"https://www.allrecipes.com/recipes/195/holidays-and-events/ramadan/",
"https://www.allrecipes.com/recipes/16855/pasta-and-noodles/pasta-by-shape/ravioli/",
"https://www.allrecipes.com/recipes/16337/healthy-recipes/raw-food-diet/",
"https://www.allrecipes.com/recipes/17873/side-dish/beans-and-peas/refried-beans/",
"https://www.allrecipes.com/recipes/13378/side-dish/sauces-and-condiments/relishes/",
"https://www.allrecipes.com/recipes/12953/desserts/pies/fruit-pies/rhubarb-pie/",
"https://www.allrecipes.com/recipes/261/main-dish/ribs/",
"https://www.allrecipes.com/recipes/1004/main-dish/casseroles/rice/",
"https://www.allrecipes.com/recipes/14364/side-dish/rice/pilaf/",
"https://www.allrecipes.com/recipes/14442/desserts/custards-and-puddings/rice-pudding/",
"https://www.allrecipes.com/recipes/14362/main-dish/rice/risotto/",
"https://www.allrecipes.com/recipes/1991/everyday-cooking/on-the-go/road-trip-snacks/",
"https://www.allrecipes.com/recipes/258/main-dish/roasts/",
"https://www.allrecipes.com/recipes/196/holidays-and-events/rosh-hashanah/",
"https://www.allrecipes.com/recipes/210/side-dish/sauces-and-condiments/salad-dressings/",
"https://www.allrecipes.com/recipes/96/salad/Salads",
"https://www.allrecipes.com/recipes/17656/main-dish/beef/salisbury-steak/",
"https://www.allrecipes.com/recipes/416/seafood/fish/salmon/",
"https://www.allrecipes.com/recipes/436/appetizers-and-snacks/dips-and-spreads/salsa/",
"https://www.allrecipes.com/recipes/17776/appetizers-and-snacks/pastries/samosas/",
"https://www.allrecipes.com/recipes/16416/desserts/cookies/sandwich-cookies/",
"https://www.allrecipes.com/recipes/251/main-dish/sandwiches/",
"https://www.allrecipes.com/recipes/242/drinks/sangria/",
"https://www.allrecipes.com/recipes/16546/meat-and-poultry/sausage/",
"https://www.allrecipes.com/recipes/1997/bread/quick-bread/scones/",
"https://www.allrecipes.com/recipes/985/holidays-and-events/passover/seder/",
"https://www.allrecipes.com/recipes/17624/everyday-cooking/vegetarian/protein/seitan/",
"https://www.allrecipes.com/recipes/2270/main-dish/savory-pies/shepherds-pie/",
"https://www.allrecipes.com/recipes/855/desserts/cookies/butter-cookies/shortbread-cookies/",
"https://www.allrecipes.com/recipes/15066/desserts/cakes/shortcake/",
"https://www.allrecipes.com/recipes/16685/main-dish/seafood/shrimp/shrimp-and-grits/",
"https://www.allrecipes.com/recipes/15853/main-dish/seafood/shrimp/shrimp-scampi/",
"https://www.allrecipes.com/recipes/81/side-dish/Side Dishes",
"https://www.allrecipes.com/recipes/17640/desserts/pies/slab-pie/",
"https://www.allrecipes.com/recipes/17308/everyday-cooking/more-meal-ideas/mini-foods/main-dishes/sliders/",
"https://www.allrecipes.com/recipes/14930/main-dish/sandwiches/sloppy-joes/",
"https://www.allrecipes.com/recipes/253/everyday-cooking/slow-cooker/",
"https://www.allrecipes.com/recipes/138/drinks/smoothies/",
"https://www.allrecipes.com/recipes/16420/desserts/cookies/snickerdoodles/",
"https://www.allrecipes.com/recipes/16369/soups-stews-and-chili/soup/",
"https://www.allrecipes.com/recipes/23455/everyday-cooking/cookware-and-equipment/sous-vide/",
"https://www.allrecipes.com/recipes/505/main-dish/pasta/spaghetti/",
"https://www.allrecipes.com/recipes/17482/side-dish/rice/spanish-rice/",
"https://www.allrecipes.com/recipes/396/desserts/cakes/spice-cake/",
"https://www.allrecipes.com/recipes/1242/appetizers-and-snacks/dips-and-spreads/spinach-dips/",
"https://www.allrecipes.com/recipes/14728/soups-stews-and-chili/soup/beans-and-peas/split-pea-soup/",
"https://www.allrecipes.com/recipes/858/desserts/cookies/butter-cookies/spritz-cookies/",
"https://www.allrecipes.com/recipes/197/holidays-and-events/st-patricks-day/",
"https://www.allrecipes.com/recipes/183/soups-stews-and-chili/stews/",
"https://www.allrecipes.com/recipes/259/main-dish/stir-fry/",
"https://www.allrecipes.com/recipes/12954/desserts/pies/fruit-pies/strawberry-pie/",
"https://www.allrecipes.com/recipes/16357/desserts/cakes/shortcake/strawberry-shortcake/",
"https://www.allrecipes.com/recipes/14906/appetizers-and-snacks/vegetable/mushrooms/stuffed-mushrooms/",
"https://www.allrecipes.com/recipes/13289/main-dish/stuffed-main-dishes/stuffed-bell-peppers/",
"https://www.allrecipes.com/recipes/859/desserts/cookies/sugar-cookies/",
"https://www.allrecipes.com/recipes/931/healthy-recipes/sugar-free/",
"https://www.allrecipes.com/recipes/17498/world-cuisine/asian/japanese/main-dishes/sushi/",
"https://www.allrecipes.com/recipes/822/desserts/pies/sweet-potato-pie/",
"https://www.allrecipes.com/recipes/17320/main-dish/beef/swiss-steak/",
"https://www.allrecipes.com/recipes/17534/salad/taco-salad/",
"https://www.allrecipes.com/recipes/17874/main-dish/tacos/",
"https://www.allrecipes.com/recipes/1569/everyday-cooking/on-the-go/tailgating/",
"https://www.allrecipes.com/recipes/16080/world-cuisine/latin-american/mexican/main-dishes/tamales/",
"https://www.allrecipes.com/recipes/17807/appetizers-and-snacks/tapas/",
"https://www.allrecipes.com/recipes/17661/main-dish/casseroles/vegetable/tater-tots/",
"https://www.allrecipes.com/recipes/16777/everyday-cooking/vegetarian/protein/tempeh/",
"https://www.allrecipes.com/recipes/16815/main-dish/pasta/tetrazzini/",
"https://www.allrecipes.com/recipes/17502/us-recipes/tex-mex/",
"https://www.allrecipes.com/recipes/198/holidays-and-events/thanksgiving/",
"https://www.allrecipes.com/recipes/14691/desserts/cookies/thumbprint-cookies/",
"https://www.allrecipes.com/recipes/375/desserts/specialty-desserts/tiramisu/",
"https://www.allrecipes.com/recipes/401/desserts/candy/toffee/",
"https://www.allrecipes.com/recipes/270/everyday-cooking/vegetarian/protein/tofu/",
"https://www.allrecipes.com/recipes/15102/salad/vegetable-salads/tomato-salad/",
"https://www.allrecipes.com/recipes/515/pasta-and-noodles/pasta-by-shape/tortellini/",
"https://www.allrecipes.com/recipes/398/desserts/cakes/tortes/",
"https://www.allrecipes.com/recipes/15855/bread/quick-bread/tortillas/",
"https://www.allrecipes.com/recipes/23012/world-cuisine/latin-american/mexican/main-dishes/tostadas/",
"https://www.allrecipes.com/recipes/751/desserts/candy/truffles/",
"https://www.allrecipes.com/recipes/15020/main-dish/casseroles/seafood/tuna/",
"https://www.allrecipes.com/recipes/2809/salad/seafood-salad/tuna-salad/",
"https://www.allrecipes.com/recipes/206/meat-and-poultry/turkey/",
"https://www.allrecipes.com/recipes/15901/meat-and-poultry/turkey/brine/",
"https://www.allrecipes.com/recipes/17251/everyday-cooking/vegetarian/protein/tvp/",
"https://www.allrecipes.com/recipes/11980/desserts/cakes/upside-down-cake/",
"https://www.allrecipes.com/recipes/199/holidays-and-events/valentines-day/",
"https://www.allrecipes.com/recipes/1227/everyday-cooking/vegan/",
"https://www.allrecipes.com/recipes/225/side-dish/vegetables/",
"https://www.allrecipes.com/recipes/1059/fruits-and-vegetables/vegetables/",
"https://www.allrecipes.com/recipes/87/everyday-cooking/vegetarian/",
"https://www.allrecipes.com/recipes/1316/breakfast-and-brunch/waffles/",
"https://www.allrecipes.com/recipes/16932/salad/waldorf-salad/",
"https://www.allrecipes.com/recipes/15509/bread/yeast-bread/whole-grain-bread/wheat-bread/",
"https://www.allrecipes.com/recipes/22590/healthy-recipes/whole30/",
"https://www.allrecipes.com/recipes/16417/desserts/cookies/whoopie-pies/",
"https://www.allrecipes.com/recipes/1097/fruits-and-vegetables/vegetables/squash/winter-squash/",
"https://www.allrecipes.com/recipes/2452/fruits-and-vegetables/vegetables/yams/",
"https://www.allrecipes.com/recipes/339/bread/yeast-bread/",
"https://www.allrecipes.com/recipes/550/pasta-and-noodles/pasta-by-shape/ziti/",
"https://www.allrecipes.com/recipes/348/bread/quick-bread/zucchini-bread/"
]
scrap_urls(parent_urls)

# print(add_category_url_to_db("85/holidays-and-events/"))