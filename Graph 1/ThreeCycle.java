
def edge(adj,v1,v2):
    adj[v1][v2] = 1
    adj[v2][v1] = 1

def fun(arr,v,e):
    count = 0
    for i in range(v):
        for j in range(v):
            for k in range(v):
                if arr[i][j]>0 and arr[j][k]>0 and arr[k][i]>0:
                    count+=1
            
                
    return count//6
    
v,e = map(int,input().split())
adj = [[0 for i in range(v)] for j in range(v)]
for i in range(e):
    v1,v2 = map(int,input().split())
    edge(adj,v1,v2)
print(fun(adj,v,e))
