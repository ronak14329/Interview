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
public class Preorder {

	public static List<TreeNode> res = new ArrayList<>();
	public static List<TreeNode> preorder(TreeNode root){
		if(root == null)return null;
		res.add(root);
		preorder(root.left);
		preorder(root.right);
		return res;
	}
	  
	
	// Preorder Iterative Tree Traversal
	 public static List<TreeNode> preorderIterative(TreeNode root){
		 List<TreeNode> result = new ArrayList<>();
		 if(root == null)return result;
		 Stack<TreeNode> stack = new Stack<TreeNode>();
		 stack.push(root);
		 while(!stack.isEmpty()){
			 TreeNode t = stack.pop();
			 result.add(t);
			 // first add right to stack so that we can pop it later
			 if(t.right!= null){
				 stack.push(t.right);
			 }
			 // add left in the stack
			 if(t.left!= null){
				 stack.push(t.left);
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
        List<TreeNode> r =  preorderIterative(root);
        for(TreeNode t : r){
        	System.out.print(t.val+",");
        }
	}

}