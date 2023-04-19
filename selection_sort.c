#include<stdio.h>
#include<stdlib.h>
void generate(int num[10],int n);
void display(int num[10],int n);
void ssort(int a[10],int n);
int main()
{
  int  num[10],n;
  printf("How many number ");
  scanf("%d",&n);
  generate(num,n);
  printf("Randoms number are :");
  display(num,n);
  printf("\n");
  ssort(num,n);
  printf("Sorted number are :");
  display(num,n);
  printf("\n");
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
void ssort(int a[10],int n)
{
   int i,j,temp;
   for(i=0;i<n-1;i++)
   {
      for(j=i+1;j<n;j++)
        {
           if(a[i]>a[j])
           {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
          }
      }
   }
}      
                             
  
