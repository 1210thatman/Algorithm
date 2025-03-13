#include <stdio.h>

int main(void) {
	int nums[6] = { 0 };
	int sum = 0;
	for (int i = 0; i < 6; i++) {
		scanf("%d", &nums[i]);
		sum += nums[i] * nums[i];
	}

	// for (int i = 0; i < 6; i++) {
	// 	printf("%d ", nums[i]);
	// }

	printf("%d", sum%10);
	return 0;
}