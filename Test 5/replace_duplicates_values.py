## Read input as specified in the question.
## Print output as specified in the question.
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def linearSearchRecursive(head):
    d=[]
    D=[]
    temp=head;
    cur=head;
    prev=None;
    while temp:
        d.append(temp.data)
        temp=temp.next
    # print(d)
    M=max(d)+1
    while cur:
        if cur.data in D:
            cur.data=M
            M+=1
        else:
            D.append(cur.data)
            
        # d.append(temp.data)
        cur=cur.next
    return head;
def ll(arr):
    if len(arr)==0:
        return None
    head = Node(arr[0])
    last = head
    for data in arr[1:]:
        last.next = Node(data)
        last = last.next
    return head
def printll(head):
    while head:
        print(head.data, end=' ')
        head = head.next
    print()
from sys import setrecursionlimit
setrecursionlimit(11000)
arr=list(int(i) for i in input().strip().split(' '))
l = ll(arr[:-1])
index = linearSearchRecursive(l)
printll(index)

