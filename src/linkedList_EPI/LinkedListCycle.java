/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Given a linked list, return the node where the cycle begins. If there is no cycle, return null.



 */
public class LinkedListCycle {

	/**
	 * @param args
	 */
	public static ListNode detectCycle(ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				while(head!=slow){
					head = head.next;
					slow = slow.next;
				}return slow;
			}
		}return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
        head.next = new ListNode(7);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next = head.next.next;
        
        ListNode res = detectCycle(head);
        System.out.println(res.val);
//        while(res!= null){
//        	System.out.print(res.val +"->");
//        	res=  res.next;
//        }
	}

}
