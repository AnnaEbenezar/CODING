#include <stdio.h>
#define PI 3.1415926

int main() {
    int choice;
    double radius;

    while (1) {
        printf("1. Area\n");
        printf("2. Perimeter\n");
        printf("0. Exit\n");
        printf("Your Selection => ");
        scanf("%d", &choice);

        if (choice == 0) {
            printf("Good Bye ^.^\n");
            break;
        } else if (choice == 1 || choice == 2) {
            printf("Enter radius: ");
            scanf("%lf", &radius);

            if (radius < 0) {
                printf("Invalid radius. Please enter a non-negative value.\n");
            } else {
                if (choice == 1) {
                    double area = PI * radius * radius;
                    printf("Area = %lf\n", area);
                } else if (choice == 2) {
                    double perimeter = 2 * PI * radius;
                    printf("Perimeter = %lf\n", perimeter);
                }
            }
        } else {
            printf("Invalid choice. Please enter a valid option.\n");
        }
    }

    return 0;
}
