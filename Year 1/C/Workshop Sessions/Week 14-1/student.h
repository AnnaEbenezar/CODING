#ifndef SELAB_STUDENT_H
#define SELAB_STUDENT_H

#define MAX_STUDENT_NAME 80

struct Student_ {
    char name[MAX_STUDENT_NAME + 1]; // 81 bytes
    // char pad[3];
    float ex1; // 4 bytes
    float ex2; // 4 bytes
    float ex3; // 4 bytes
    int next;
};

typedef struct Student_ Student_info;

void set_student_name(Student_info* s, const char* name);
void set_student_scores(Student_info* s, float x1, float x2, float x3);

float get_student_total_score(const Student_info* s);

#endif /* SELAB_STUDENT_H */