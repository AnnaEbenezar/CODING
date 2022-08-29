// writing binary data file

#include <stdio.h>

int main(int argc, char** argv)
{
    FILE* ofile = fopen("./output1.dat", "wb");

    int data[] = {0, 1, 2, 3, 4, 5};
    const size_t n = sizeof(data) / sizeof(*data);
    fwrite(data, sizeof(*data), n, ofile);

    // 0x00000005
    // 05 00 00 00 little endian
    // 00 00 00 05 big endian

    fclose(ofile);
    return 0;
}