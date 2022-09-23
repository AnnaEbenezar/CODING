#include "dyn_string.h"

#include <stdio.h>
#include <string.h>

#include <stdlib.h>
#include <ctype.h>

#define MAX_STUDENT_NAME 19

typedef struct St_rec Student_rec;

struct St_rec {
    int id;
    char name[MAX_STUDENT_NAME + 1];
    int score;
    Student_rec* next;
};

void insert_student_rec(Student_rec** rec_list_head, Student_rec* new_rec)
{
    Student_rec* prev = NULL;
    Student_rec* cur = *rec_list_head;
    for (; cur != NULL && cur->id < new_rec->id;
         prev = cur, cur = cur->next)
        ;

    new_rec->next = cur;
    if (prev != NULL) {
        prev->next = new_rec;
    }
    else {
        *rec_list_head = new_rec;
    }
}

void clear_student_rec_list(Student_rec** rec_list_head)
{
    for (Student_rec* p = *rec_list_head;
         p != NULL; p = *rec_list_head) {
        *rec_list_head = p->next;
        free(p);
    }
    *rec_list_head = NULL;
}

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
    Student_rec* rec_list_head = NULL;

    String* line = string_new();
    while (!feof(ifile)) {
        if (read_line_string(ifile, line) != 0) {
            fprintf(stderr, "error reading line input\n");
            goto fin;
        }

        if (line->len == 0)
            break;

        Student_rec* new_rec = (Student_rec*)malloc(sizeof(Student_rec));
        if (new_rec == NULL) {
            fprintf(stderr, "out of memory\n");
            break;
        }

        parse_student_rec(new_rec, line->str, line->len);
        insert_student_rec(&rec_list_head, new_rec);
    }

    for (const Student_rec* p = rec_list_head;
         p != NULL; p = p->next) {
        fprintf(
            stdout, "%p: %d,%s,%d,%p\n",
            p, p->id, p->name, p->score,
            p->next);
    }

fin:
    clear_student_rec_list(&rec_list_head);

    string_delete(line);
    fclose(ifile);
    return 0;
}
