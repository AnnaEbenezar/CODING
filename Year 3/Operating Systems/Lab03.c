#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    pid_t pid;
    
    printf("I am parent\n");

    for (int i = 0; i < 5; i++) {
        pid = fork();

        if (pid == 0) { // child process
            if (i % 2 == 0) { // even child process
                printf("I am child %d\n", i);
                for (int j = 0; j < 4; j++) {
                    pid_t sub_pid = fork();
                    if (sub_pid == 0) {
                        printf("I am sub-child %d of child %d\n", j, i);
                        break; // stop the loop for sub-child
                    }
                }
                break; // stop the loop for child
            } else { // odd child process
                printf("I am child %d\n", i);
                for (int j = 0; j < 5; j++) {
                    pid_t sub_pid = fork();
                    if (sub_pid == 0) {
                        printf("I am sub-child %d of child %d\n", j, i);
                        break; // stop the loop for sub-child
                    }
                }
                break; // stop the loop for child
            }
            exit(0);
        }
    }
    for (int i = 0; i<5; i++){
        wait(NULL);
    }

    return 0;
}
