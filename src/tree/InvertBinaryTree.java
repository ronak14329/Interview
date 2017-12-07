/**
 * 
 */
package tree;

import java.util.List;

/**
 * @author Ronak Goyal
 *
 */
public class InvertBinaryTree {

	/**
	 * @param args
	 */
	
	public static TreeNode invertTree(TreeNode root){
		if(root == null)return root;
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		root.left = right;
		root.right = left;
		return root;
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
        List<TreeNode> n = LevelOrderTreeTraversal.levelOrder(root);
        for(TreeNode s :n){
        	System.out.print(s.val+",");
        }
        System.out.println();
        TreeNode res = invertTree(root);
        List<TreeNode> r = LevelOrderTreeTraversal.levelOrder(res);
        for(TreeNode s :r){
        	System.out.print(s.val+",");
        }
	}

}
