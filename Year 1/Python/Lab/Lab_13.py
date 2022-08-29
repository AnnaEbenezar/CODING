import turtle as t

## Number 1

def list_member(number, num_list):
    if len(num_list) == 0:
        return False
    elif number == num_list[0]:
        return True
    else:
        return list_member(number, num_list[1:])


## Number 2

def list_reverse(list1):
    if len(list1) == 1:
        return list1
    else:
        return list_reverse(list1[1:]) + [list1[0]]


## Number 3

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)


## Number 4

def cross(size, itera):
    if itera == 0:
        t.dot(5)
        return 0
    else:
        for i in range(4):
            t.fd(size)
            if itera == 1:
                t.dot(5)
            elif itera != 1:
                cross(size / 2, itera - 1)
            t.bk(size)
            t.lt(90)
t.speed(0)
cross(150,5)


## Number 5

##num = input().split()
##intNum = []
##
##for i in range(len(num)):
##    intnum.append(int(num[i]))
##
##lst3 = []
##def subset(l1, n, l2):
##    n ==len(l1)
    


