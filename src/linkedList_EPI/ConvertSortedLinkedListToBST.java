/**
 * 
 */
package linkedList_EPI;

/**
 * @author Ronak Goyal
 *Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


Example:

Given the sorted linked list: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5

 */
public class ConvertSortedLinkedListToBST {

	/**
	 * @param args
	 */
	public  static class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public static TreeNode sortedListToBST(ListNode head) {
		    if(head==null) return null;
		    return toBST(head,null);
		}
		public static TreeNode toBST(ListNode head, ListNode tail){
		    ListNode slow = head;
		    ListNode fast = head;
		    if(head==tail) return null;
		    // we are finding the middle value from this
		    while(fast!=tail&&fast.next!=tail){
		        fast = fast.next.next;
		        slow = slow.next;
		    }
		    //creating the TreeNode
		    TreeNode thead = new TreeNode(slow.val);
		    thead.left = toBST(head,slow);
		    thead.right = toBST(slow.next,tail);
		    return thead;
		}
	
	
//	public static TreeNode convertToBST(ListNode head){
//		if(head == null)return null;
//		TreeNode res = toBST(head,null);
//		return res;
//	}
//	
//	public static TreeNode toBST(ListNode head, ListNode tail){
//		ListNode slow = head;
//		ListNode fast = head;
//		if(head == null)return null;
//		while(fast!=null && fast.next!=null){
//			slow= slow.next;
//			fast = fast.next.next;
//		}
//		int val = slow.val;
//		TreeNode root = new TreeNode(val);
//		root.left = toBST(head,slow);
//		root.right = toBST(slow.next,tail);
//		return root;
//	}
		
		public static void inorder(TreeNode root){
			if(root==null)return;
			inorder(root.left);
			System.out.println(root.val);
			inorder(root.right);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        TreeNode res = sortedListToBST(head);
        inorder(res);
	}

}
