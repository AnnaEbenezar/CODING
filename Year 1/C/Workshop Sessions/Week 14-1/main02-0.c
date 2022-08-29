//test for setting student name

#include "student.h"
#include <stdio.h>

int main(void)
{
    printf("%ld\n", sizeof(struct Student_));
    printf("%ld\n", sizeof(Student_info));

    Student_info st1;
    set_student_name(&st1, "ABCDEFGHIJ");
    st1.name[MAX_STUDENT_NAME] = '+';

    set_student_name(&st1, "1234567890AB");

    set_student_name(&st1, "Student #1");
    set_student_scores(&st1, 30, 30, 40);
    
    return 0;
}