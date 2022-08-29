#include <stdio.h>

double rect_area(double w, double h)
{
    return w * h;
}

double rect_perimeter(double w, double h)
{
    return (w + h) * 2;
}

int main()
{
    double width, height;
    scanf("%lf", &width);
    scanf("%lf", &height);

    // 3.1
    printf("%f\n", (width * height));

    // 3.2
    printf("%f\n", ((width + height) * 2));

    // 3.3
    printf("%f\n", rect_area(width, height));

    // 3.4
    printf("%f\n", rect_perimeter(width, height));

    return 0;
}