from sys import stdin

#Following is the Node class already written for the Linked List
class Node :
    def __init__(self, data) :
        self.data = data
        self.next = None


def reverseLinkedListRec(head) :
	#Your code goes here
    if head==None:
        return head
    if head.next==None:
        return head
    smallhead=reverseLinkedListRec(head.next)
    head.next.next=head
    head.next=None
    return smallhead

def kReverse(head, n) :
    if n==0:
        return head
    cur=head
    prev=None
    next=None
    count=0
    while cur and count<n:
        next=cur.next
        cur.next=prev
        prev=cur
        cur=next
        count+=1
    if next:
        head.next=kReverse(next,n)
    return prev


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




def printLinkedList(head) :

    while head is not None :
        print(head.data, end = " ")
        head = head.next

    print()


#main
t = int(stdin.readline().rstrip())

while t > 0 :
    
    head = takeInput()
    k = int(stdin.readline().strip())

    newHead = kReverse(head, k)
    printLinkedList(newHead)

    t -= 1
