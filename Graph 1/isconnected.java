import queue
class Graph:
    def __init__(self,n):
        self.n=n
        self.adj=[[0 for i in range(self.n)] for j in range(self.n)]
    
    def addEdges(self,v1,v2):
        self.adj[v1][v2]=1
        self.adj[v2][v1]=1
    
    def bfs(self):
        if self.n==0:
           return True 
        visited=[False] * self.n

        
        q = queue.Queue()
        q.put(0)
        
        while(q.qsize()>0):
            parent = q.get()
            visited[parent] = True
            
            for i in range(self.n):
                if visited[i]==False and self.adj[parent][i]==1:
                    q.put(i)
                    visited[i] = True
                    
        for i in visited:
            if i==False:
                return False
            
        return True

                    
            
            
    
        

V,E=map(int,input().split())
g=Graph(V)
for i in range(E):
    v1,v2=map(int,input().split())
    g.addEdges(v1,v2)
# v1,v2=map(int,input().split())
ans=g.bfs()
if ans:
    print("true")
else:
    print("false")
