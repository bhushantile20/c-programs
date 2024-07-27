#include <stdio.h>
int max(int num1,int num2);
void main()
{
	int a=100;
	int b=200;
	int ret;
	
	ret=max(a,b);
	printf("max value is:%d\n",ret);
}
	int max(int num1,int num2)
	{
		int result;
		if(num1>num2)
			result=num1;
		else
			reuslt=num2;
		return result;
	}
