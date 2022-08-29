#include "student.h"

#include <string.h>

void set_student_name(Student_info* s, const char* name)
{
    strncpy(s->name, name, MAX_STUDENT_NAME);
    s->name[MAX_STUDENT_NAME] = 0;
}

void set_student_scores(Student_info* s, float x1, float x2, float x3)
{
    s->ex1 = x1;
    s->ex2 = x2;
    s->ex3 = x3;
}

float get_student_total_score(const Student_info* s)
{
    return s->ex1 + s->ex2 + s->ex3;
}