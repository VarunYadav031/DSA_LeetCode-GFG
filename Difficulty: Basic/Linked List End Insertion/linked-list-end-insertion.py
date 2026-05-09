'''    
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''

class Solution:
    def insertAtEnd(self, head, x):
        newnode=Node(x)
        curr=head
        if(head==None):
            return newnode
        while(curr.next!=None):
            curr=curr.next;
        curr.next=newnode
        return head
        
            
        
       
        