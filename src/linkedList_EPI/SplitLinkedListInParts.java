/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *
 */
public class SplitLinkedListInParts {

	/**
	 * @param args
	 * to be explained
	 */
	
	 public static ListNode[] splitListToParts(ListNode root, int k) {
	        ListNode cur = root;
	        int N = 0;
	        while (cur != null) {
	            cur = cur.next;
	            N++;
	        }

	        int width = N / k, rem = N % k;

	        ListNode[] ans = new ListNode[k];
	        cur = root;
	        for (int i = 0; i < k; ++i) {
	            ListNode head = cur;
	            for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; ++j) {
	                if (cur != null) cur = cur.next;
	            }
	            if (cur != null) {
	                ListNode prev = cur;
	                cur = cur.next;
	                prev.next = null;
	            }
	            ans[i] = head;
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6 );
        
        ListNode[] ls = splitListToParts(head,3);

	}

}
