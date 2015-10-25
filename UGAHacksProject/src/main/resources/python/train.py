from clarifai_basic import ClarifaiCustomModel

# assumes environment variables are set.
clarifai_api = ClarifaiCustomModel(
    "Qu6z2uKlfDgqa7Atn1HlOBa3pakRBQHflQicLNr_",
    "8WgQ8D4Dp9IW1JilxEfjXjgg1geq1zpaeT3P7Rk3")
files = ["dent", "perfect"]
for fileName in files:
    f = open("images/" + fileName + ".txt")
    urls = [url.strip() for url in f.readlines()]
    for url in urls:
        print("Training positive " + fileName +": " + url)    
        clarifai_api.positive(url, fileName)
    f.close()
    for other in files:
        if other != fileName:
            f = open("images/" + fileName + ".txt")
            urls = [url.strip() for url in f.readlines()]
            for url in urls:
                print("Training negative " + other +": " + url)
                clarifai_api.positive(url, fileName)
            f.close()
    clarifai_api.train(fileName)
    print("Trained: " + fileName)
