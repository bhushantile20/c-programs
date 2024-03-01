void main()
{
    int i,x;

    for(x=2;x<100;x++)
    {
        for(i=2;i<x;i++)
        {
            if(x%i==0)
            {
                break;
            }
        }
if(i==x)
    {
        printf("%d\t",x);
    }}



    getch();
}
