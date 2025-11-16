#include <stdio.h>

int main() {
    char str[] = "Hello World";
    char result[50];
    
    for (int i = 0; str[i] != '\0'; i++) {
        result[i] = str[i] ^ 1;   // XOR each character with 1
        result[i+1] = '\0';       // keep string terminated
    }

    printf("Original : %s\n", str);
    printf("XORed    : %s\n", result);

    return 0;
}
