#include <stdio.h>
#include <string.h>

int main()
{
    const char *s="hello world";
    size_t n=strlen(s);
    
    printf("Original:%s\n",s);
    printf("After xor with 0\n");
    
    for(size_t i=0;i<n;i++)
    {
        unsigned char c=s[i];
        unsigned char x=c ^ 0;
        printf("%c 0x%02X\n", x , x);
    }
}