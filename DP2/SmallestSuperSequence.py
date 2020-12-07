
from sys import stdin

def lcs(s, t) :
	#Your code goes here
    #Recursive Approach
#     if len(s)==0 or len(t)==0:
#         return 0
    
#     if s[0]==t[0]:
#         return 1 + lcs(s[1:], t[1:])
    
#     if s[0]!=t[0]:
#         ans1 = lcs(s[1:],t)
#         ans2 = lcs(s, t[1:])
#         return max(ans1,ans2)

# 	________________________________Bottom Up Approach --------------------------
    
    
    # dp = [[0 for i in range(len(t)+1)] for j in range(len(s)+1)]
    # for i in range(len(s)-1,-1,-1):
    #     for j in range(len(t)-1,-1,-1):
    #         if s[i] ==t[j]:
    #             dp[i][j] = dp[i+1][j+1] + 1
    #         else:
    #             dp[i][j] = max(dp[i+1][j], dp[i][j+1], dp[i+1][j+1])
    # return dp[0][0]

    dp = [[0 for i in range(len(t)+1)] for j in range(len(s)+1)]
    for i in range(1,len(s)+1):
        for j in range(1,len(t)+1):
            if s[i-1] ==t[j-1]:
                dp[i][j] = dp[i-1][j-1] + 1
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1], dp[i-1][j-1])
    x=dp[len(s)][len(t)]
    len1 = len(s) - x
    len2 = len(t) - x
    return len1+len2+x
    

    


#main
s = str(stdin.readline().rstrip())
t = str(stdin.readline().rstrip())

print(lcs(s, t))
