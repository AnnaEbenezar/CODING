#include <fmt/format.h>

#include <fstream>
#include <algorithm>

#include <vector>
#include <string>

#include <cstring>

const size_t MAX_STUDENT_NAME = 19;

struct Student_info {
    int id;
    char name[MAX_STUDENT_NAME + 1];
    int score;
};

int main(int argc, char** argv)
{
    std::string in_fname = "./students000.txt";
    if (argc > 1) {
        in_fname = argv[1];
    }

    std::vector<Student_info> recList;

    std::ifstream infile(in_fname, std::ios::in);
    std::string line;
    while (std::getline(infile, line)) {
        auto p1 = line.find(',');
        auto idText = line.substr(0, p1);

        Student_info info;
        info.id = std::stoi(idText);

        auto p2 = line.find(',', p1 + 1);
        auto name = line.substr(p1 + 1, p2 - p1 - 1);

        auto n = name.size();
        if (MAX_STUDENT_NAME < n)
            n = MAX_STUDENT_NAME;
        std::strncpy(info.name, name.data(), n);
        info.name[n] = 0;

        auto scoreText = line.substr(p2 + 1);
        info.score = std::stoi(scoreText);
        recList.push_back(info);
    }

    std::ofstream outfile(
        "./student.dat", std::ios::out | std::ios::binary);
    for (const auto& rec: recList) {
        // fmt::print("{}; {}; {}\n", rec.id, rec.name, rec.score);

        // C version
        // outfile.write((char*)&rec, sizeof(rec));
        // C++ version
        // outfile.write(reinterpret_cast<const char*>(&rec), sizeof(rec));

        char buffer[sizeof(int) * 2 + sizeof(rec.name)] = {};
        buffer[0] = rec.id & 0xFF;
        buffer[1] = (rec.id >> 8) & 0xFF;
        buffer[2] = (rec.id >> 16) & 0xFF;
        buffer[3] = (rec.id >> 24) & 0xFF;
        strcpy(buffer + 4, rec.name);

        const auto pos = sizeof(rec.name) + 4;
        buffer[pos] = rec.score & 0xFF;
        buffer[pos + 1] = (rec.score >> 8) & 0xFF;
        buffer[pos + 2] = (rec.score >> 16) & 0xFF;
        buffer[pos + 3] = (rec.score >> 24) & 0xFF;
        outfile.write(buffer, sizeof(buffer));
    }

    outfile.close();

    std::vector<Student_info> recList2;

    std::ifstream infile2(
        "./student.dat", std::ios::in | std::ios::binary);
    while (infile2) {
        Student_info info;
        char buffer[sizeof(int) * 2 + sizeof(info.name)];
        infile2.read(buffer, sizeof(buffer));

        info.id = buffer[0] | (buffer[1] << 8)
                  | (buffer[2] << 16) | (buffer[3] << 24);

        strncpy(info.name, buffer + 4, sizeof(info.name));

        const auto pos = sizeof(info.name) + 4;
        info.score = buffer[pos] | (buffer[pos + 1] << 8)
                     | (buffer[pos + 2] << 16) | (buffer[pos + 3] << 24);
        recList2.push_back(info);
    }

    std::sort(
        recList2.begin(), recList2.end(),
        [](const auto& a, const auto& b)
        { return std::strcmp(a.name, b.name) < 0; });

    for (const auto& rec: recList2) {
        fmt::print("{}; {}; {}\n", rec.id, rec.name, rec.score);
    }
    return 0;
}
