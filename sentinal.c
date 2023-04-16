#include<stdio.h>
#include<stdlib.h>
void generate(int num[10],int n);
void display(int num[10],int n);
int ssearch(int a[10],int n,int value);
int accept();
int main()
{
  int num[10],n,i,num1;
  printf("Enter How many numbers :");
  scanf("%d",&n);
  generate(num,n);
  printf("Randoms numbers are :");
  display(num,n);
  num1=accept();
  i=ssearch(num,n,num1);
  if(i==-1)
         printf("\nNumber not found");
  else
        printf("\nNumber found at position number %d",i+1);
  return 0;
}
void generate(int num[10],int n)
{
   int i;
   for(i=0;i<n;i++)
       num[i]=rand()%100;
}
void display(int num[10],int n)
{
   int i;
   for(i=0;i<n;i++)
        printf("%d ",num[i]);
}
int accept()
{
   int search;
   printf("\n Enter  number to be searched");
   scanf("%d",&search);
   return search;
}
int ssearch(int a[10],int n,int value)
{
    int i;
    a[n]=value;
    for(i=0;;i++)
    {
       if(a[i]==value)
        {
           break;
        }
    }
    if(i<n)
        return i;
    else
        return -1;
}                   
