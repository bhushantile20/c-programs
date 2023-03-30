#include<stdio.h>
#include<stdlib.h>
#include "BST.h"
int main()
{
    int ch,n,i,value,cnt;
    struct bst *newnode,*root,*temp,*copyroot,*mirrorroot;
    root=NULL;
    while(1)
    {

        printf("\n********Binary Search Tree******\n");
        printf("1.Insert\n");
        printf("2.Delete\n");
        printf("3.Search\n");
        printf("4.Count Total Nodes\n ");
        printf("12.Exit");
        printf("Enter your  choice");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:printf("\n How many nodes to create:");
                   scanf("%d",&n);
                   for(i=0;i<n;i++);
                   {
                     newnode=create();
                     printf("\n Enter the node data:");
                     scanf("%d",&newnode->data);
                     if(root== NULL)
                           root=newnode;
                     else
                        insert(root,newnode);

                   }
                   break;
            case 2:printf("\n Enter the node value to be deleted:");
                   scanf("%d",&value);
                   root=deleteNode(root,value);
                   break;  
            case 3:printf("\n Enter the node value to be searhed:");
                   scanf("%d",&value);
                   temp=search(root,value);
                   if(temp==NULL)
                        printf("\n Node NOt Found\n");
                   else
                        printf("\nNode Found\n");
                   break;
            case 4:cnt=count(root);
                   printf("\n Total leaf Nodes =%d\n",cnt);
                   break;
            case 5:cnt=countleaf(root);
                   printf("\n Total leaf Nodes=%d\n",cnt);
                   break;
            case 6:cnt=countleaf(root);
                   printf("\n total Non leaf Nodes =%d\n",cnt);
                   break;
            case 7:printf("\n Inorder Traversal =");
                   inorder(root);
                   break;
            case 8:printf("\nPostorder Traversal=");
                   postorder(root);
                   break;
            case 9:printf("\npreorder Traversal=");
                   preorder(root);
                   break;
            case 10:copyroot=create();
                    copytree(root,mirrorroot);
                    inorder(copyroot);
                    break;
            case 11:mirrorroot=create();
                    mirror(root,mirrorroot);
                    inorder(mirrorroot);
                    break;
            case 12:exit(0);
            default:printf("\n Invallid Choice\n");
                                              
        }//switch

    }//while
}//main