#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>
#include <pthread.h>

int parentResult = 0;

void *childThread(void *arg) {
    int num = *(int *)arg;
    int childResult = 0;

    for (int i = 1; i <= 2 * num; i++) {
        childResult += i;
    }

    return (void *)(intptr_t)childResult;
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    pthread_t tid;
    pthread_create(&tid, NULL, childThread, &num);

    for (int i = 1; i <= num; i++) {
        parentResult += i;
    }

    void *childResult;
    pthread_join(tid, &childResult);

    int finalResult = parentResult + (int)(intptr_t)childResult;
    printf("The final result is: %d\n", finalResult);

    return 0;
}
