#include <string>

namespace log_line {
std::string message(std::string line) {
    int start = line.find(" ") + 1;
    return line.substr(start);
}

std::string log_level(std::string line) {
    int start = line.find("[") + 1;
    int end = line.find("]") - 1;
    return line.substr(start, end);
}

std::string reformat(std::string line) {
    return log_line::message(line) + std::string{" ("} + log_line::log_level(line) + std::string{")"};
}
}  // namespace log_line
