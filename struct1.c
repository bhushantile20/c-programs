#include<stdio.h>
#include<string.h>
struct student
{
    int id;
    char name[20];
    float percentage;

};
int main()
{
    struct student record={0};
    record.id=11;
    strcpy(record.name,"Bhushan");
    record.percentage=72.5;
    printf("\nId is :%d\n",record.id);
    printf("Name is :%s \n",record.name);
    printf("Percentage is : %f \n",record.percentage);
    return 0;
}