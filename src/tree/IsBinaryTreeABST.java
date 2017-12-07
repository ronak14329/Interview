/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 *
 */
public class IsBinaryTreeABST {

	/**
	 * @param args
	 */
	
	public static boolean isBST(TreeNode<Integer> root){
		if(root == null)return true;
		return isBSTHelper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private static boolean isBSTHelper(TreeNode<Integer> root, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		if(root == null)return true;
		if(root.val > maxValue || root.val < minValue)return false;
		return isBSTHelper(root.left, minValue,root.val) && isBSTHelper(root.right,root.val,maxValue);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
       // root.right.left.left = new TreeNode(8);
       // root.right.right.right = new TreeNode(10);
        
        System.out.println(isBST(root));
	}

}
