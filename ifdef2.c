#include<stdio.h>

void main()
{
    int a=0;
    
    #ifdef INPUT
    a=2;
    #else
    printf("Enter a:");
    scanf("%d",&a);
    #endif
    printf("value of a:%d\n",a);
}
