add_num(num):
if num<0:
    printf("Enter a positive number")
else:
    sum=0
    while(num >0):
        sum+= num
        num -=1
    return(sum)
    num1=int (input("Enter a number:"))
    print("sum of natural number is ",add_num(num1))
    