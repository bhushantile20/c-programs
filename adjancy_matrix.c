//Read a graph as adjacency matrix and and print it
#include<stdio.h>
int mat[5][5];
void display();
int main()
{
	int i, j,n;
    	char reply;
	printf("How many vertices:");
	scanf("%d",&n);//n=4
    	for ( i = 0 ; i < n ; i++ )
    	{
        	for ( j = 0 ; j < n ; j++ )
        	{
              	printf("\n Is there edge between %d & %d ? (Y/N) :",i+1,j+1);
              	scanf(" %c", &reply);
            	if ( reply == 'y' || reply == 'Y' )
                		mat[i][j] = 1;
            		else
                		mat[i][j] = 0;
		}
    	} 
	display(n);
	return 0;
}

void display(int size)
{
	int i,j;
	printf("\n--------------------------------------------------------------------\n");
	printf("\nAdjecency Matrix is:\n\n");
	for(i=0;i<size;i++)
	{
		for(j=0;j<size;j++)
		{
			printf("%d\t",mat[i][j]);
		}
		printf("\n");
	}
}