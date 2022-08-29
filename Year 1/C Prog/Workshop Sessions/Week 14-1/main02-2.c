// using next field to organize simple link 
//structure for the list of Student_info

#include "student.h"

#include <stdio.h>

int main(void)
{
    FILE* fp = fopen("./student_report.html", "w+");

    fprintf(fp, "<style>\n");
    fprintf(fp, "table, th, td {\n");
    fprintf(fp, "  border: 1px solid black;\n");
    fprintf(fp, "  border-collapse: collapse;\n");
    fprintf(fp, "}\n");
    fprintf(fp, "</style>\n");

    const char* headers[] = {
        "Name", "Exam 1", "Exam 2", "Exam 3", "Total"
    };
    const size_t n_head = sizeof(headers) / sizeof(*headers);

    fprintf(fp, "<table>\n");
    fprintf(fp, "<tr>\n");
    for (size_t i = 0; i < n_head; ++i) {
        fprintf(fp, "<td>%s</td>\n", headers[i]);
    }
    fprintf(fp, "</tr>\n");

    Student_info student_list[10] = {
        {"Student #1", 20, 20, 35,  3}, // 0
        {"Student #3", 25, 25, 38, -1}, // 1
        //{},
        {"Student #2", 25, 25, 38,  1}
    };
    const size_t n_students = sizeof(student_list) / sizeof(*student_list);

    for (size_t i = 0; i != -1; i = student_list[i].next) {
        fprintf(fp, "<tr>\n");
        fprintf(fp, "  <td>%s</td>\n", student_list[i].name);
        fprintf(fp, "  <td>%f</td>\n", student_list[i].ex1);
        fprintf(fp, "  <td>%f</td>\n", student_list[i].ex2);
        fprintf(fp, "  <td>%f</td>\n", student_list[i].ex3);
        fprintf(
            fp, "  <td>%f</td>\n",
            get_student_total_score(&student_list[i]));
            // get_student_total_score(student_list + i)
        fprintf(fp, "</tr>\n");
    }

    fprintf(fp, "</table>\n");
    fclose(fp);
    return 0;
}
