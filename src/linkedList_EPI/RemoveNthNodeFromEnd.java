/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthNodeFromEnd {

	/**
	 * @param args
	 */
	
	public static ListNode removeNode(ListNode head, int n){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = head;
		int length =0;
		while(curr!=null){
			length++;
			curr = curr.next;
		}
		curr = dummy;// equate to dummy not to head because n can be equal to length
		length = length - n;
		while(length >0){
			length--;
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return dummy.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        ListNode res = removeNode(head, 3);
        while(res!= null){
        	System.out.print(res.val +"->");
        	res=  res.next;
        }
	}

}
