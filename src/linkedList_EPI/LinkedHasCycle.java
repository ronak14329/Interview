/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Given a linked list, determine if it has a cycle in it.




 */
public class LinkedHasCycle {

	/**
	 * @param args
	 */
	
	public static boolean hasCycle(ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next.next;
        
        System.out.println(hasCycle(head));
	}

}
