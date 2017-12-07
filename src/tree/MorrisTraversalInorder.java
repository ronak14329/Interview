/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronak Goyal
 *  Morris Traversal will traverse the tree in O(1) space complexity.
 */
public class MorrisTraversalInorder {

	/**
	 * @param args
	 */
	 public static List<TreeNode> morrisTraversalInorder(TreeNode root){
		 TreeNode current = root;
		 List<TreeNode> res = new ArrayList<>();
		 while(current!=null){
			 if(current.left == null){
				 res.add(current); 
				 current = current.right;				 
			 }else{
				 TreeNode predecessor = current.left;
				 while(predecessor.right != current && predecessor.right!= null){
					 predecessor = predecessor.right;
				 }
			  if(predecessor.right == null){
				  predecessor.right = current;
				  current = current.left;
			  }else{
				  predecessor.right = null;
				  res.add(current);
				  current = current.right;
			  }
			  
			 }
		 }return res;
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
        List<TreeNode> res = morrisTraversalInorder(root);
        for(TreeNode t : res){
        	System.out.print(t.val+",");
        }
	}

}
