import queue
class Graph:
    def __init__(self,n):
        self.n=n
        self.adj=[[0 for i in range(self.n)] for j in range(self.n)]
    
    def addEdges(self,v1,v2):
        self.adj[v1][v2]=1
        self.adj[v2][v1]=1
    
    def bfs(self,sv,ev):
        path = []
        
        
        visited=[False] * self.n
        p={}
        
        if sv<self.n and ev<self.n and self.adj[sv][ev] == 1:
            return [ev,sv]
        
        q = queue.Queue()
        q.put(sv)
        while(q.qsize()>0):
            parent = q.get()
            visited[parent] = True
            
            for i in range(self.n):
                if visited[i]==False and self.adj[parent][i]==1:
                    q.put(i)
                    p[i] = parent
                    visited[i] = True
                    
                    if i==ev:
                        path.append(i)
                        
                        break
                        
        
        
        j = ev
        while j in p:
            path.append(p[j])
            j=p[j]
        return path
                    
            
            
    
        

V,E=map(int,input().split())
g=Graph(V)
for i in range(E):
    v1,v2=map(int,input().split())
    g.addEdges(v1,v2)
v1,v2=map(int,input().split())
ans=g.bfs(v1,v2)
print(*ans)
