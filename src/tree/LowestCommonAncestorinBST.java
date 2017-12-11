/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 *
 */
public class LowestCommonAncestorinBST {

	/**
	 * @param args
	 */
	
	public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        if(root.val > p.val && root.val > q.val){
        	// if the root.val is greater than the give node values search iun the root.left
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
        	// if values greater than the root search the value in the root.right
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
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
        
        TreeNode res = lowestCommonAncestor(root,root.right.right,root.left.left);
        System.out.println(res.val);
	}

}
