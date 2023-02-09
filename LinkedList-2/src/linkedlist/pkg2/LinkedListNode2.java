package linkedlist.pkg2;

public class LinkedListNode2 {
     
    static Node head;
    
    static class Node
    {
        int data; 
        Node next;
        
        Node(int data)
        {
            this.data = data;
            next = null;
        } 
    }
    
    public void delete(int key)
    {
        Node temp = head;
        Node prev = null;
        
        while(temp != null && temp.data == key)
        {
            head = temp.next;
            temp = head;
        }
        
        while(temp != null)
        {
            while(temp != null && temp.data != key)
            {
                prev = temp;
                temp = temp.next;
            }
            if(temp == null)
            
                return;
            
                prev.next = temp.next;
                temp = prev.next;  
        }
    }
    
    public void print()
    {
        Node node = head;
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
