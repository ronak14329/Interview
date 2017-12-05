/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Reverse a sigly LinkedList
 */
public class ReverseALinkedList {

	/**
	 * @param args
	 */
	
	public static ListNode reverse(ListNode head){
	   ListNode prev = null;
	   ListNode curr = head;
	   while(curr != null){
		   ListNode temp = curr.next;
		   curr.next = prev;
		   prev = curr;
		   curr = temp;
	   }
	   return prev;
	}
	public static ListNode reverseLList(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode second = head.next;
        head.next = null;
        ListNode rest = reverseLList(second);
        second.next= head;
        return rest;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        ListNode reverseList = reverse(head);
        while( reverseList != null){
        	System.out.print(reverseList.val +"->");
        	reverseList = reverseList.next;
        }
       
	}

}
