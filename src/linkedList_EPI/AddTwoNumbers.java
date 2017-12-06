/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

	/**
	 * @param args
	 */
	
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummyHead= new ListNode(0);
	        ListNode p = l1;
	        ListNode q =l2;
	        ListNode curr = dummyHead;
	        int carr=0;
	        while(p!=null ||q!=null){
	            int x= (p!=null)?p.val:0;
	            int y=(q!=null)?q.val:0;
	            int digit = carr +x+y;
	            carr = digit/10;
	            curr.next= new ListNode(digit %10);
	            curr = curr.next;
	            if(p!=null) p =p.next;
	            if(q!=null) q =q.next;
	        }
	        if(carr>0){
	            curr.next= new ListNode(carr);
	        }
	        return dummyHead.next;
	            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(4);
        
        ListNode res =addTwoNumbers(head,head1);
        while(res!=null){
        	System.out.print(res.val +"->");
        	res= res.next;
        }
	}

}
