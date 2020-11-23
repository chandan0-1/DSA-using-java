import math
import sys
sys.setrecursionlimit(1000000)
def fun(n):
    if (n==1):
        return 0
    return math.log(n) + fun(n-1)
n=int(input())
print(int(fun(n)))
