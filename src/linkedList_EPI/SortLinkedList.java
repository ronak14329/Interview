/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *
 */
public class SortLinkedList {

	/**
	 * @param args
	 */
	
	public static ListNode sortList(ListNode head){
		if(head==null || head.next==null)return head;
		ListNode prev = null;
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next != null){
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(slow);
		
		return merge(l1,l2);
	}
	
	public static ListNode merge(ListNode l1, ListNode l2){
		ListNode l = new ListNode(0);
		ListNode p = l;
		
		while(l1 !=null && l2 !=null){
			if(l1.val <l2.val){
				p.next = l1;
				l1 = l1.next;
			}else{
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if(l1 !=null)p.next=l1;
		if(l2 != null) p.next = l2;
		
		return l.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
        head.next = new ListNode(7);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(10);
        
        ListNode res = sortList(head);
        while(res !=null){
        	System.out.print(res.val +"->");
        	res = res.next;
        }
        System.out.print("null");
	}

}
