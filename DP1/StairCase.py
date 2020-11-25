from sys import stdin 

def staircase(n,dp) :
    if n==0 or n==1:
        return 1
    if n==2:
        return 2
    
    
    if dp[n-1] == -1:
        ans1 = staircase(n-1,dp)
        dp[n-1] = ans1
    else:
        ans1 = dp[n-1]
    
    if dp[n-2]==-1:
        ans2 = staircase(n-2,dp)
        dp[n-2] = ans2
    else:
        ans2 = dp[n-2]
        
        
    if dp[n-3] == -1:
        ans3 = staircase(n-3,dp)
        dp[n-3] = ans3
    else:
        ans3 = dp[n-3]
    
    dp[n] = ans1+ans2+ans3
    return dp[n]



#main
n = int(stdin.readline().rstrip())
dp = [-1 for i in range(n+1)]
print(staircase(n,dp))
