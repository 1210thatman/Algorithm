#include <stdio.h>

int main(void) {
	int sum = 0;
    int n = 0;

	for (int i = 0; i < 5; i++) {
		scanf("%d", &n);
		sum += n * n;
	}
	printf("%d", sum % 10);
}//좀 더 깔끔한 코드