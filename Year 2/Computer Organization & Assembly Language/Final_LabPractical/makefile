power3_ls.s: power3_l.c
	gcc -S power3_l.c

Lab_Final: main.c power3_l.s
	gcc -o Lab_Final -Wall main.c power3_l.s

main: main.o
	gcc main.o -o main

main.o: main.c
	gcc -c main.c

clean:
	rm *.o
