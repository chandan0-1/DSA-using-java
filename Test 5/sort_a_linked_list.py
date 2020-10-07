## Read input as specified in the question.
## Print output as specified in the question.
## Read input as specified in the question.
## Print output as specified in the question.
# Problem ID 328 Midpoint LL
import sys
sys.setrecursionlimit(10**8)
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def nextNumber(head):
    l=[]
    while head:
        l.append(head.data)
        head=head.next
    l.sort()
    print(*l)
        
def ll(arr):
    if len(arr)==0:
        return None
    head = Node(arr[0])
    last = head
    for data in arr[1:]:
        last.next = Node(data)
        last = last.next
    return head
# Main
# Read the link list elements including -1
arr=[int(ele) for ele in input().split()]
# Create a Linked list after removing -1 from list
l = ll(arr[:-1])
head = nextNumber(l)
# printll(head)
