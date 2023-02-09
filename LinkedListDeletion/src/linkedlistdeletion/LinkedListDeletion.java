package linkedlistdeletion;

public class LinkedListDeletion {
    private static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode (int data){
            this.data = data;
            this.next = null;
        } 
    }
    public void display (ListNode head){
        if (head == null){
            return;
        }
        ListNode current = head;
        
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println(current);
    }
    public ListNode deleteLast(ListNode head){
        if (head == null){
            return head;
        }
        ListNode last = head;
        ListNode curr = null;
        
        while (last.next != null){
         curr = last;
         last = last.next;
        }
        curr.next = null;
        return last;
    
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(2); 
        ListNode second = new ListNode(3); 
        ListNode third = new ListNode(8); 
        
        head.next = second;
        second.next = third;
        
        LinkedListDeletion linkedListDeletion = new LinkedListDeletion();
        linkedListDeletion.display(head);
        System.out.println();
        
        ListNode last = linkedListDeletion.deleteLast(head);
        System.out.println("Deleted Node:" + last.data);
    }
}
