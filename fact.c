#include <stdio.h>

int factorial(int n)
{
    if(n<0)
    return -1;
    if(n==0)
    return 1;
    return(n*factorial(n-1));
}
void main()
{
    int fact=0;
    fact=factorial(5);
    printf("\n factorial of 5 is %d",fact);
    
}