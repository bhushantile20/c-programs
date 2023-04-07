#include<stdio.h>
#include<stdlib.h>
#include "del.h"

int main()
{
    int ch,n,i,data;
    struct bst *newnode,*root,*temp,*copyroot,*mirrorroot;
    root=NULL;
    while(1)
    {
        printf("\n1.Insert\n");
        printf("\n2.Delete\n");
        printf("\n3.zal ka delete\n");
         printf("\n4.Exit\n");
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
         case 2:printf("Enter node for delete:");
                   scanf("%d",&data);
                   root=delete1(root,data);
                   break;
         case 3:printf("inorder= ");
                    inorder(root);
                    break;
        case 4:exit(0);
             default:printf("Invalid Choice\n");
        }
    }
}
