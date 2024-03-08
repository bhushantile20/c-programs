int tejas (int *x,int *y)
{
*x=25;

int z;
z=*x+*y;
return z;
getch();
}

void main()
{

int a,b,c;
printf("enter 2 numbers :");
scanf("%d %d",&a,&b);
c=tejas(&a,&b);
printf("%d",c);

}
