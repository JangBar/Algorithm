#include <iostream>

using namespace std;
int solution(int n)
{
     int answer = 0;
     string num = to_string(n);
     for (char result : num) {
     // 문자를 정수로 변환하려면 문자 - '0'을 사용합니다.
     int digit = result - '0';
     answer += digit;
 }
    return answer;
}