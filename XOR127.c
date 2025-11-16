#include <stdio.h>
#include <string.h>

int main()
{
    const char *s="hello world";
    size_t n=strlen(s);
    
    printf("Original:%s\n",s);
    printf("After AND with 127\n");
    
    for(size_t i=0;i<n;i++)
    {
        unsigned char c=s[i];
        unsigned char a=c & 127;
        printf("%c 0x%02X\n", a ? a:'.',a);
    }
    printf("After Or with 127\n");
    
    for(size_t i=0;i<n;i++)
    {
        unsigned char c=s[i];
        unsigned char x=c ^ 127;
        printf("%c 0x%02X\n", x ? x:'.',x);
    }
}