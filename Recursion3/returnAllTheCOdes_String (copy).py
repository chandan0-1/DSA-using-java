
def fun(s,ans,l):
    if len(s)==0:
        l.append(ans)
        return 
    
    smalloutput1 = fun(s[1:],ans + chr(ord("a")+int(s[0])-1),l)
    
    if len(s)>=2 and int(s[0:2])<=26:
        smalloutput2 = fun(s[2:],ans + chr(ord("a")+int(s[0:2])-1),l)
    return 
        
    
    
l=[]  
ans=fun(input(),"",l)
for i in l:
    print(i)
