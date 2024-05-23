#include<stdio.h>
int arr[301][301];

int main(void) {
	int n = 0, m = 0;
	scanf("%d %d", &n, &m);

	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= m; j++) {
			int num = 0;
			scanf("%d", &num);
			arr[i][j] = arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1] + num;
		}
	}

	int K = 0;
	scanf("%d", &K);

	int i, j, x, y = 0; //문제에서 i,j,x,y
	while (K--) {
		scanf("%d%d%d%d", &i, &j, &x, &y);
		printf("%d\n", arr[x][y] - arr[i - 1][y] - arr[x][j - 1] + arr[i - 1][j - 1]);
	}
	return 0;
}