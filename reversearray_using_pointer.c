#include <stdio.h>
int main()
{
     int n,i,arr1[15];
     int *pt;
     printf("\n\n pointer the elements of an array in reverse order:\n");
     printf("------------------------------------------------\n");

     printf("input the unmber of elements to store int the array (max15):");
     scanf("%d",&n);
     pt=&arr1[0];
     printf("Input %d number of elemnts in the array :\n",n);
     for(i=0;i<n;i++);
     {
        printf("elemnts -%d:",i+1);
        scanf("%d",pt);
        pt++;

     }
     pt=&arr1[n-1];
     printf("\n The elemnts of arrray is reverse order are:");
     for (i=n;i>0;i--)
     {
         printf("\n elemnts -%d:%d",i,*pt);
         pt--;

     }
     printf("\n \n");
}


