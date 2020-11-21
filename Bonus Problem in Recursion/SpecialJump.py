def fun(i,n,step):
    if i==n:
        return 0
    if i>n or i<-n:
        return -1
    
    first = fun(i-step,n,step+1)
    second = fun(i+step,n,step+1)
    
    if first!=-1 and second!=-1:
        return 1+min(first,second)
    
    if second!=-1:
        return 1+second
    
    if  first!=-1:
        return 1+first
    
    return -1
    
print(fun(0,int(input()),1))  
