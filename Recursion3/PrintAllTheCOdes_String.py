
def fun(s,ans):
    if len(s)==0:
        print(ans)
        return 
    
    smalloutput1 = fun(s[1:],ans + chr(ord("a")+int(s[0])-1))
    
    if len(s)>=2 and int(s[0:2])<=26:
        smalloutput2 = fun(s[2:],ans + chr(ord("a")+int(s[0:2])-1))
    # return 
        
    
    
l=[]  
ans=fun(input(),"")
for i in l:
    print(i)
