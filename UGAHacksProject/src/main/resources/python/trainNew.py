from clarifai_basic import ClarifaiCustomModel

import sys

if len(sys.argv) < 4:
    print(
        "syntax: python .\predict.py [URL|File] [Result State] [Good|Bad] [if Bad: expected State")
    exit()

# assumes environment variables are set.
clarifai_api = ClarifaiCustomModel(
    "Qu6z2uKlfDgqa7Atn1HlOBa3pakRBQHflQicLNr_",
    "8WgQ8D4Dp9IW1JilxEfjXjgg1geq1zpaeT3P7Rk3")

possibleStates["dent", "perfect"]
url = sys.argv[1]
state = sys.argv[2].lower
predictResult = sys.argv[3].lower()

if predictResult == "good":
    clarifai_api.positive(url, state)
    for s in states:
        if s != state:
            clarifai_api.negative(url, s)
    clarifai_api.train(state)
if predictResult == "bad":
    expectedState = sys.argv[4].lower()
    clarifai_api.positive(url, expectedState)
    for s in states:
        if s != expectedState:
            clarifai_api.negative(url, s)
    clarifai_api.train(expectedState)


