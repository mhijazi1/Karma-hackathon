from clarifai_basic import ClarifaiCustomModel

# assumes environment variables are set.
clarifai_api = ClarifaiCustomModel(
    "Qu6z2uKlfDgqa7Atn1HlOBa3pakRBQHflQicLNr_",
    "8WgQ8D4Dp9IW1JilxEfjXjgg1geq1zpaeT3P7Rk3")

result = clarifai_api.predict('http://www.bodyshopzone.com/archives/collision/side_impact_1/cxeqia01apr_Equinox_tbone.jpg', 'dent')
print("Dent: ")
print(result)
#TGhikOhhzTI/AAAAAAAAAPo/nYmF9hULrCU/s1600/IMG_1437.JPG', 'scratch')

#print("Scratch: ")
#print(result)
result = clarifai_api.predict('http://www.bodyshopzone.com/archives/collision/side_impact_1/cxeqia01apr_Equinox_tbone.jpg', 'perfect')

print("Perfect: ")
print(result)
