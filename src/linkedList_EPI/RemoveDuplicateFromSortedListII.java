/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 * 
For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDuplicateFromSortedListII {

	/**
	 * @param args
	 */
	public static ListNode deleteDuplicate(ListNode head){
		if(head == null)return head; // to check is head==null
		// create dummyhead
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode prev = dummyHead;
		ListNode curr = head;
		
		while(curr!=null){
			// if you found the duplicate node keep traversing so that u can remove at once the loop breaks
			while(curr.next!=null && curr.val == curr.next.val){
				curr = curr.next;
			}
			if(prev.next == curr){
				// no duplicate found
			prev = prev.next;
			}else{ // if duplicate found then it will remove the duplicate node
				prev.next = curr.next;
			}
			curr = curr.next;
		}return dummyHead.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        
        ListNode res = deleteDuplicate(head);
        while(res!=null){
        	System.out.print(res.val + "->");
        	res = res.next;
        }
        System.out.print("null");
	}

}
