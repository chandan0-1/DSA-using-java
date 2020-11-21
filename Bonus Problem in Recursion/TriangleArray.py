def fun(arr):
    if len(arr)==1:
        return arr[0]
    
    for i in range(len(arr)-1):
        arr[i]=arr[i]+arr[i+1]
    return fun(arr[:-1])

n=int(input())
l=[int(x) for x in input().split()]
print(fun(l)%1000000007)
