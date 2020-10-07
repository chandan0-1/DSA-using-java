## Read input as specified in the question.
## Print output as specified in the question.
# Problem ID 328 Midpoint LL
import sys
sys.setrecursionlimit(10**8)
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def reverseRecursive(head):
    if head is None:
        return None
    if head.next==None:
        return head
    smallhead=reverseRecursive(head.next)
    head.next.next=head
    head.next=None
    
    return smallhead
def nextNumber(head):
    # carry=0
    newHead=reverseRecursive(head)
    cur=newHead
    temp=cur.data+1
    cur.data=temp%10
    carry=temp//10
    cur=cur.next
    while cur:
        # print(cur.data)
        temp=cur.data+carry
        cur.data=temp%10
        carry=temp//10
        cur=cur.next
    newHead=reverseRecursive(newHead)
    if carry>0:
        n=Node(carry)
        n.next=newHead
        newHead=n
    return newHead
        
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
    while head is not None:
        print(head.data,end= ' ')
        head = head.next
    return

# Main
# Read the link list elements including -1
arr=[int(ele) for ele in input().split()]
# Create a Linked list after removing -1 from list
l = ll(arr[:-1])
head = nextNumber(l)
printll(head)
