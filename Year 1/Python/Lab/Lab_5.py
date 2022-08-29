import turtle
t = turtle.Turtle()

## Number 1

####Pattern A
##for i in range (1, 6):
##    for j in range(1, i + 1):
##        print(j, end=" ")
##    print()
##print("\n")
##
####Pattern B
##a = 6
##for i in range (1, 6):
##    for j in range (1, a):
##        print(j, end=" ")
##    print()
##    a -= 1
        

##Number 2

##N = int(input("Number of columns and rows desired: "))
##
##t.speed(0)
##for i in range(N // 2):
##    for i in range(N):
##        for i in range (4):
##            t.fd(100/N)
##            t.left(90)
##        t.fd(100/N)
##    t.left(90)
##    t.fd(100/N)
##    t.left(90)
##
##    for i in range(N):
##        for i in range (4):
##            t.fd(100/N)
##            t.right(90)
##        t.fd(100/N)
##    t.right(90)
##    t.fd(100/N)
##    t.right(90)
##
##if N % 2 != 0:
##    for i in range(N):
##        for i in range(4):
##            t.fd(100/N)
##            t.left(90)
##        t.fd(100/N)


## Number 3

##N = int(input("Number of columns and rows desired: "))
##
##t.speed(0)
##counter = 1
##t.fillcolor("black")
##for i in range(N // 2):
##    for i in range(N):
##        for i in range (4):
##            if counter % 2 == 0:
##                t.begin_fill()
##                t.fd(100/N)
##                t.left(90)
##                t.end_fill()
##            else:
##                t.fd(100/N)
##                t.left(90)
##        counter += 1
##        t.fd(100/N)
##    t.left(90)
##    t.fd(100/N)
##    t.left(90)
##
##    for i in range(N):
##        for i in range (4):
##            if counter % 2 == 0:
##                t.begin_fill()
##                t.fd(100/N)
##                t.left(90)
##                t.end_fill()
##            else:
##                t.fd(100/N)
##                t.left(90)
##        counter += 1
##        t.fd(100/N)
##    t.right(90)
##    t.fd(100/N)
##    t.right(90)
##
##if N % 2 != 0:
##    for i in range(N):
##        for i in range(4):
##            if counter % 2 == 0:
##                t.begin_fill
##            t.fd(100/N)
##            t.left(90)
##            t.end_fill()
##        counter += 1
##        t.fd(100/N)

##N = int(input("Number of columns and rows desired: "))
##
##t.speed(0)
##
##for i in range(N // 2):
##    for i in range(N // 2):
##        t.begin_fill()
##        for i in range (4):
##            t.fd(100/N)
##            t.left(90)
##        t.end_fill()
##        t.fd((100/N) * 2)
##    t.begin_fill()
##    for i in range(4):
##        t.fd(100/N)
##        t.left(90)
##    t.end_fill()
##    t.fd(100/N)
##    t.left(90)
##    t.fd(100/N)
##    t.right(90)
##    t.back(100)
##    t.fd(100/N)
##
##for i in range(N // 2):
##    t.begin_fill()
##    for i in range(4):
##        t.fd(100/N)
##        t.left(90)
##    t.end_fill()
##    t.fd((100/N) * 2)
##t.begin_fill()
##for i in range(4):
##    t.fd(100/N)
##    t.left(90)
##t.fd(100/N)
##t.end_fill()
##t.left(90)
##t.fd(100/N)
##t.left(90)
##t.fd(100)
##t.left(90)
##t.fd(100)
##
##
##if N % 2 != 0:
##    for i in range(N):
##        for i in range(4):
##            t.fd(100/N)
##            t.left(90)
##        t.fd(100/N)

    
## Number 4

##i = 1
##while(i <= 49):
##    for j in range(2):
##        if (i <= 49):
##            print(i, end = ", ")
##            i += 1
##    i += 1

