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
void copytree(struct bst *r,struct bst *c)
        {
        if(r==NULL)
        return;
        c->data=r->data;
    if(r->lchild)
        {
            c->lchild=(struct bst *)malloc(sizeof(struct bst));
            c->lchild->lchild=NULL;
            c->lchild->rchild=NULL;
            copytree(r->lchild,c->lchild);
        }
    if(r->rchild)
    {
        c->rchild=(struct bst *)malloc(sizeof(struct bst));
        c->rchild->lchild=NULL;
        c->rchild->rchild=NULL;
        copytree(r->rchild,c->rchild);
    }
}
    void inorder(struct bst *temp)
        {
            if(temp!=NULL)
            {
                inorder(temp->lchild);
                printf("%d\t",temp->data);
                inorder(temp->rchild);
            }
        }
struct bst *min1(struct bst *r)
{
    struct bst *c=r;
    while(c && c->lchild!=NULL)
        {
            c=c->lchild;
        }
return c;
}


struct bst *delete1(struct bst *r,int data)
{
    if(r==NULL)
    return r;
    if(data < r->data)
        r->lchild=delete1(r->lchild,data);
    else if(data > r->data)
            r->rchild=delete1(r->rchild,data);
    else
{
    if(r->lchild==NULL)
{
    struct bst *temp=r->rchild;
    free(r);
    return temp;
}
    else if(r->rchild==NULL)
{
    struct bst *temp=r->lchild;
    free(r);
    return temp;
}
    struct bst *temp=min1(r->rchild);
    r->data=temp->data;
    r->rchild=delete1(r->rchild,data);
}
    return r;
}
void mirror(struct bst *r,struct bst *c)
    {
        if(r==NULL)
        return ;
        c->data=r->data;
        if(r->lchild)
            {
            c->rchild=(struct bst *)malloc(sizeof(struct bst));
            c->rchild->lchild=NULL;
            c->rchild->rchild=NULL;
            mirror(r->lchild,c->rchild);
            }
        if(r->rchild)
            {
                c->lchild=(struct bst*)malloc(sizeof(struct bst));
                c->lchild->lchild=NULL;
                c->lchild->rchild=NULL;
                mirror(r->rchild,c->lchild);
            }
}
int compare(struct bst *r1,struct bst *r2)
        {
        if(r1==NULL && r2==NULL)
        return 1;
        if(r1==NULL || r2==NULL)
        return 0;
if(compare(r1->lchild,r2->lchild) && compare(r1->rchild,r2->rchild) && r1->data==r2->data)
return 1;
else
return 0;
}