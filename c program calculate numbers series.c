void main()
{
    int i,a,s=0;
    printf("enter number :");
    scanf("%d",&a);
    for(i=1,s=0;i<=a;i++)
    {
        s=s+i;
        printf("%d\t",s);
    }

    getch();
}
