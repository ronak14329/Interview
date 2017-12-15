/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal

 */
public class LowestCommonAncestorBinaryTree {

	/**
	 * @param args
	 */
	
	public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
		if(root == null || root == p || root== q)return root;
		TreeNode left = lca(root.left,p,q);
		TreeNode right = lca(root.right,p,q);
		if(left!=null && right!=null)return root;
		return left!=null? left:right;
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
        
        TreeNode res = lca(root,root.right.right,root.left.left);
        System.out.println(res.val);
	}

}
