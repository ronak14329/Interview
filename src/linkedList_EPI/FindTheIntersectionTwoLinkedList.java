/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *

For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


 */
public class FindTheIntersectionTwoLinkedList {

	/**
	 * @param args
	 */
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
		 if(headA==null || headB== null)return null;
	       ListNode a = headA;
	       ListNode b = headB;
	       while(a!=b){
	           a= a==null ? headB : a.next;
	           b= b==null? headA :b.next;
	       }
	       return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6 );
        ListNode head1 = new ListNode(7);
        head1.next = new ListNode(8);
        head1.next.next = head.next.next;
         System.out.println((getIntersectionNode(head, head1)).val);    
        
	}

}
