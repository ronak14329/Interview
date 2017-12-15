/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal


    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
 */
public class IsSymmetricBinaryTree {

	/**
	 * @param args
	 */
	
	public static boolean isSymmetric(TreeNode root){
		if(root == null)return true;
		return isSymmetricHelper(root.left, root.right);
	}
	private static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if(left == null && right == null)return true;
		if( left ==null || right == null)return false;
		if(left.val != right.val)return false;
		return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        
        System.out.println(isSymmetric(root));
	}

}
