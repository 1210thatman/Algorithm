#include <stdio.h>

int main(void){
    int star = 0;
    scanf("%d", &star);

    for(int i=0; i<2*star; i++){
        for(int j=0; j<star; j++){
            if(i % 2 == 0){
                if(j % 2 == 0){
                    printf("*");
                }
                else{
                    printf(" ");
                }
            }
            else{
                if(j % 2 == 0){
                    printf(" ");
                }
                else{
                    printf("*");
                }
            }
        }
        printf("\n");
    }
}