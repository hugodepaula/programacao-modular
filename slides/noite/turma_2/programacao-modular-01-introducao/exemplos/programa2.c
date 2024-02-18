#include <stdio.h>

int main() {
        int x, resto;

        x = 50;
        resto = x % 2;

        if (resto == 0) {
                printf("par");
        } else {
                printf("impar");
        }
        return 0;
}
