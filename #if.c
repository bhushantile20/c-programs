#include<stdio.h>
#define NUMBER 1
void main()
{
    #if(NUMBER==0)
    printf("1 Value of Number id:%d",NUMBER);
    #endif
    #if(NUMBER==1)
    printf("2 Value of Number is:%d",NUMBER);
    #endif
    
}