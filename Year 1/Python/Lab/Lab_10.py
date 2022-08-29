## Number 1

##def name_list():
##    counter = 0
##    nameList = []
##    names = str(input("Enter name " + str(counter+1) + ": "))
##    nameList.append(names)
##    while names != '':
##        names = str(input("Enter name " + str(counter+2) + ": "))
##        nameList.append(names)
##        counter += 1
##    nameList.pop()
##    return print(nameList)
##
##name_list()


## Number 2

##def my_count(numList):
##    counter = 0
##    for i in range (len(numList)):
##        if numList[i] >= 0:
##            counter += 1
##    return print(counter)
##
##my_count([-3,2,0,1,-5])


## Number 3

##def remove_the_thirds(numList):
##    temp = []
##    for i in range (len(numList)):
##        if (i+1) % 3 != 0:
##            temp.append(numList[i])
##    return print(temp)
##
##remove_the_thirds([3,6,6,3,7,2,0,1,5,4])


## Number 4

##def get_the_difference(list1, list2):
##    difCounter = 0
##    difList = []
##
##    for i in range (len(list1)):
##        for j in range (len(list2)):
##            if list1[i] == list2[j]:
##                difCounter = 1
##        if difCounter == 0:
##            difList.append(list1[i])
##        difCounter = 0
##
##    for i in range (len(list2)):
##        for j in range (len(list1)):
##            if list2[i] == list1[j]:
##                difCounter = 1
##        if difCounter == 0:
##            difList.append(list2[i])
##        difCounter = 0
##
##    return print(difList)
##
##get_the_difference([3,1,1,1,2,7],[4,1,1,2,2,5])


## Number 5

##def my_sort(numList):
##    for i in range(len(numList)):
##        for j in range(i + 1, len(numList)):
##            if numList[i] > numList[j]:
##                numList[i], numList[j] = numList[j], numList[i]
##
##    return print(numList)
##
##my_sort([6, 4, 2, 1, 4, 3, 8])


## Number 6


        
## Number 7

def merge(list1, list2):
    numList = []
    numList = list1
    for i in range (len(list2)):
        numList = list1.append(list2[i])

    for i in range(len(numList)):
        for j in range(i + 1, len(numList)):
            if numList[i] > numList[j]:
                numList[i], numList[j] = numList[j], numList[i]

    return print(numList)

merge([1, 5, 16, 61, 111], [2, 4, 5, 6])



    
    
##    if len(list1) < len(list2):
##        list1, list2 = list2, list1
##    for i in list1:
##        for j in range (len(list2)):
##            if j == len(list2)-1:
##                list2.append(i)









    


        
