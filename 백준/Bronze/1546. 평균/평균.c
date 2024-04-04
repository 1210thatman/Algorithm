#include <stdio.h>

int main(void) {
	double nums[10000] = { 0 };
	int n = 0;
	int max = 0;
	double sum = 0;
	scanf("%d", &n);
	
	for (int i = 0; i < n; i++) {
		scanf("%lf", &nums[i]);
		if (max < nums[i]) max = nums[i];
	}

	for (int i = 0; i < n; i++) {
		sum += nums[i] / max * 100;
	}

	printf("%f", sum / n);

	return 0;
}