
from sys import stdin

def checkRedundantBrackets(s) :
    # if len()
    # st=[]
    # for i in range(len(s)):
    #     if s[i]==")" and st[-1]=="(":
    #         return True
    #     if s[i]==')':
    #         while st[-1]!="(":
    #             st.pop()
    #         st.pop()
    #     else:
    #         st.append(s[i])
    # return False
    st=[]
    for i in range(len(s)):
        if s[i]==")":
            # return True
            if s[i]==')' and  st[-1]=="(":
                return True
            count=0
            while st[-1]!="(":
                count+=1
                st.pop()
            if count==1:
                return True 
            st.pop()
        else:
            st.append(s[i])
    # if len(st)==0:
    #     return True
# else:
    return False

#main
expression = stdin.readline().strip()

if checkRedundantBrackets(expression) :
	print("true")

else :
	print("false")

