from clarifai_basic import ClarifaiCustomModel

import sys


if len(sys.argv) < 2:
    print("please provide a valid URL or File Path")
    print("syntax: python .\predict.py [URL|File]")
    exit()

# assumes environment variables are set.
clarifai_api = ClarifaiCustomModel(
    "Qu6z2uKlfDgqa7Atn1HlOBa3pakRBQHflQicLNr_",
    "8WgQ8D4Dp9IW1JilxEfjXjgg1geq1zpaeT3P7Rk3")

url = sys.argv[1]

result = clarifai_api.predict(url, 'perfect')

perfect = result["urls"][0]["score"]

result = clarifai_api.predict(url, 'dent')

dent = result["urls"][0]["score"]

output = {
    "url": url,
    "state": "undef",
    "score": 0
}
if dent > perfect:
    output["state"] = "dent"
    output["score"] = dent
else:
    output["state"] = "perfect"
    output["score"] = perfect

print(output)
