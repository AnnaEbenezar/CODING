#include <stdio.h>

double cal_sphere_volume(double r)
{
    const double pi = 22.0 / 7;
    return 4.0 / 3 * pi * r * r * r;
}

int main(void)
{
    // sphere of radius R
    // the volume for the sphere is:
    // V(R) = 4 / 3 * PI * (R^3)

    double r;

    // 0.5, 0.6, 0.7, ..., 1.1
    
    for (double r = 0.5; r < 1.15; r += 0.1) 
    {
        printf("radius = %.2f, volume = %.4f\n", r, cal_sphere_volume(r));
    }

    printf("radius = %.2f, volume = %.4f\n", 5.0, cal_sphere_volume(5.0));
    
    return 0;
}