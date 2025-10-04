#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main() {
    int choice;

    while (1) {
        printf("1. ls\n");
        printf("2. date\n");
        printf("3. ps\n");
        printf("0. exit\n");
        printf("Your Selection => ");
        scanf("%d", &choice);

        if (choice == 0) {
            printf("Good Bye\n");
            break;
        } else if (choice >= 1 && choice <= 3) {
            pid_t pid = fork();

            if (pid == 0) { // Child process
                if (choice == 1) {
                    execl("/bin/ls", "ls", NULL);
                } else if (choice == 2) {
                    execl("/bin/date", "date", NULL);
                } else if (choice == 3) {
                    execl("/bin/ps", "ps", NULL);
                }

                // This part will only be executed if execl fails
                perror("Error executing the selected program");
                exit(EXIT_FAILURE);
            } else if (pid > 0) { // Parent process
                wait(NULL);
                printf("\n");
            } else { // Fork failed
                perror("Fork failed");
                exit(EXIT_FAILURE);
            }
        } else {
            printf("Invalid choice. Please enter a valid option.\n");
        }
    }

    return 0;
}
