/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
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
