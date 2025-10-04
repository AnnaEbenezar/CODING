#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/wait.h>
#include <string.h>

#define SHM_KEY 12345 // Change this key as needed
#define BUFFER_SIZE 64

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Usage: %s <number>\n", argv[0]);
        return 1;
    }

    int num = atoi(argv[1]);
    int shmid;
    char *shm_ptr;

    // Create shared memory segment
    if ((shmid = shmget(SHM_KEY, BUFFER_SIZE, IPC_CREAT | 0666)) == -1) {
        perror("shmget");
        return 1;
    }

    // Attach shared memory segment
    if ((shm_ptr = shmat(shmid, NULL, 0)) == (char *) -1) {
        perror("shmat");
        return 1;
    }

    pid_t pid = fork();

    if (pid < 0) {
        perror("fork");
        return 1;
    }

    if (pid == 0) { // Child process
        printf("Child: I am calculating\n");
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        sprintf(shm_ptr, "%d", sum); // Write the result to shared memory

        printf("Child: The result is %s\n", shm_ptr);
        printf("Child: Goodbye\n");

        exit(0);
    } else { // Parent process
        printf("Parent: I have created a shared memory for result...\n");
        printf("Parent: I have attached the shared memory...\n");
        printf("Parent: I am about to fork a child process...\n");
        printf("Parent: Waiting for my child\n");

        wait(NULL); // Wait for the child to finish

        // Read the result from shared memory
        int sum = atoi(shm_ptr);
        printf("Parent: sum from my child is %d\n", sum);

        // Detach shared memory
        if (shmdt(shm_ptr) == -1) {
            perror("shmdt");
            return 1;
        }
        printf("Parent: I have detached the shared memory...\n");

        // Remove shared memory
        if (shmctl(shmid, IPC_RMID, NULL) == -1) {
            perror("shmctl");
            return 1;
        }
        printf("Parent: I have removed the shared memory...\n");
        printf("Parent: Goodbye\n");
    }

    return 0;
}
