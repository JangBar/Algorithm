#include <string>
#include <vector>

using namespace std;

int solution(string t, string p) {
    int answer = 0;
    string result;
    int tIndex = 0; // t 문자열 인덱스를 관리하기 위한 변수

  while (tIndex + p.length() <= t.length()) {
      result = t.substr(tIndex, p.length());
      tIndex++;
      if (stol(p) >=stol(result)) {
          answer++;
      }
  }
    return answer;
}