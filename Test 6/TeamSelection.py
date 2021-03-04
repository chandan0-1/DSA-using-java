
def fun(n,l,i,ans):
    if len(ans) == 12:
        print(*ans)
        return
    if i == n:
        return
    
    
    fun(n,l,i+1,ans + [l[i]])
    fun(n,l,i+1,ans)


n = int(input())
l = [int(x) for x in input().split()]
fun(n,l,0,[])

