#include<stdio.h>
#include<string.h>
typedef struct Books
{
    char title[50];
    char author[50];
    char subject[100];
    int book_id;

}Book;
int main()
{
    Book book;
    strcpy(book.title,"c programming");
    strcpy(book.author,"nilesh jagtap");
    strcpy(book.subject," C programming");
    book.book_id=5407;
    printf("|n Book author:%s\n",book .title);
    printf("Book subject :%s\n ",book.author);
    printf("Book subject :%s\n",book.subject);
    printf("Book book_id: %d\n",book.book_id);
    return 0;
    
}