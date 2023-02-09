package linkedlist.pkg3;

public class LinkedListNode03 {
    
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
    
    public int countNode()
    {
        int count = 0;
        
        Node current = head;
        
        while(current != null)
        {
            count++;
            current = current.next;
        }
        return count;

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
