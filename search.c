
#include<stdio.h>
#include<stdlib.h>
#include"search.h"
int main()
{
    int ch,n,i,data;
    struct bst *newnode,*root,*temp,*copyroot,*mirrorroot;
    root=NULL;
    while(1)
    {
        printf("1.Insert\n");
        printf("2.Search\n");
        printf("7.Exit\n");
        printf("Enter your choice :");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:printf("how many node are you need ");
                    scanf("%d",&n);
                for(i=0;i<n;i++)
                    {
                newnode=(struct bst*)malloc(sizeof(struct bst));
                newnode->lchild=NULL;
                newnode->rchild=NULL;
                    printf("Enter node data:");
                    scanf("%d", &newnode->data);
                            if(root==NULL)
                                root=newnode;
                            else
                                insert(root,newnode);

                    }
                            break;
          case 2:printf("\n Enter the node value to be searched:\n");
                   scanf("%d",&data);
                   temp=search(root,data);
                   if(temp==NULL)
                        printf("\n Node NOt Found\n");
                   else
                        printf("\nNode Found\n");
                   break;

          case 3:exit(0);

        }
     }
   }
