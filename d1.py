n=input("Entered any % integers").split()
s1=set(n)
for i in s1:
	c=n.count(i)
	if c>1:
		print("Dublicate"+i)
	else:
		print("UNIQUE"+i)
		