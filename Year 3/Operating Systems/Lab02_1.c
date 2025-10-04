#include <stdio.h>

int main(){
    int num; // input number
    int ttl = 0; //total
    int cnt = 0; //count

    while(1) {
        printf("To quit, enter 0 \n");
        printf("Number = ? ");
        scanf("%d", &num);

        ttl = ttl + num;
                
        if (num == 0) {
            break;
        }

        cnt = cnt + 1;
    }

    printf("Sum: %d\n", ttl);
    printf("Average: %.2f\n", ((float)ttl/cnt));

    return 0;
}