#include <stdio.h>

float celsius_para_fahrenheit(float f) {
        return (f * 9/5) + 32;
}

int main() {
      float temperatura = 30;
      printf("Temperatura em celsius: %0.2f \n", temperatura);
      printf("Temperatura em fahrenheit: %0.2f \n", celsius_para_fahrenheit(temperatura));
      return 0;
}
