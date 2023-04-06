#include<stdio.h>
#include<stdlib.h>
#include"mirrrror.h"

int main()
{
    int ch,n,i,data;
    struct bst *newnode,*root,*temp,*copyroot,*mirrorroot;
    root=NULL;
    while(1)
    {
        printf("\n1.Insert\n");
        printf("2.CopyTree\n");
        printf("3.Delete\n");
        printf("4.inorder\n");
        printf("5.mirror\n");
        printf("6.compare\n");
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
            case 2:copyroot=(struct bst*)malloc(sizeof(struct bst));
                   copyroot->lchild=NULL;
                   copyroot->rchild=NULL;
                   copytree(root,copyroot);
                   inorder(copyroot);
                   break;

             case 3:printf("Enter node for delete:");
                   scanf("%d",&data);
                   root=delete1(root,data);
                   break;

             case 4:printf("Inorder Traversal= ");
                    inorder(root);
                    break;

             case 5:mirrorroot=(struct bst*)malloc(sizeof(struct bst));
                    mirrorroot->lchild=NULL;
                    mirrorroot->rchild=NULL;
                    mirror(root,mirrorroot);
                    inorder(mirrorroot);

             case 6:i=compare(root,copyroot);
                    if(i==1)
                        printf("Tree is Equal\n");
                    else
                        printf("Tree is not Equal\n");
                     break;

             case 7:exit(0);
             default:printf("Invalid Choice\n");
        }
    }
}
