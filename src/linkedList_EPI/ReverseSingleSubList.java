/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 * EPI reverse singly sublist
 */
public class ReverseSingleSubList {

	/**
	 * @param args
	 */
	
	public static ListNode reverseSubList(ListNode head, int start, int finish){
		ListNode dummyHead = new ListNode(0);
		ListNode sublistHead = dummyHead;
		
		int k = 1;
		
		// find the sublist with head starting from start
		while(k++ < start){
			sublistHead = sublistHead.next;
		}
		// reverse sublist
		ListNode prev = sublistHead.next;
		while(start++ < finish){
			ListNode temp = prev.next;
			prev.next = temp.next;
			temp.next = sublistHead.next;
			sublistHead.next = temp;
		}
		return dummyHead.next;
	}
	 public static ListNode reverseSublis(ListNode L, int start,
             int finish) {
ListNode dummyHead = new ListNode(0);
ListNode sublistHead = dummyHead;
int k = 1;
while (k++ < start) {
sublistHead = sublistHead.next;
}

// Reverse sublist.
ListNode sublistIter = sublistHead.next;
while (start++ < finish) {
ListNode temp = sublistIter.next;
sublistIter.next = temp.next;
temp.next = sublistHead.next;
sublistHead.next = temp;
}
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
        ListNode res = reverseSublis(head,2,3);
        while(res!= null){
        	System.out.print(res.val + "->");
        	res = res.next;
        }
        System.out.print("null");
	}

}
