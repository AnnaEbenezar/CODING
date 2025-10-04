#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>

void sigint_handler(int signum) {
    printf("Get SIGINT from child\n");
    exit(0);
}

int main() {
    pid_t pid;

    // Register the SIGINT handler for the parent process
    signal(SIGINT, sigint_handler);

    pid = fork();

    if (pid < 0) {
        perror("Fork failed");
        exit(1);
    }

    if (pid == 0) { // Child process
        printf("child: Sleeping for 5 seconds\n");
        sleep(5);
        printf("child: Sending SIGINT\n");

        // Get the parent process ID and send SIGINT to it
        pid_t parent_pid = getppid();
        kill(parent_pid, SIGINT);

        printf("child: Bye\n");
    } else { // Parent process
        printf("parent: Waiting for my child to send SIGINT\n");

        while (1) {
            // The parent is in a forever loop until it receives SIGINT
        }
    }

    printf("parent: Bye\n");
    return 0;
}
