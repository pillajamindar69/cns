#include <stdio.h>

int main() {
    char *text = "Hello world";
    int i;

    printf("Original string: %s\n", text);

    printf("\nAND with 127 result:\n");
    for (i = 0; text[i] != '\0'; i++) {
        char andResult = text[i] & 127;
        printf("%c", andResult);
    }

    printf("\nXOR with 127 result:\n");
    for (i = 0; text[i] != '\0'; i++) {
        char xorResult = text[i] ^ 127;
        printf("%c", xorResult);
    }
    
    printf("\n");

    return 0;
}
