## Number 1

##text = "abcdefghijk"
##print(text[5])
##print(text[1:4])
##print(text[7:11])
##print(text[0::3])
##print(text[::-2])
##print(text[0:3].upper())


## Number 2

###String = input(str("Enter a list separated by a comma: "))
##zeString = "book, dog, drink, rain, pen"
##div = ','
##s = 0
##
##while s < len(zeString):
##    if zeString[s] == div:
##        print('')
##        s = s + 1
##        continue
##    else:
##        print(zeString[s], end = "")
##        s = s + 1
    

## Number 3

##short_Str = input(str("Enter a short string: "))
##long_Str = input(str("Enter a long string: "))
##
##def LCS(s1, s2):
##    answer = ""    
##    for i in range(len(s1)):
##        for j in range(len(s2)):
##            temp = 0
##            match = ""
##            while ((i+temp < len(s1)) and
##                   (j+temp < len(s2)) and
##                   s1[i+temp] == s2[j+temp]):
##                match += s2[j+temp]
##                temp += 1
##            if (len(match) > len(answer)):
##                answer = match
##    return answer
##
##if len(LCS(short_Str, long_Str)) > 1:
##    print("True")
##else:
##    print("False")
      

## Number 4

##firstName = input(str("Enter your First Name: "))
##lastName = input(str("Enter your Last Name: "))
##gender = input(str("Enter your gender (m/f): "))
##
##username = (gender.upper() + lastName[0].upper() + firstName[0:6])
##print(username)


## Number 5

##def LCS(s1, s2):
##    answer = ""    
##    for i in range(len(s1)):
##        for j in range(len(s2)):
##            temp = 0
##            match = ""
##            while ((i+temp < len(s1)) and
##                   (j+temp < len(s2)) and
##                   s1[i+temp] == s2[j+temp]):
##                match += s2[j+temp]
##                temp += 1
##            if (len(match) > len(answer)):
##                answer = match
##    return answer
##
##print(LCS("philosophically", "zoophilous"))
##print(LCS("ingenious", "intelligent"))



    
