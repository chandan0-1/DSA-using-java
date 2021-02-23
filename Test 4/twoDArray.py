m,n=map(int,input().split())
l=[]
for i in range(m):
    l.append(input().split())
# m=3    
for j in l:
    for i in range(m):
        print(*j)
    m-=1
    
    
