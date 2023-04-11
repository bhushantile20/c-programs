#include<stdio.h>
#include<conio.h>
int main()
{
    int i, j, space=8;
    for(i=0; i<5; i++)
    {
        for(j=0; j<space; j++)
            printf(" ");
        space = space-2;
        for(j=0; j<=i; j++)
            printf("* ");
        printf("\n");
    }
    getch();
    return 0;
}