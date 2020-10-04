import sys
from sys import stdin
sys.setrecursionlimit(1000000)

#Following is the Node class already written for the Linked List
class Node :
    def __init__(self, data) :
        self.data = data
        self.next = None


def length(head):
    if head==None:
        return 0
    return 1+length(head.next)

def appendLastNToFirst(head, n) :
    l=length(head)
    if n==0 or n>=l-1:
        return head
    prev=None
    cur=head
    c=l-n
    while c>0:
        prev=cur
        cur=cur.next
        c-=1
    prev.next=None
    # head.next=cur
    curr=cur
    while curr.next:
        curr=curr.next
    curr.next=head
    return cur


























#Taking Input Using Fast I/O
def takeInput() :
    head = None
    tail = None

    datas = list(map(int, stdin.readline().rstrip().split(" ")))

    i = 0
    while (i < len(datas)) and (datas[i] != -1) :
        data = datas[i]
        newNode = Node(data)

        if head is None :
            head = newNode
            tail = newNode

        else :
            tail.next = newNode
            tail = newNode

        i += 1

    return head


#to print the linked list 
def printLinkedList(head) :

    while head is not None :
        print(head.data, end = " ")
        head = head.next

    print()


#main
t = int(stdin.readline().rstrip())

while t > 0 :

    head = takeInput()
    n = int(stdin.readline().rstrip())

    head = appendLastNToFirst(head, n)
    printLinkedList(head)

    t -= 1 
