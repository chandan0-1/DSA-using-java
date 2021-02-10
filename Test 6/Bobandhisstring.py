

def fun(s):
    dp =[-1]*256
    ans = -1
    
    for i in range(len(s)):
        char = ord(s[i])
        if dp[char] == -1:
            dp[char] = i
        else:
            dist = i - dp[char]-1
            if dist > ans:
                ans = dist
    return ans
            

    
for i in range(int(input())):
    s=input()
    print(fun(s))
