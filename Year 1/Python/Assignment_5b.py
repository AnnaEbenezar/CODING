from dpll import *

##cnf1 = [['r','~s','t'],
##       ['p','~r','~s'],
##       ['~t'],
##       ['~p','~q','t'],
##       ['s','t'],
##       ['~p','q']]
##print(sat(cnf1))


houses = ["1", "2", "3", "4", "5",]
house_color = ["red", "white", "green", "yellow", "blue",]
nationality = ["Brit", "Swede", "Dane", "Norwegian", "German",]
pet = ["dog", "bird", "cat", "horse", "fish",]
drink = ["tea", "coffee", "milk", "beer", "water",]
cigarette_brand = ["Pall Mall", "Dunhill", "Blends", "Blue Master", "Prince",]
col1 = ["houses", "house_color", "nationality", "pet", "drink", "ciggy",]

def color_checker(houseNum, color, cnf):
    cnf1 = []
    cnf1 += [houses[houseNum],
             house_color[color]]
    if (houses[houseNum] and house_color[color] in sat(cnf)) == False:
        return None
    else:
        return houseNum, color

cnf1 = [[nationality[0], house_color[0]], #1
        [nationality[1], pet[0]], #2
        [nationality[2], drink[0]], #3
        #[], #4
        [house_color[2], drink[1]], #5
        [cigarette_brand[0], pet[1]], #6
        [house_color[3], cigarette_brand[1]], #7
        [houses[2], drink[2]], #8
        [nationality[3], houses[0]], #9
        #[], #10
        #[], #11
        [cigarette_brand[3], drink[3]], #12
        [nationality[4], cigarette_brand[4]], #13
        [houses[1], nationality[3]], #14
        #[], #15
        ]



#print(sat(cnf1))

x = 0
y = 0
for i in range (5):    
    print(color_checker(0,x, cnf1))
    x += 1
             


##{'German': True, 'Blue Master': True,
##'Norwegian': True, '3': True, 'yellow': True,
## 'Pall Mall': True, 'green': True, 'Dane': True,
## 'Swede': True, 'Brit': True}
