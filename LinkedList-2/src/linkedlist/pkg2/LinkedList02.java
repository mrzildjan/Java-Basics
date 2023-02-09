package linkedlist.pkg2;

import linkedlist.pkg2.LinkedListNode2.Node;

public class LinkedList02 {
    public static void main(String[] args) {
        
        LinkedListNode2 linkedlist = new LinkedListNode2();
        
        linkedlist.head = new Node(1);
        Node second = new Node(1);
        Node third = new Node(1);
        Node fourth = new Node(2);
        Node fifth = new Node(3);
        Node sixth = new Node(3);
        Node seventh = new Node(10);
        
        linkedlist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        
        System.out.println("LinkedList: ");
        linkedlist.print();
        
        System.out.println();
        
        int key = 1;
        
        linkedlist.delete(key);
        System.out.println("LinkedList After Deleting Occurences: ");
        linkedlist.print();
        
        System.out.println();
        
    }
    
}
