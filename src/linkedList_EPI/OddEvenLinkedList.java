/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *
 */
public class OddEvenLinkedList {

	/**
	 * @param args
	 */
	
	public static ListNode oddEven(ListNode head){
		if(head!=null){
			ListNode odd = head;
			ListNode even = head.next;
			ListNode evenHead = even;
			while(even!=null && even.next!=null){
				odd.next = odd.next.next;
				even.next = even.next.next;
				odd = odd.next;
				even = even.next;
			}
			odd.next= evenHead;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
        
        ListNode res = oddEven(head);
        while(res!=null){
        	System.out.print(res.val +"->");
        	res= res.next;
        }
	}

}
