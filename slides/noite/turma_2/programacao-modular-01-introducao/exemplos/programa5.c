#include <stdio.h> 
#include <string.h> 
int main() { 
	char a[1000] = "0001234"; 
	int i, c = -1; 
	
	// acha a posicao do ultimo 0 na frente
	for (i = 0; i < strlen(a); i++) { 
		if (a[i] != '0') { 
			c = i; 
			break; 
		} 
	} 
	// escrevendo sem os zeros 
	for (i = c; i < strlen(a); i++) { 
		printf("%c", a[i]); 
	} 
	return 0; 
}

