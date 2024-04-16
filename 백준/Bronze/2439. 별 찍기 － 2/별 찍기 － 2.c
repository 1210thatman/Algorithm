#include <stdio.h>

int main(void) {
	int n = 0;
	scanf("%d", &n);

	for (int y = 1; y < n+1; y++) {
		for (int b = 0; b < n-y; b++) {
			printf(" ");
		}

		for (int x = 0; x < y; x++) {
			printf("*");
		}

		printf("\n");
	}
	return 0;
}