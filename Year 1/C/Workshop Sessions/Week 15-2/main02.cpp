#include <fmt/format.h>

#include <fstream>
#include <algorithm>

#include <vector>
#include <string>

#include <cstring>

struct Student_info {
    int id;
    std::string name;
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
        info.name = line.substr(p1 + 1, p2 - p1 - 1);

        auto scoreText = line.substr(p2 + 1);
        info.score = std::stoi(scoreText);
        recList.push_back(info);
    }

    std::sort(
        recList.begin(), recList.end(),
        [](const auto& a, const auto& b)
        { return a.name < b.name; });

    for (const auto& rec: recList) {
        fmt::print("{}; {}; {}\n", rec.id, rec.name, rec.score);
    }
    return 0;
}
