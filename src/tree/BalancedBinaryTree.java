/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 *
 */
public class BalancedBinaryTree {

	/**
	 * @param args
	 */
	
	// brute force 
	
	public static boolean isBalanced(TreeNode root){
		if(root == null)return true;
	 		return Math.abs(maxDepth(root.left)- maxDepth(root.right)) <= 1 && isBalanced(root.left)&& isBalanced(root.right);
		
		
	}
	private static int maxDepth(TreeNode node) {
		// TODO Auto-generated method stub
		if( node == null)return 0;
		int left = maxDepth(node.left);
		int right = maxDepth(node.right);
		return 1+ Math.max(left, right);
	}
	 
	// optimized solution
	public static boolean isBalancedBetter(TreeNode root){
		return max(root)!=-1;
	}
	
	
	private static int max(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)return 0;
		int left = max(root.left);
		if(left==-1)return -1;
		int right = max(root.right);
		if(right == -1)return -1;
		return (Math.abs(left - right ) <=1)? Math.max(left, right)+1 : -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        System.out.println(isBalancedBetter(root));
	}

}
