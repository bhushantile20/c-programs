#include<stdio.h>
int main()
{
    int base,exp;
    int power(int base,int exp);
    printf("Enter base:");
    scanf("%d",&base);
    printf("Enter exponent:");
    scanf("%d",&exp);
    printf("%d^ %d=%d",base,exp,power(base,exp));
    return 0;

}
int power(int base,int exp)
{
    if(exp==0)
    return 1;
    else 
    return base *power(base,exp-1);

}