#include <stdio.h>

int main() {
    int arrSize = 0;
    int num = 0;
    int cnt = 0;

    scanf("%d", &arrSize);

    int arr[100] = {};
    for(int i=0; i<arrSize; i++){
        scanf("%d ", &arr[i]);
    }

    scanf("%d", &num);
    for(int i=0; i<arrSize; i++){
        if(arr[i] == num){
            cnt++;
        }
    }
    printf("%d", cnt);
}