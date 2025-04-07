#include <stdio.h>

// 돈을 인출하려는 사람 n, 과 각 사람이 돈을 인출하는데 걸리는 시간 pArr을 입력받는다
// 1 2 3 3 4
// 1 + 1+2 + 1+2+3 + 1+2+3+3 + 1+2+3+3+4

int main() {
    int n = 0;
    int pArr[1000] = { 0 };
    int answer = 0; // 정답

    scanf("%d", &n);
    for(int i=0; i<n; i++){
        scanf("%d", &pArr[i]);
    }

    //버블 정렬 구현
    int temp = 0;
    
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-1-i; j++){
            if(pArr[j] > pArr[j+1]){
                temp = pArr[j];
                pArr[j] = pArr[j+1];
                pArr[j+1] = temp;
            }
        }
    }

    for(int i=0; i<n; i++){
        answer += pArr[i]*(n-i);
    }

    printf("%d", answer);
    
    return 0;
}