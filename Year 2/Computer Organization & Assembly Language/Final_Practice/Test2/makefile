test.s: test.c
	gcc -S test.c
test: test.o
	gcc test.o -o test
test.o: test.c
	gcc -c test.c
clean:
	rm *.o
