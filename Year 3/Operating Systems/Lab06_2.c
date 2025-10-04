#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>
#include <sys/wait.h>


#define NUM_CHILDREN 5

pid_t child_pids[NUM_CHILDREN];

void sigterm_handler(int signum) {
    printf("Child: my id is %d, my parent has just terminated me\n", getpid());
    exit(0);
}

int main() {
    for (int i = 0; i < NUM_CHILDREN; i++) {
        pid_t pid = fork();

        if (pid < 0) {
            perror("Fork failed");
            exit(1);
        }

        if (pid == 0) { // Child process
            printf("Child: my id is %d\n", getpid());
            signal(SIGTERM, sigterm_handler);

            while (1) {
                // Child enters a forever loop
            }
        } else { // Parent process
            child_pids[i] = pid;
        }
    }

    // Sleep to give children time to enter their loops
    sleep(2);

    // Send SIGTERM to all children
    for (int i = 0; i < NUM_CHILDREN; i++) {
        kill(child_pids[i], SIGTERM);
    }

    // Wait for all children to terminate
    for (int i = 0; i < NUM_CHILDREN; i++) {
        wait(NULL);
    }

    printf("Parent: I have killed all of my children\n");
    return 0;
}
