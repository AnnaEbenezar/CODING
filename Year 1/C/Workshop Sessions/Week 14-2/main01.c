// reading plain text data and echo to the screen

#include <stdio.h>

int main(int argc, char** argv)
{
    FILE* ifile = fopen("./input1.txt", "r");

    char in_buffer[20];
    size_t n = fread(in_buffer, 1, 30, ifile);
    fwrite(in_buffer, 1, n, stdout);
    fputc('\n', stdout);

    fclose(ifile);
    return 0;
}