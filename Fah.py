import sys
##a= input("Enter a number (or [Enter] to quit): ")
##b = []
##c=0
##if a =="":
##    print("Nothing to do.")
##    sys.exit()
##else:
##    b.append(float(a))
##
##while a != "":
##    a= input("Enter a number (or [Enter] to quit): ")
##    if a != "":
##        b.append(float(a))
##for i in range(len(b)):
##    c+=b[i]
##
##avg = c/len(b)
##print(f"Maximum is {max(b):.2f}")
##print(f"Minimum is {min(b):.2f}")
##print(f"Average is {avg:.2f}")

##import sys
##answer = input("Enter a number (or [Enter] to exit): ")
##if answer == "":
##    print("Nothing to do.")
##    sys.exit()
##else:
##    number = float(answer)
##total = 0
##maximum = number
##minimum = number
##count = 0
##while answer != "":
##    count += 1
##    number = float(answer)
##    total = total + number
##    if max(maximum,number) == number:
##        maximum = number
##    elif max(maximum,number) == maximum:
##        maximum = maximum
##    if min(minimum,number) == number:
##        minimum = number
##    elif min(minimum,number) == minimum:
##        minimum = minimum
##    answer = input("Enter a number (or [Enter] to exit): ")
##average = total/count
##print(f"Maximum value is {maximum:.2f}")
##print(f"Minimum value is {minimum:.2f}")
##print(f"Average value is {average:.2f}")


minimum = 0
maximum = 0
avg = 0
string = ""
x = float(input("Enter a number (or [Enter] to quit): "))
string += str(x)
while x != "":
    x = float(input("Enter a number (or [Enter] to quit): "))
    string += str(x)
print(string)
