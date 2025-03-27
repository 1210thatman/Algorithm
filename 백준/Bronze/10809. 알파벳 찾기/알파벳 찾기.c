#include <stdio.h>
#include <string.h>

int main(void) {
    char string[101];
    int nums[26];
    scanf("%s", string, 101);

    int len = strlen(string);

    // 초기화: 각 알파벳의 처음 등장 위치를 -1로 설정
    for (int i = 0; i < 26; i++) {
        nums[i] = -1;
    }

    // 각 알파벳의 처음 등장 위치 찾기
    for (int i = 0; i < len; i++) {
        int index = string[i] - 'a'; // 알파벳의 인덱스 계산
        if (nums[index] == -1) {
            nums[index] = i;
        }
    }

    // 결과 출력
    for (int i = 0; i < 26; i++) {
        printf("%d ", nums[i]);
    }

    return 0;
}
