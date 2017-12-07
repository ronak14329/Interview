/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 *
 */
public class MaxDepthOfBinaryTree {

	/**
	 * @param args
	 * time complexity is O(n) since we are traversing each node only once
	 * Space complexity is O(n) since we are using recursion so we are taking O(n) stack space
	 */
	
	public static int maxDepth(TreeNode root){
		if( root == null )return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return Math.max(left, right)+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
      root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      root.left.left = new TreeNode(4);
      root.right.left = new TreeNode(2);
      root.right.left.left = new TreeNode(4);
      root.right.right = new TreeNode(4);
      System.out.println(maxDepth(root));
	}

}
