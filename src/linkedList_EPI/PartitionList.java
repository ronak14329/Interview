/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */
public class PartitionList {

	/**
	 * @param args
	 */
	
	public static ListNode partition(ListNode head, int x){
		ListNode dummy1 = new ListNode(0);
		ListNode dummy2 =new ListNode(0);
		
		ListNode curr1 = dummy1;
		ListNode curr2 = dummy2;
		while(head!=null){
			if(head.val < x){
				curr1.next = head;
				curr1 = head;
			}else{
				curr2.next = head;
				curr2 = head;
			}head = head.next;
		}
		curr2.next= null;
		curr1.next = dummy2.next;
		return dummy1.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
        head.next = new ListNode(7);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(10);
        
        ListNode res = partition(head, 5);
        while(res!= null){
        	System.out.print(res.val +"->");
        	res=  res.next;
        }
	}

}
