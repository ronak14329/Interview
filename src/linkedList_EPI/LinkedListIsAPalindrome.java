/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 * Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
public class LinkedListIsAPalindrome {

	/**
	 * @param args
	 */
	
	public static boolean isPalindrome(ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast!=null){ // incase when u have odd number of node 
			slow = slow.next;
		}
		slow = (ReverseALinkedList.reverse(slow));
		fast = head;
		
		while(slow!= null){
			if(slow.val!=fast.val){
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
	}

}
