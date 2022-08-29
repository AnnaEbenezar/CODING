## Number 1

##score = float(input("Enter the Score: "))
##
##if score > 100:
##    grade = 'Invalid'
##if 80 <= score <= 100:
##    grade = 'A'
##elif 70 <= score < 80:
##    grade = 'B'
##elif 60 <= score < 70:
##    grade = 'C'
##elif 50 <= score < 60:
##    grade = 'D'
##elif 0<= score < 50:
##    grade = 'F'
##else:
##    grade = 'Invalid'
##
##print("Your Grade: ", grade)


## Number 2

##theNum = int(input("Enter a number: "))
##
##print("1. Floating Point")
##print("2. Scientific")
##print("3. Integer")
##
##numDisplay = int(input("Which would you like? "))
##
##if numDisplay == 1:
##    print(format(theNum, "10.2f"))
##elif numDisplay == 2:
##    print(format(theNum, "10.2e"))
##elif numDisplay == 3:
##    print("1. Binary")
##    print("2. Octal")
##    print("3. Hexadecimal")
##    print("4. Decimal")
##
##    int_choice = int(input("Which would you like? "))
##    if int_choice == 1:
##        print(bin(theNum))
##    elif int_choice == 2:
##        print(oct(theNum))
##    elif int_choice == 3:
##        print(hex(theNum))
##    elif int_choice == 4:
##        print(float(theNum))
##    else:
##        print("INVALID")


## Number 3

##name = input("Enter your name: ")
##age = int(input("Enter your age: "))
##weight = float(input("Enter your weight in kg: "))
##height = float(input("Enter your height in cm: "))
##height_meters = height / 100
##BMI = weight / (height_meters * height_meters)
##print("Your body mass index is ", format(BMI, ".2f"))
##
##if age < 17:
##    if BMI < 15:
##        print("Underweight")
##    elif 15 < BMI < 20:
##        print("Normal")
##    elif BMI > 20:
##        print("Overweight")
##    else:
##        print("Invalid")
##
##if 17 < age < 35:
##    if BMI < 18:
##        print("Underweight")
##    elif 18 < BMI < 24:
##        print("Normal")
##    elif BMI > 24:
##        print("Overweight")
##    else:
##        print("Invalid")
##
##if age > 35:
##    if BMI < 19:
##        print("Underweight")
##    elif 19 < BMI < 26:
##        print("Normal")
##    elif BMI > 26:
##        print("Overweight")
##    else:
##        print("Invalid")


## Number 4
 
flag = True #To run while in infinite loop
summ = 0 #To keep summation
positive_flag = False #Flag to indicate that input numbers are positive number
negative_flag = False #Flag to indicate that input numbers are negative number
num = 0
print('Enter exit to terminate program\n')

while flag:
    numStr = input("Enter a number: ");
    if numStr == 'exit':
        break
    num = int(numStr)
    #If number is negative and if previous number is postive(indicated by positive flag),
    # then reset summation and assign the new number. Once reset is done and printed, take a new input number
    if num < 0 and negative_flag is False and positive_flag is True:
       summ = num
       positive_flag = False
       negative_flag = True
       print("Summation is: ", summ)
       print('\n')
       continue

    #If number is positive and if previous number is negative(indicated by negative_flag as True)
    # , then reset summation and assign the new number. Once reset is done and printed, take a new input number
    if num >= 0 and positive_flag is False and negative_flag is True:
        summ = num
        positive_flag = True
        negative_flag = False
        print("Summation is: ", summ)
        print('\n')
        continue
    #When both flags are False, it will set flag to true based on positive or negative number.
    #In this case, input numbers are either positive or negative continuously.
    if num >= 0:
        positive_flag = True
    else:
        negative_flag = True

    #Add num to previous sum till sign changes
    summ = summ + num

    print("Summation is: ", summ)
    print('\n')

