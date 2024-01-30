int main()
{
     int i,fact=1,number;
     printf("Enter a number");
     scanf("%d",&number);
     for(i=1;i<=number;i++)
     {
         fact=fact=fact*i;
     
}
printf("factorial of %d is :%d",number,fact);
return 0;
}