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
    public ListNode detectCycle(ListNode head) {
        // Declaring and initializing a slow and fast pointer
        ListNode slow = head, fast = head;
        
        // Loop while elements exist
        while (fast != null && fast.next != null) {
            // Advance slow pointer to the next element
            slow = slow.next;
            
            // Advance fast pointer to the next element
            fast = fast.next.next;
            
            // If statement to check if a cycle was found and both pointers meet
            if (slow == fast) break;
        }
        
        // Return null if no more elements to traverse
        if (fast == null || fast.next == null) return null;
        
        // Loop to advance the head and slow pointer
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}