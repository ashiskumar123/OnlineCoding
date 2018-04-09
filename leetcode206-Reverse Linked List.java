/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null)
            return null;
        ListNode prev = null;
        
        while(true){
            ListNode nxt = head.next;
            head.next = prev;
            prev = head;
            
            if(nxt==null)
                break;
            else
                head = nxt;
                
        }
        
        return head;
    }
}
