/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        // looping while both pointers do no equal each other
        while (slow != fast) {
            
            // if we reach the end and no cycle is found, return false
            if (fast == null || fast.next == null) {
                return false;
            }
            // slow traverses 1 node at a time
            slow = slow.next;
            
            // fast traverses 2 nodes at a time
            fast = fast.next.next;
        }
        
        // return true if a cycle exists
        return true;
    }
}