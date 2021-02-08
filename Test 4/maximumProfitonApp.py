def fun(arr):
    arr.sort()
    count=1
    m=-1
    for i in range(len(arr)-1,-1,-1):
        c=arr[i]*count
        if c>m:
            m=c
        count+=1
    return m
n=int(input())
arr = [ int(x) for x in input().split()]
print(fun(arr))
