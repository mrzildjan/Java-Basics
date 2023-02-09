package linkedlist.pkg3;

import linkedlist.pkg3.LinkedListNode03.Node;

public class LinkedList03 {
    public static void main(String[] args) {
        
        LinkedListNode03 linkedlist = new LinkedListNode03();
        
        linkedlist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        
        linkedlist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        System.out.println("LinkedList: ");
        linkedlist.print();
        
        System.out.println();
        
        System.out.println("No. of Nodes: " + linkedlist.countNode());
    }
    
}
