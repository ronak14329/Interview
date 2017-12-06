/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *
 */
public class RotateList {

	/**
	 * @param args
	 */
	
	public static ListNode rotateList(ListNode head, int k){
		if(head == null || head.next == null)return head;
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode slow = dummyHead;
		ListNode fast = dummyHead;
		
		int len =0;
		while(fast.next!=null){
			len++;
			fast = fast.next;
		}
		len = len -k%len;
		while(len>0){
			slow = slow.next;
			len--;
		}
		
		fast.next = dummyHead.next;
		dummyHead.next = slow.next;
		slow.next = null;
		
		return dummyHead.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        ListNode res = rotateList(head,3);
        while(res!=null){
        	System.out.print(res.val + "->");
        	res = res.next;
        }
        System.out.print("null");
	}

}
