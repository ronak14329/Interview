/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Ronak Goyal
 *
 */
public class LevelOrderTreeTraversal {

	/**
	 * @param args
	 */
	
	public static List<TreeNode> levelOrder(TreeNode root){
		List<TreeNode> res = new ArrayList<>();
		if(root == null) return res;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode p = q.poll();
			res.add(p);
			if(p.left!=null){
				q.add(p.left);
			}
			if(p.right != null){
				q.add(p.right);
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
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
       // public List<TreeNode> res = new ArrayList<>();
        List<TreeNode> r =  levelOrder(root);
        for(TreeNode t : r){
        	System.out.print(t.val+",");
        }
	}

}
