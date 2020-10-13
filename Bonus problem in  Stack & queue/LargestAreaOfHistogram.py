def fun(arr):
	l=[0]*len(arr)
	l[-1]=len(arr)
	st=[]
	st.append(len(arr)-1)
	for i in range(len(arr)-2,-1,-1):
		while st and arr[st[-1]]>=arr[i]:
			st.pop()
		if len(st)==0:
			l[i]=len(arr)
		else:
			l[i]=st[-1]
		st.append(i)
	# print(l)

	r=[0]*len(arr)
	r[0]=-1
	st=[]
	st.append(0)
	for i in range(1,len(arr)):
		while st and arr[st[-1]]>=arr[i]:
			st.pop()
		if len(st)==0:
			r[i]=-1
		else:
			r[i]=st[-1]
		st.append(i)
	# print(r)
	result=0
	for i in range(len(l)):
		temp=(l[i]-r[i]-1)*arr[i]
		if temp>result:
			result=temp
	# print(result)
	return result
n,m=map(int,input().split())
if n>0:
    arr=[int(x) for x in input().split()]
    start=0
    end=m
    lst=[]
    # print(arr)
    for i in range(n):
        lst.append(arr[:m])
        arr=arr[m:]
    temp=lst[0]
    r=fun(temp)
    # print(r)
    for j in range(1,n):
        t=lst[j]
        for i in range(len(lst[1])):
            if t[i]!=0:
                temp[i]+=t[i]
            else:
                temp[i]=0
        # print(temp)

        x=fun(temp)
        # print(x)
        if x>r:
            r=x
    print(r)
else:
    print(0)