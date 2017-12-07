/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 *
 */
public class MinimumDepthBinaryTree {

	/**
	 * @param args
	 */
	
	public static int minDepth(TreeNode root){
		if(root == null) return 0;
		if(root.left == null) return minDepth(root.right)+1;
		if(root.right == null) return minDepth(root.left)+1;
		return Math.min(minDepth(root.left), minDepth(root.right))+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeNode root = null;
//        root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.right.left = new TreeNode(2);
//        root.right.left.left = new TreeNode(4);
//        root.right.right = new TreeNode(4);
		TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
		
        System.out.println(minDepth(root));
	}

}
