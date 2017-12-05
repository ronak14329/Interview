/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3
 */
public class RemoveDuplicateFromSortedList {

	/**
	 * @param args
	 */
	
	public static ListNode deleteDuplicates(ListNode head){
		ListNode current = head;
		while(current != null && current.next != null){
		if(	current.val == current.next.val){
			current.next = current.next.next;
		}else{
			current = current.next;
		}}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        ListNode out = deleteDuplicates(head);
        while(out!= null){
        	System.out.print(out.val +"->");
        	out = out.next;
        			
        }
	}

}
