// reading text file and parsing integer values

#include "dyn_string.h"

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv)
{
    FILE* ifile = fopen("./input1.txt", "r");

    int data[10];
    const size_t max_n = sizeof(data) / sizeof(*data);

    String* line = string_new();
    while (!feof(ifile)) {
        if (read_line_string(ifile, line) != 0) {
            fprintf(stderr, "error reading line input\n");
            goto fin;
        }

        char* cur = line->str;
        char* end;
        size_t n = 0;
        for (int i = 0; i < line->len; ++i) {
            if (line->str[i] == ',') {
                end = line->str + i;

                int v = atoi(cur);
                if (n < max_n) {
                    data[n++] = v;
                }
                cur = end + 1;
            }
        }

        int v = atoi(cur);
        if (n < max_n) {
            data[n++] = v;
        }

        for (size_t i = 0; i < n; ++i) {
            fprintf(stdout, " %d", data[i]);
        }
        fprintf(stdout, "\n");
    }

fin:
    string_delete(line);
    fclose(ifile);
    return 0;
}
