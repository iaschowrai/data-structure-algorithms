package linkedList;

public class SwapNodeInPairs {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    // Helper to create linked list from array
    private static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper to print linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4});

        System.out.print("Original list: ");
        printList(head);

        // Swap adjacent nodes
        head = swapPairs(head);
        System.out.print("Swapped list: ");
        printList(head);

        // recursive approach

        ListNode head1 = createLinkedList(new int[]{5,6,7,8});
        System.out.print("Original list: ");
        printList(head1);
        head1 = swapPairsRecursive(head1);
        System.out.print("Recursive Swapped list: ");
        printList(head1);
    }

    // Function to swap every two adjacent nodes
    public static ListNode swapPairs(ListNode head) {
        // Dummy node to simplify pointer handling
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Traverse and swap in pairs
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // Swapping pointers
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Move pointers forward
            prev = first;
            head = first.next;
        }

        return dummy.next; // new head
    }

    public static ListNode swapPairsRecursive(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairsRecursive(second.next);
        second.next = first;

        return second;
    }


}
