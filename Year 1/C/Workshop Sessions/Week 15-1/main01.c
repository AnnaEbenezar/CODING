#include "dyn_string.h"

#include <stdio.h>
#include <string.h>

#include <stdlib.h>
#include <ctype.h>

#define MAX_STUDENT_NAME 19

struct St_rec {
    int id;
    char name[MAX_STUDENT_NAME + 1];
    int score;
    int next;
};

typedef struct St_rec Student_rec;

#define MAX_STUDENT_REC 20

struct St_rec_list {
    int first;
    Student_rec rec[MAX_STUDENT_REC];
};

typedef struct St_rec_list Student_rec_list;

void parse_student_rec(
    Student_rec* rec, const char* data, size_t len)
{
    const char* cur = data;
    const char* end = data + len;
    for (int i = 0; i < len; ++i) {
        if (data[i] == ',') {
            end = data + i + 1;
            break;
        }
    }

    rec->id = atoi(cur);

    for (cur = end; isspace(*cur); ++cur)
        ;
    end = data + len;
    size_t n = end - cur;
    for (int i = cur - data; i < len; ++i) {
        if (data[i] == ',') {
            end = data + i + 1;
            n = end - cur - 1;
            break;
        }
    }

    if (MAX_STUDENT_NAME < n)
        n = MAX_STUDENT_NAME;
    strncpy(rec->name, cur, n);
    rec->name[n] = 0;

    cur = end;
    rec->score = atoi(cur);
}

int main(int argc, char** argv)
{
    const char* in_fname = "./students.txt";
    if (argc > 1) {
        in_fname = argv[1];
    }

    FILE* ifile = fopen(in_fname, "r");

    Student_rec_list rec_list;
    const size_t max_n = MAX_STUDENT_REC;
    rec_list.first = -1;

    size_t n = 0;
    for (size_t i = 0; i < max_n; ++i)
        rec_list.rec[i].next = -1;

    String* line = string_new();
    while (!feof(ifile)) {
        if (read_line_string(ifile, line) != 0) {
            fprintf(stderr, "error reading line input\n");
            goto fin;
        }

        if (line->len == 0)
            break;

        if (n >= max_n)
            break;

        parse_student_rec(rec_list.rec + n, line->str, line->len);

        int prev = -1;
        int cur = rec_list.first;
        for (; cur != -1 && rec_list.rec[cur].id < rec_list.rec[n].id;
             cur = rec_list.rec[cur].next) {
            prev = cur;
        }

        rec_list.rec[n].next = cur;
        if (prev != -1) {
            rec_list.rec[prev].next = n;
        }
        else {
            rec_list.first = n;
        }
        ++n;
    }

    const Student_rec* rec = rec_list.rec;
    for (int i = rec_list.first; i != -1; i = rec[i].next) {
        fprintf(
            stdout, "%d: %d,%s,%d,%d\n",
            i, rec[i].id, rec[i].name, rec[i].score,
            rec[i].next);
    }

    fprintf(stdout, "\n");
    fprintf(stdout, "First: %d\n", rec_list.first);
    for (int i = 0; i < max_n; ++i) {
        fprintf(
            stdout, "%d: %d,%s,%d,%d\n",
            i, rec[i].id, rec[i].name, rec[i].score,
            rec[i].next);
    }

fin:
    string_delete(line);
    fclose(ifile);
    return 0;
}
