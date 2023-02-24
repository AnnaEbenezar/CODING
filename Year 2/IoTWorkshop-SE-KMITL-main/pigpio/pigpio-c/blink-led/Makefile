CC=gcc  #compiler
#target file name (output bin)
TARGET=blink
 
all:
	$(CC) blink-pigpio.c -lpigpio -o $(TARGET)
	
blink-joystick:
	$(CC) blink-pigpio-joystick.c -lpigpio -o blink-joystick
clean:
	rm $(TARGET)
