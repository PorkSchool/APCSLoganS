favoriteList = ["Apple", "Bannana", "Orange", "Grape", "Grapefruit","Tomat"]
print("What is your favorite fruit?")
userChoice = input()
isFavorite = False
for item in favoriteList:
    if userChoice.lower() == item.lower():
        isFavorite = True
        break
print("My favorite Fruits:")
for index, item in enumerate(favoriteList, 1):
    print(f"{index}. {item}")

if isFavorite:
    print(userChoice + " is on my list we have the same favorites")
else:
    print("Your favorite fruit is not on my list :(")