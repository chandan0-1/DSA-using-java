# Write your code here
def helper(arr,n,i,j,count):
    if i >= n or i==-1 or j==-1 or j==n or arr[i][j] == 0 or arr[i][j] == -1:
        return 0
    
    
    if arr[i][j]==1:
        arr[i][j] = -1
        return 1 + helper(arr,n,i-1,j,count) + helper(arr,n,i+1,j,count) + helper(arr,n,i,j-1,count) + helper(arr,n,i,j+1,count)
    else:
        return 0
    


def fun(arr,n):
    count = 0
    for i in range(n):
        for j in range(n):
            if arr[i][j] == 1:
                ans = helper(arr,n,i,j,0)
                if ans > count:
                    count = ans
                # print(arr)
                
    return count
    
n=int(input())
l = [[int(x) for x in input().split()] for i in range(n)]
print(fun(l,n))

