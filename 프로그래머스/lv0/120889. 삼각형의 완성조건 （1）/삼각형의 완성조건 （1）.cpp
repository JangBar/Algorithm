#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> sides) {
    // 변의 길이를 내림차순으로 정렬
    sort(sides.begin(), sides.end(), greater<int>());
    
    int max_side = sides[0];
    int sum_of_other_sides = sides[1] + sides[2];
    
    if (max_side < sum_of_other_sides) {
        return 1; // 삼각형을 만들 수 있음
    } else {
        return 2; // 삼각형을 만들 수 없음
    }
}