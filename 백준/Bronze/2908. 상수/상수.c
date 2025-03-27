#include <stdio.h>

int main() {
    int n1 = 0;
    int n2 = 0;

    int rn1 = 0;
    int rn2 = 0;

    scanf("%3d %3d", &n1, &n2);

    while(n1 > 0 || n2 > 0){
        rn1 = rn1 * 10 + (n1 % 10);
        n1 /= 10;

        rn2 = rn2 * 10 + (n2 % 10);
        n2 /= 10;
    }

    printf("%d", rn1 > rn2 ? rn1 : rn2);
    
    return 0;
}