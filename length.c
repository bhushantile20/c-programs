#include <conio.h>
#include<stdio.h>
int len(char *ptr);
main()
{
    char *str="gfdgfdgfg";
    int count;
    clrscr()
    printf("Enter thre string :");
    gets(str);
    count =len(str);
    printf("The lenth of the string is %d",count);
    printf("\n Press any key to continue:");
    getch();

}
int len(char *ptr)
{
     int i,count=0;
     for(i=0;ptr[i]!='\0';i++)
     count++;
     return count;
     
}