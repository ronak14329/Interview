/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.



 */
public class SwapPairNodes {

	/**
	 * @param args
	 */
	
	public static ListNode swapNode(ListNode head){
		if( head==null || head.next == null)return head;
		ListNode newhead = head.next;
		head.next = swapNode(newhead.next);
		newhead.next = head;
		return newhead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        ListNode res = swapNode(head);
        while(res!= null){
        	System.out.print(res.val +"->");
        	res=  res.next;
        }
	}

}
