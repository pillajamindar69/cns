#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Hello World";
    char andRes[50], orRes[50], xorRes[50];

    for (int i = 0; str[i] != '\0'; i++) {
        andRes[i] = str[i] & 127;   // AND with 127
        orRes[i]  = str[i] | 127;   // OR  with 127
        xorRes[i] = str[i] ^ 127;   // XOR with 127
    }

    andRes[strlen(str)] = '\0';
    orRes[strlen(str)]  = '\0';
    xorRes[strlen(str)] = '\0';

    printf("Original : %s\n", str);
    printf("AND 127  : %s\n", andRes);
    printf("OR  127  : %s\n", orRes);
    printf("XOR 127  : %s\n", xorRes);

    return 0;
}
