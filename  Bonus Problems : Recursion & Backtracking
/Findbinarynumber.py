def fun(s,ones,avlpls):
    if avlpls==0:
        print(s)
        return
    fun(s+"1",ones+1,avlpls-1)
    if ones>0:
	    fun(s+'0',ones-1,avlpls-1)

n=int(input())
fun("",0,n)
