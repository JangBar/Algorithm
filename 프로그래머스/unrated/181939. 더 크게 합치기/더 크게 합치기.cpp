#include <iostream>
#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;

    string str_a = to_string(a);
    string str_b = to_string(b);

    string ab = str_a + str_b;
    string ba = str_b + str_a;

    int ai = stoi(ab);
    int bi = stoi(ba);

    if (ai > bi) {
        answer= ai;
    }
    else {
        answer= bi;
    }

    return answer;
}