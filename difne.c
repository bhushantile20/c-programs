#include<stdio.h>
#define number 15
int square=number*number;
#undef number
void main()
{
    printf("%d",square);
    
}