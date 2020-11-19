import sys
sys.setrecursionlimit(10 ** 8)

def helper(arr,k,output):
    if len(arr)==0:
        # return []
        if k==0:
            return [[]]
        else:
            return None
    s1 = helper(arr[1:],k-arr[0],output)
    s2 = helper (arr[1:],k,output)
    output = []
    if s1!=None:
        for i in s1:
            output.append([arr[0]]+i)
    if s2!=None:
        for i in s2:
            output.append(i)
        
    return output


def subsetsSumK(arr, k) :
    return helper(arr,k,[])


#taking input
def takeInput() :
    n = int(input().strip())

    if n == 0 :
        return list(), 0

    arr = [int(element) for element in list(input().strip().split(" "))]
    return arr, n


#printing the list of lists
def printListOfList(liOfLi) :
    for li in liOfLi :
        for elem in li :
            print(elem, end = " ")
        print()

#main
arr, n = takeInput()

if n != 0 :
    k = int(input().strip())
    liOfLi = subsetsSumK(arr, k)

    printListOfList(liOfLi)


