## Read input as specified in the question.
## Print output as specified in the question.
## Read input as specified in the question.
## Print output as specified in the question.
def getdigit(n):
    if n==2:
        return "abc"
    elif n==3:
        return "def"
    elif n==4:
        return "ghi"
    elif n==5:
        return "jkl"
    elif n==6:
        return "mno"
    elif n==7:
        return "pqrs"
    elif n==8:
        return "tuv"
    else:
        return "wxyz"

    
def fun(n,output):
    if n==0:
        print(output)
        return
        # l=[""]
        # return l
    d=getdigit(n%10)
    for i in d:
    	smalloutput= fun(n//10,i+output)
    # l=[]
    # for i in smalloutput:
    #     for j in :
    #         l.append(i+j)
    #         # print(i+j)
    # return l
        
ans=fun(int(input()),"")
# for i in ans:
#     print(i)
