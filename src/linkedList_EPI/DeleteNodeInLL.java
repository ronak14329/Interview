/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeInLL {

	/**
	 * @param args
	 */
	
	public static void deleteNode(ListNode node){
		node.val = node.next.val;
		node.next = node.next.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);
	        head.next.next.next.next.next = new ListNode(6);
	       
	        deleteNode(head.next.next);
	        while(head!=null){
	        	System.out.println(head.val);
	        	head = head.next;
	        }
	}

}
