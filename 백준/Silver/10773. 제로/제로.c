#include <stdio.h>

int nums[1000000] = {0}; //재현이가 부르는 돈이 들어갈 배열
int last = 0; //0이 나올 때마다 앞으로 1만큼 줆

int insert(int num){
    return nums[last++] = num;
}

int delete(){
    return nums[last--];
}

int main(void){
    int k = 0;
    int n = 0; //재현이가 부르는 돈
    int sum = 0;

    scanf("%d", &k);

    while(k--){ //k-- > 0 가 참인 동안
        scanf("%d", &n);
        if(n == 0) delete();
        else insert(n);
    }
    for(int i=0; i<last; i++){
        sum += nums[i];
    }
    printf("%d", sum);
    return 0;
}