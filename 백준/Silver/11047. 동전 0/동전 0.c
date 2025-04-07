#include <stdio.h>

//N과 K를 입력받는다
//반복문을 돌려 배열N에 돈의 종류를 입력받는다
//K를 N으로 나누며 N이 0보다 크거나 같아질 때 까지 반복한다
//결과값을 출력한다

int main() {
    int n[10] = { 0 }; //돈의 종류가 각각 들어있는 배열
    int num = 0; //돈의 종류의 갯수
    int k = 0; //돈
    int answer = 0;

    scanf("%d %d", &num, &k);
    for(int i=0; i<num; i++){
        scanf("%d", &n[i]);
    }

    for(int i=num-1; i>=0; i--){
        answer += k / n[i];
        k %= n[i];
        
    }

    printf("%d", answer);
    
    return 0;
}