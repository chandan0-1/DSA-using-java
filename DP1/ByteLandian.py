from sys import stdin,setrecursionlimit
setrecursionlimit(10**9)

def helper(n,dp):
    if n==0:
        return 0
    if n==1:
        return 1
    ans = n
    if dp.get(n) ==None:
        ans1 = helper(n//2,dp);
        ans2 = helper(n//3,dp);
        ans3 = helper(n//4,dp)
        
        myans = ans1+ans2+ans3
        
        if myans > ans:
            ans = myans
        dp[n] = ans
    else:
        ans = dp[n]
    return ans

def bytelandian(n) :
    if n==0:
        return 0
    if n==1:
        return 1
    dp = {}
    # for i in range(n+1):
    #     dp[i] = -1
    # print(dp)
    dp[0] = 0
    dp[1] = 1
    dp[2] = 2
    return helper(n,dp)




# Main
n = int(stdin.readline().rstrip())
print(bytelandian(n))
