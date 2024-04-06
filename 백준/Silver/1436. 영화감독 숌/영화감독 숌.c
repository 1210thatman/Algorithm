#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);

    int count = 0;
    long long int i = 666;

    while (1) {
        char str[20];
        sprintf(str, "%lld", i); // 숫자를 문자열로 변환

        if (strstr(str, "666") != NULL) { // 문자열에 666이 포함되어 있는지 검사
            count++;
        }

        if (count == n) {
            printf("%lld\n", i);
            break;
        }

        i++;
    }

    return 0;
}