#include <stdio.h>
#include <string.h>

// Q는 FIFO나 매표소를 생각하면 편하다.

int queue[2000000] = {0};
int first = 0; // 큐의 가장 처음
int last = 0;  // 큐의 끝

int empty() {
    return first == last ? 1 : 0;
}

int push(int n) {
    queue[last] = n;
    last++;
}

int pop() {
    if (empty()) return -1;
    return queue[first++];
}

int size() {
    if (empty()) return 0;
    return last - first;
}

int front() {
    if (empty()) return -1;
    return queue[first];
}

int back() {
    if (empty()) return -1;
    return queue[last - 1];
}

int main(void) {
    int test = 0;
    char command[7] = {0};
    scanf("%d", &test);
    int i = 0;
    int num = 0; // push가 들어올 경우 X의 값을 입력받는 변수

    while (i < test) {

        scanf("%s", command); // 공백 포함에서 문자열로 받음

        switch (command[0]) {
            case 'p':
                if (command[1] == 'o') printf("%d\n", pop());
                else {
                    scanf("%d", &num);
                    push(num);
                }
                break;
            case 's':
                printf("%d\n", size());
                break;
            case 'e':
                printf("%d\n", empty());
                break;
            case 'f':
                printf("%d\n", front());
                break;
            default:
                printf("%d\n", back());
                break;
        }
        i++;
    }

    return 0;
}