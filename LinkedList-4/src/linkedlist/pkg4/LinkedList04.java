package linkedlist.pkg4;

import linkedlist.pkg4.LinkedListNode04.Node;
import static linkedlist.pkg4.LinkedListNode04.head;

public class LinkedList04 {
    
    public static void main(String[] args) {
        
    LinkedListNode04 linkedlist = new LinkedListNode04();
    
    linkedlist.head = new Node(1);
    Node second  = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);
    
    
    linkedlist.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;

    System.out.println("LinkedList: ");
    linkedlist.print(head);
    
    System.out.println();
    
    head = linkedlist.reverse(head);
    System.out.println("Reversed LinkedList: ");
    linkedlist.print(head);
    
    System.out.println("");
         
    }
    
}
