#include <stdio.h>

int main(void){
    int first = 0;
    int last = 0;
    int n = 0; //정수 N, 카드의 수
    int cards[500000] = { 0 };
    scanf("%d", &n);

    last = n-1;
    
    for(int i=0; i<n; i++){
        cards[i] = i+1;
    }
    
    while(1){
        first = (first+1)%n;
        if(first == last) break;
        
        last = (last+1)%n;
        cards[last] = cards[first];
        first = (first+1)%n;
        if(first == last) break; //first값과 last값이 같으면 원형큐에 숫자가 1개 남았다는 의미
    }
    printf("%d", cards[last]);
    return 0;
}

/*while(1){
    first = (first+1)%n; // first를 다음 카드로 이동
    if(first == last) break; // first와 last가 같으면 마지막 카드까지 남은 것이므로 반복 종료

    last = (last+1)%n; // last를 다음 카드로 이동
    cards[last] = cards[first]; // 마지막 카드 위치에 다음 카드 값을 복사
    first = (first+1)%n; // first를 다음 카드로 이동
    if(first == last) break; // first와 last가 같으면 마지막 카드까지 남은 것이므로 반복 종료
}*/
