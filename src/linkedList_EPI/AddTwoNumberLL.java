/**
 * 
 */
package linkedList_EPI;

import java.util.HashMap;

/**
 * @author Ronak Goyal
 *
 */
public class AddTwoNumberLL {

	/**
	 * @param args
	 */
	
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 HashMap<Integer,Integer> map1= new HashMap<>();
		 HashMap<Integer,Integer> map2= new HashMap<>();
		     int i=1;
		     int j=1;
		     while(l1!=null){
		         map1.put(i,l1.val);
		         l1=l1.next;
		         i++;
		     }
		     while(l2!=null){
		         map2.put(j,l2.val);
		         l2=l2.next;
		         j++;
		     }
		     int carry=0;
		     i--;//because in the last we made i++
		     j--;// in the last we did j++;
		     ListNode head= null;
		     // Since we know that the cuurent value of the i and j is the length of the l1 and l2 resp.
		     while(i>0||j>0||carry>0){
		         int a = i>0?map1.get(i):0;
		         int b = j>0? map2.get(j):0;
		         int result = (a+b+carry)%10;
		         ListNode newNode = new ListNode(result);
		         newNode.next=head;
		         head=newNode;
		         carry=(a+b+carry)/10;
		         i--;
		         j--;
		     }
		     return head;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(4);
        
        ListNode res =addTwoNumbers(head,head1);
        while(res!=null){
        	System.out.print(res.val +"->");
        	res= res.next;
        }
        

	}

}
