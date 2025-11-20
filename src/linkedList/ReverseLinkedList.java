package linkedList;

import java.util.Arrays;

public class ReverseLinkedList {
    ListNode head;

    public void add(int val){
        ListNode newNode = new ListNode(val);

        if(head == null){
            head = newNode;
            return;
        }


    }

    public static void main(String[] args) {
        ListNode node = new ListNode();

        ReverseLinkedList list = new ReverseLinkedList();
        list.add(1);
        System.out.println(node.next);
        System.out.println(node.val);


    }
}
