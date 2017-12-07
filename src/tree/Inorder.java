/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ronak Goyal
 *  * Time complexity is O(n)
 * Space complexity is O(n)
 */
public class Inorder {

	public static List<TreeNode> res = new ArrayList<>();
	public static List<TreeNode> inorder(TreeNode root){
		if(root == null)return null;
		
		inorder(root.left);
		res.add(root);
		inorder(root.right);
		return res;
	}
	// inorder Tre Traversal Iterative
	
		public static List<TreeNode> inorderIterative(TreeNode root){
			List<TreeNode> result = new ArrayList<>();
			if(root == null) return result;
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode p = root;
			//stack.add(p);
			while(!stack.isEmpty()|| p!=null){

	            // if it is not null, push to stack
	            //and go down the tree to left
	            if(p != null){
	                stack.push(p);
	                p = p.left;
	 
	            // if no left child
	            // pop stack, process the node
	            // then let p point to the right
				}else{
					TreeNode t = stack.pop();
					result.add(t);
					p = t.right;
				}
			}return result;
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
       // public List<TreeNode> res = new ArrayList<>();
        List<TreeNode> r =  inorderIterative(root);
        for(TreeNode t : r){
        	System.out.print(t.val+",");
        }
	}

}