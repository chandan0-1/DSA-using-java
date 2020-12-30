
from sys import stdin

def lcs(s, t) :

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
