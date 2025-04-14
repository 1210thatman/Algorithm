#include <stdio.h>
#include <string.h>

#define MAX_STACK_SIZE 10000

int stack[MAX_STACK_SIZE];
int top = -1;

int isEmpty() {
    return (top < 0);
}

int push(int item) {
    if (top >= MAX_STACK_SIZE - 1) {
        return -1; // 스택이 가득 찼을 때는 -1 반환
    }
    stack[++top] = item;
    return item;
}

int pop() {
    if (isEmpty()) {
        return -1;
    }
    return stack[top--];
}

int peek() {
    if (isEmpty()) {
        return -1;
    }
    return stack[top];
}

int main() {
    int n;
    scanf("%d", &n);

    char command[10];
    int value;

    for (int i = 0; i < n; i++) {
        scanf("%s", command);

        if (strcmp(command, "push") == 0) {
            scanf("%d", &value);
            push(value);
        }
        else if (strcmp(command, "pop") == 0) {
            printf("%d\n", pop());
        }
        else if (strcmp(command, "size") == 0) {
            printf("%d\n", top + 1);
        }
        else if (strcmp(command, "empty") == 0) {
            printf("%d\n", isEmpty());
        }
        else if (strcmp(command, "top") == 0) {
            printf("%d\n", peek());
        }
    }

    return 0;
}
