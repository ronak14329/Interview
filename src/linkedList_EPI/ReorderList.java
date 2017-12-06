/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *  Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
public class ReorderList {

	/**
	 * @param args
	 */
	
	public static ListNode reverse(ListNode head){
		ListNode prev = null;
		ListNode curr = head;
		while(curr != null){
			ListNode temp = curr.next;
			curr.next = prev ;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	 public static void reorderList(ListNode head) {
	      if (head == null || head.next == null)
	          return;
	      
	      // step 1. cut the list to two halves
	      // prev will be the tail of 1st half
	      // slow will be the head of 2nd half
	      ListNode prev = null, slow = head, fast = head, l1 = head;
	      
	      while (fast != null && fast.next != null) {
	        prev = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	      }
	      
	      prev.next = null;
	      
	      // step 2. reverse the 2nd half
	      ListNode l2 = reverse(slow);
	      
	      // step 3. merge the two halves
	      merge(l1, l2);
	    }
	    
//	    ListNode reverse(ListNode head) {
//	      ListNode prev = null, curr = head, next = null;
//	      
//	      while (curr != null) {
//	        next = curr.next;
//	        curr.next = prev;
//	        prev = curr;
//	        curr = next;
//	      }
//	      
//	      return prev;
//	    }
	    
	   public static void merge(ListNode l1, ListNode l2) {
	      while (l1 != null) {
	        ListNode n1 = l1.next, n2 = l2.next;
	        l1.next = l2;
	        
	        if (n1 == null)
	          break;
	            
	        l2.next = n1;
	        l1 = n1;
	        l2 = n2;
	      }
	    }
	
//	public static ListNode reorderList(ListNode head){
//		if(head == null || head.next == null)return head;
//		// find the middle
//		ListNode slow = head;
//		ListNode fast = head;
//		//ListNode res = head;
//		
//		while(fast.next!=null && fast.next.next !=null){
//			slow = slow.next;
//			fast = fast.next.next;
//		}
//		System.out.println(slow.val);
//		ListNode prev = slow;
//		slow = reverse(slow.next);
//		System.out.println(slow.val);
//		prev.next = slow;
//		ListNode dummyHead = new ListNode(0);
//		//dummyHead.next = head;
//		ListNode res = dummyHead;
//		fast = head;
//		while(fast != prev.next){
//			res.next = fast;
//			fast = fast.next;
//			res = res.next;
//			res.next = slow;
//			slow = slow.next;
//			res = res.next;
//		}
//		return head;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        ListNode res = head;
        		reorderList(head);
        while(res!=null){
        	System.out.print(res.val +"->");
        	res = res.next;
        }
	}

}
