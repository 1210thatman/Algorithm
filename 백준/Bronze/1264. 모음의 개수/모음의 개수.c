#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char str[256] = "";
    while(1){
        scanf("%[^\n]s", str);

        if(str[0] == '#'){
            break;
        }

        int count = 0;
        for(int i=0; i<strlen(str); i++){
            str[i] = tolower(str[i]);
        }

        for(int i=0; i<strlen(str); i++){
            char ch = str[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        printf("%d\n", count);
        getchar();
    }
    return 0;
}