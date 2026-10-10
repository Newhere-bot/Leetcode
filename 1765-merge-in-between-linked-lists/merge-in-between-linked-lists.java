/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode before = list1;

        // Reach the node just before index a
        for (int i = 0; i < a - 1; i++) {
            before = before.next;
        }
        ListNode after = before;
        // Reach the node at index b + 1
        for (int i = 0; i <= b - a + 1; i++) {
            after = after.next;
        }
        // Connect list1 before the removed section to list2
        before.next = list2;
        // Find the last node of list2
        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }
        // Connect list2 to the remaining part of list1
        tail.next = after;
        return list1;
    }
}