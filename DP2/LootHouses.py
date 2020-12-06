from sys import stdin

def maxMoneyLooted(houses, n) :
    if len(houses)==0:
        return 0
        
	#Your code goes here
    dp = [-1]*(n)
    
    dp[0] = houses[0]
    dp[1] = max(houses[1],dp[0])
    
    for i in range(2,n):
        dp[i] = max(dp[i-1], houses[i]+ dp[i-2])
    # print(dp)
    return dp[n-1]



#taking input using fast I/O method
def takeInput() :
    n = int(stdin.readline().rstrip())
    if n == 0 :
        return list(), 0
    
    arr = list(map(int, stdin.readline().rstrip().split(" ")))
    return arr, n


#main
arr, n = takeInput()
print(maxMoneyLooted(arr, n))
