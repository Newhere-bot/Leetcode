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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        dummy.next = head ;
        while(current.next != null){
            if(set.contains(current.next.val)){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return dummy.next;
    }
}