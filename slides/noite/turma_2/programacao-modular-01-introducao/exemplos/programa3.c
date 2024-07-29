#include <stdio.h>

int main() {
        int i, min, arr_size;
        int arr[] = {1, 20, 4, 0, 99, 45, 66, -9};
        min = arr[0];
        arr_size = sizeof(arr) / sizeof(arr[0]);

        for (i = 1; i < arr_size; i++) {
                if (arr[i] < min) {
                        min = arr[i];
                }
        }

        printf("O menor numero é: %d", min);

        return 0;
}
