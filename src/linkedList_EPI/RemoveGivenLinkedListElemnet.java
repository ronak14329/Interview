/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *
 */
public class RemoveGivenLinkedListElemnet {

	/**
	 * @param args
	 */
	
	public static ListNode removeElement(ListNode head, int val){
	    if(head == null)return head;
	    ListNode curr = head;
	     while( curr.next!= null){
	         if(curr.next.val == val)curr.next = curr.next.next;
	         else curr = curr.next;
	     }
	     return head.val ==val ? head.next: head;
	 } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
         
        ListNode res =removeElement(head,2);
        while(res!=null){
        	System.out.print(res.val +"->");
        	res= res.next;
        }
	}

}
