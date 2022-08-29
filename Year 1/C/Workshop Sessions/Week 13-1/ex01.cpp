#include <format.h>
#include <iostream>

int main()
{
    // sphere of radius R
    // the volume for the sphere is:
    // V(R) = 4 / 3 * PI * (R^3)

    double pi = 22.0 / 7;
    double radius = 1.0;
    fmt :: print("Enter sphere radius: ");

    std::cin >> radius;
    fmt::print("{}\n", ((4.0 / 3) * pi * radius * radius * radius));
    return 0;
}