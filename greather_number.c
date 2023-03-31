#include<stdio.h>
int main()
{
    int num1,num2;
    printf("Input the values of num1:");
    scanf("%d",&num1);
    printf("Input the values of num2:");
    scanf("%d",&num2);
    if(num1 != num2)
    {
        printf("num1 is not equal to num2\n");
        if(num1 > num2)
        {
            printf("num1 is grather than num2\n");
        }
        else
        {
            printf("num2 is greather than num1\n");
        }
    }
    else
        {
           printf("Numer is equal to num2\n");
        }
        return 0;

}
