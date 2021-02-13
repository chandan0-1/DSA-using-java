
def fun(n,arr):
    s = sum(arr)
    c = 0
    for i in arr:
        if (s-i) % 2 == 0:
            c+=1
    return c
n = int(input())
arr = [int(x) for x in input().split()]
print(fun(n,arr))
