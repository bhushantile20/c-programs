#include<stdio.h>
#include<stdlib.h>
struct bst
{
int data;
struct bst *lchild,*rchild;
}node;
void insert(struct bst *r,struct bst *new1)
         {

             if(new1->data < r->data)
                {
             if(r->lchild==NULL)
                r->lchild=new1;
             else
                 insert(r->lchild,new1);
                 }
            if(new1->data > r->data)
          {
            if(r->rchild==NULL)
                r->rchild=new1;
            else
                insert(r->rchild,new1);
          }
      }


struct bst*search(struct bst *r,int key)
{
    struct bst*temp;
    temp=r;
    while(temp!=NULL)
    {
        if(temp->data==key)
           return temp;
        if(key <temp->data)
          temp=temp->lchild;
        else
          temp=temp->rchild;
    }
    return NULL;

}
