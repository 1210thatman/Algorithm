#define _crt_secure_no_warnings
#include <stdio.h>
#include <string.h>

int main(void) {
	char N[101] = "";
	int B = 0;

	scanf("%s %d", N, &B);
	long result = 0;

	for (int i = 0; i < strlen(N); i++) {
		if ('0' <= N[i] && N[i] <= '9') {
			result = result * B + ((int)N[i] - '0');
		}
		else {
			result = result * B + ((int)N[i] - 'A' + 10);
		}
	}

	printf("%ld", result);

	return 0;
}