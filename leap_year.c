#include<stdio.h>
int main()
{
   
    int year;
    printf("Enter the year to check if it is a leap year: ");
    scanf("%d", &year);
    
    if(year % 4 == 0){
        if(year % 100 == 0){  
            if(year % 400 == 0)
                printf("\n\n%d is a leap year\n", year);
            else 
                printf("\n\n%d is not a leap year\n", year);
        }
        else
            printf("\n\n%d is a leap year\n", year);
    }
    else
        printf("\n\n%d is not a leap year\n", year);

  
    return 0;
}