def calcfact(x):
    if x==1:
        return 1
    else:
        return(x *calcfact(x-1))
    num=4
print("The factorial of",num,"is",calcfact(num))
