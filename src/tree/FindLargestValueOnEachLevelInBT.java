/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronak Goyal
 *
Example:
Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

Output: [1, 3, 9]
 */
public class FindLargestValueOnEachLevelInBT {

	/**
	 * @param args
	 */
	
	public static List<Integer> findLargest(TreeNode root){
		List<Integer> res = new ArrayList<>();
		helper(root,res,0);// root, result array and depth
		return res;
	}
	public static void helper(TreeNode root, List<Integer> res, int depth){
		if(root == null)return;
		if(depth == res.size())res.add((Integer) root.val);
		else{
			res.set(depth, Math.max(res.get(depth), (int) root.val));
		}
		helper(root.left,res,depth+1);
		helper(root.right,res,depth+1);
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
        
        List<Integer> res = findLargest(root);
        for(int r : res){
        	System.out.print(r+",");
        }
	}

}
