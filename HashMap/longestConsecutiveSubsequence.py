from sys import stdin

def longestConsecutiveSubsequence(arr,n): 
    ans = []
    count = 0
    d={}
    for i in arr:
        d[i] = True
        
    for i in arr:
        if d[i] == True:
            c1 = 0
            # Backword
            p = i
            while True:
                if p-1 in d:
                    c1 += 1
                    d[p-1] = False
                    p=p-1
                else:
                    break
                    
            c2 = 0
            f = i
            while True:
                if f+1 in d:
                    c2+=1
                    d[f+1] = False
                    f = f+1
                else:
                    break
                    
            maxlen = c1+c2+1
            # print(maxlen)
            if count < maxlen:
                ans = [[p,f]]
                count = maxlen
            elif count == maxlen:
                ans.append([p,f])
                
    temp = [-1] * 2
    if count == 1:
        return [ans[0][0]]
    # print(ans)
                
    for j in ans:
        if temp[0] != -1  :
            if arr.index(j[0]) < arr.index(temp[0]): #or arr.index(j[1]) < arr.index(temp[1]):
                temp = j
            
        else:
            temp = j
                
                
    return temp
                
            









def takeInput():
    #To take fast I/O
    n=int(stdin.readline().strip())
    if n==0:
        return list(),0
    arr=list(map(int,stdin.readline().strip().split( )))
    return arr,n

    
# Main 
arr,n=takeInput()
ans = longestConsecutiveSubsequence(arr,n) 
# This ans array contains two numbers, ie, start and end of longest sequence respectively
print(*ans)
