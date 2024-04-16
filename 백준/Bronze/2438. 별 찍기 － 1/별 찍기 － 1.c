#include<stdio.h>

int main(void) {
	int n = 0;
	int stars = 1;
	scanf("%d", &n);

	for (int y = 0; y < n; y++) {
		for (int x = 0; x < stars; x++) {
			printf("*");
		}
		printf("\n");
		stars++;
	}
	return 0;
}