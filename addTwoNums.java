/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
    			return new ListNode(0);
    		} else if(l1 == null) {
    			return l2;
    		} else if (l2 == null){
    			return l1;
    		} else {
    	        return solve(l1, l2);
    	        
    		}
        
    }
    
     private ListNode solve(ListNode l1, ListNode l2) {
		int sum = l1.val + l2.val;
		int carry = sum / 10;
		ListNode head = new ListNode(sum % 10);
		ListNode current = head;
		l1 = l1.next;
		l2 = l2.next;
		while (l1 != null || l2 != null) {
			if (l2 == null) {
				sum = l1.val + carry;
				l1 = l1.next;
			} else if (l1 == null) {
				sum = l2.val + carry;
				l2 = l2.next;
			} else {
				sum = l1.val + l2.val + carry;
				l1 = l1.next;
				l2 = l2.next;
			}
			current.next = new ListNode(sum % 10);
			carry = sum / 10;
			current = current.next;
		}
		if (carry != 0) {
			current.next = new ListNode(carry);
		}
		return head;
	}
}
   