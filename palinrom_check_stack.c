//Program Demonstrating String Palindrome using stack:

#include <stdio.h>
#include<string.h>
#include <stdlib.h>
#define max 20
int top,stack[max];

void push(char x)
{
	stack[++top]=x;
}

char pop()
{
	return stack[top--];
}

int main()
{
	char str[max];
	int i;
	printf("Enter a string:");
	gets(str);//str=madam
	for(i=0;i<strlen(str);i++)
		push(str[i]);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]!=pop())
		{
			   printf("Not Palindrome");
			   exit(0);
		}
	}
	printf("Palindrome");
	return 0;
}
