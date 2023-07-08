import base64
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

def print_data(question_list):
    for question in question_list:
        print("Question Number:", question.queno)
        print("Question:", question.question + image_to_base64(question.imgquestion) )
        # print("Image Question:", question.imgquestion)
        print("RB1:", question.rb1 + image_to_base64(question.imgrb1))
        print("RB2:", question.rb2 + image_to_base64(question.imgrb2))
        print("RB3:", question.rb3 + image_to_base64(question.imgrb3))
        print("RB4:", question.rb4 + image_to_base64(question.imgrb4))
        # print("Image RB1:", question.imgrb1)
        # print("Image RB2:", question.imgrb2)
        # print("Image RB3:", question.imgrb3)
        # print("Image RB4:", question.imgrb4)

        if(question.answer == 'a'):
            print("Answer:", 0)
        elif(question.answer == 'b'):
            print("Answer:", 1)
        elif(question.answer == 'c'):
            print("Answer:", 2)
        elif(question.answer == 'd'):
            print("Answer:", 3)
        else:
            print("NoAnswer")

        print("Explanation:", question.explanation + image_to_base64(question.imgexp))
        print("Part:", question.part)
        print("Mode:", question.mode)
        print()
        
        

def image_to_base64(img_data):

    if(isinstance(img_data, str)):
        current_dir = os.path.dirname(os.path.abspath(__file__))        
        image_path = os.path.join(current_dir, "drawable/"+img_data+".png")
        if os.path.exists(image_path):
            with open(image_path, "rb") as image_file:
                encoded_string = base64.b64encode(image_file.read())

            base64_image = encoded_string.decode("utf-8")
            return base64_image
            return "IMAGE"
        else:
            return "Image-file-does-not-exist"

    return "NO_IMAGE"

    
