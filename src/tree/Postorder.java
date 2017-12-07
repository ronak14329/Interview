/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ronak Goyal
 * Postorder Tree Traversal
 * Time complexity is O(n)
 * Space complexity is O(n)
 */
public class Postorder {

	/**
	 * @param args
	 */
	public static List<TreeNode> res = new ArrayList<>();
	public static List<TreeNode> postorder(TreeNode root){
		if(root == null)return null;
		postorder(root.left);
		postorder(root.right);
		res.add(root);
		return res;
	}
	
	  public static List<TreeNode> postorderIterative(TreeNode root){
		  List<TreeNode> result = new ArrayList<>();
		  if(root == null)return result;
		  Stack<TreeNode> stack = new Stack<TreeNode>();
		  stack.push(root);
		  while(!stack.isEmpty()){
			  TreeNode temp = stack.peek();
			  if(temp.left == null && temp.right== null){
				  TreeNode pop = stack.pop();
				  result.add(temp);
			  }else{
				  if(temp.right!=null){
					  stack.push(temp.right);
					  temp.right = null;
				  }
				  if( temp.left != null){
					  stack.push(temp.left);
					  temp.left = null;
				  }
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
        List<TreeNode> r =  postorderIterative(root);
        for(TreeNode t : r){
        	System.out.print(t.val+",");
        }
	}

}
