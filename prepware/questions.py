import requests
import certifi
import base64
import time
import os

class Questions:
    def __init__(self, queno, question, imgquestion, imgrb1, imgrb2, imgrb3, imgrb4, rb1, rb2, rb3, rb4, explanation, answer, imgexp, part, mode):
        self.queno = queno
        self.question = question
        self.imgrb1 = imgrb1
        self.imgrb2 = imgrb2
        self.imgrb3 = imgrb3
        self.imgrb4 = imgrb4
        self.imgquestion = imgquestion
        self.rb1 = rb1
        self.rb2 = rb2
        self.rb3 = rb3
        self.rb4 = rb4
        self.explanation = explanation
        self.answer = answer
        self.imgexp = imgexp
        self.part = part
        self.mode = mode

def prepare_data(question_list, subject_slug):
    for question in question_list:
        print()
        question_list = {
            "chapter": subject_slug,
            "question": [],
            "options": [],
            "correct_answers": [],
            "description": []
        }


        if question.question:
            question_list["question"].append({"p": question.question })
        elif question.imgquestion:
            question_list["question"].append({"image": image_to_base64(question.imgquestion) })

        if question.rb1:
            question_list["options"].append([{"p": question.rb1 }])
        elif question.imgrb1 :
            question_list["options"].append([{"image": image_to_base64(question.imgrb1)}])
        
        if question.rb2:
            question_list["options"].append([{"p": question.rb2 }])
        elif question.imgrb2 :
            question_list["options"].append([{"image": image_to_base64(question.imgrb2)}])
        
        if question.rb3:
            question_list["options"].append([{"p": question.rb3 }])
        elif question.imgrb3 :
            question_list["options"].append([{"image": image_to_base64(question.imgrb3)}])
        
        if question.rb4:
            question_list["options"].append([{"p": question.rb4 }])
        elif question.imgrb4 :
            question_list["options"].append([{"image": image_to_base64(question.imgrb4)}])

        if question.answer == 'a':
            question_list["correct_answers"].append(0)
        elif question.answer == 'b':
            question_list["correct_answers"].append(1)
        elif question.answer == 'c':
            question_list["correct_answers"].append(2)
        elif question.answer == 'd':
            question_list["correct_answers"].append(3)

        if question.explanation:
            question_list["description"].append({"p": question.explanation })
        elif question.imgexp :
            question_list["description"].append({"image": image_to_base64(question.imgexp)})


        # print(login().text)
        print(question_list)
        print("Question Number:", question.queno)
        # print("Question:", question.question)
        print( add_quiz(question_list).text)
        time.sleep(10)
    return 1


########################################################################################################
def add_quiz(question):
    data = {'url': question}

    # headers = {
    #     # localhost
    #     # 'Authorization': 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAiLCJpYXQiOjE2ODkxNTE0NDcsIm5iZiI6MTY4OTE1MTQ0NywiZXhwIjoxNzUyMjIzNDQ3LCJkYXRhIjp7InVzZXIiOnsiaWQiOiIzIn19fQ.KDap7rFKvGNMQoZKz8WfFZ6WDjsL-OwAa8ZK_x_8_Z0',
    #     # dashencon
    #     # 'Authorization': 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL2Rhc2hlbmNvbi5jb20vdGVzdCIsImlhdCI6MTY4OTE2MDYyMCwibmJmIjoxNjg5MTYwNjIwLCJleHAiOjE3NTIyMzI2MjAsImRhdGEiOnsidXNlciI6eyJpZCI6IjEyIn19fQ.m6jgrjTzXzyOV7BG1xi782RmnGMjbkMA5igY0q5ie_k',
    #     # datascienceplc
    #     'Authorization': 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL2RhdGFzY2llbmNlcGxjLmNvbSIsImlhdCI6MTY4OTE3MzQ5MSwibmJmIjoxNjg5MTczNDkxLCJleHAiOjE3NTIyNDU0OTEsImRhdGEiOnsidXNlciI6eyJpZCI6IjEifX19',
    # }

    headers = {
        'Authorization': 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL2RhdGFzY2llbmNlcGxjLmNvbSIsImlhdCI6MTY4OTE3Njc1MywibmJmIjoxNjg5MTc2NzUzLCJleHAiOjE3NTIyNDg3NTMsImRhdGEiOnsidXNlciI6eyJpZCI6IjEifX19.KxRGq62IH3GmafLFj-evYBCbVh1LWbKWu-E-CDZK8LA',
        "Content-Type": "application/json",
        "User-Agent": "PostmanRuntime/7.32.3"  # Replace with an appropriate user agent
    }
    # return requests.post("http://localhost:8080/api/ds_quiz/v1/contribute",
    # return requests.post("https://dashencon.com/test/api/ds_quiz/v1/contribute",
    return requests.post("https://datascienceplc.com/api/ds_quiz/v1/contribute",
        # proxies={'http': '222.255.169.74:8080'},
        timeout=15, json = question, headers=headers, verify=certifi.where()
        )

########################################################################################################
def login():
    data = {
                "username":"esubalew.a2009@gmail.com",
                "password": "Herdseb@1",
                "login_with": "email_password"
            }

    headers = {
        "Content-Type": "application/json",
        "User-Agent": "PostmanRuntime/7.32.3"  # Replace with an appropriate user agent
    }
    return requests.post("https://datascienceplc.com/api/auth/v1/token",
        timeout=15, json = data, headers=headers, verify=certifi.where()
        )
def image_to_base64(img_data):

    if(isinstance(img_data, str)):
        current_dir = os.path.dirname(os.path.abspath(__file__))        
        image_path = os.path.join(current_dir, "drawable/"+img_data+".png")
        if not os.path.exists(image_path):
            image_path = os.path.join(current_dir, "drawable/"+img_data+".jpg")

        if os.path.exists(image_path):
            with open(image_path, "rb") as image_file:
                encoded_string = base64.b64encode(image_file.read())

            base64_image = encoded_string.decode("utf-8")
            return base64_image
            # return "IMAGE"
        else:
            return "Image-file-does-not-exist"

    return None

    
