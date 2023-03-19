#include<stdio.h>
int main()
{
    int a, b, output;
    printf("Enter first number:");
    scanf("%d", &a);
    printf("Enter second number:");
    scanf("%d", &b);
    output = a - b;
    printf("Substraction= %d", output);
    return 0;
}