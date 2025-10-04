#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>

#define BUFFER_SIZE 64

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Usage: %s <number>\n", argv[0]);
        return 1;
    }

    int num = atoi(argv[1]);

    int pipefd[2]; // File descriptors for the pipe
    char buffer[BUFFER_SIZE];
    int sum;

    if (pipe(pipefd) == -1) {
        perror("pipe");
        return 1;
    }

    pid_t pid = fork();

    if (pid < 0) {
        perror("fork");
        return 1;
    }

    if (pid == 0) { // Child process
        close(pipefd[0]); // Close the read end of the pipe

        printf("Child: I am calculating\n");
        sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        // Convert the integer sum to a string
        sprintf(buffer, "%d", sum);

        printf("Child: the result is %s\n", buffer);

        // Write the result to the pipe
        write(pipefd[1], buffer, strlen(buffer) + 1);

        printf("Child: I am sending data\n");
        printf("Child: Goodbye\n");

        close(pipefd[1]); // Close the write end of the pipe
        exit(0);
    } else { // Parent process
        close(pipefd[1]); // Close the write end of the pipe

        printf("Parent: waiting for my child\n");

        // Read the result from the pipe
        read(pipefd[0], buffer, BUFFER_SIZE);

        // Convert the received string back to an integer
        sum = atoi(buffer);

        printf("Parent: sum from my child is %d\n", sum);
        printf("Parent: Goodbye\n");

        close(pipefd[0]); // Close the read end of the pipe
        wait(NULL);
    }

    return 0;
}
