#include<stdio.h>
void main()
{
    FILE *a;
    char b[50];
    a=fopen("readmode.txt","r");//read mode in output
    //fscanf(a,"%s",b);
    fgets(b,6,a);
    printf("%s",b);




    getch();
}

