## Read input as specified in the question.
## Print output as specified in the question.
#Write your code here

def fun(n,i,step):
    result = 1
    
    if step==n+1:
        # print(result)
        return result-1
    val=i
    # print(step,val)
    for j in range(step):
        result*=val
        val+=1
    # print(result)
    
    return result + fun(n,val,step+1)
    

n=int(input())

print(fun(n,1,1))
