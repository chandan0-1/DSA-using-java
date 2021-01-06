from sys import stdin
from collections import OrderedDict

def intersection(arr1, arr2, n, m) :
    arr1.sort()
    d1=OrderedDict()
    d2={}
    for i in arr1:
        d1[i] = d1.get(i,0)+1
        
    for i in arr2:
        d2[i] = d2.get(i,0)+1
        
    for i in d1:
        if i in d1 and i in d2:
            for _ in range(min(d1[i],d2[i])):
                print(i,end=" ")
    print()
        

# Taking input using fast I/O method
def takeInput() :
    n = int(stdin.readline().strip())
    
    if n == 0 :
    	return list(), 0

    arr = list(map(int, stdin.readline().strip().split(" ")))
    return arr, n


#main
t = int(stdin.readline().strip())

while t > 0 :

    arr1, n = takeInput()
    arr2, m = takeInput()
    intersection(arr1, arr2, n, m)
    print()

    t -= 1
