/**
 * 
 */
package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Ronak Goyal
 *
 */
public class FindAllDuplicateSubTree {

	/**
	 * @param args
	 */
	
	public static List<TreeNode> findAllDuplicatesSubTree(TreeNode root){
		List<TreeNode> result = new LinkedList<>();
		inorder(root, new HashMap<>(), result);
		return result;
	}
	
private static String inorder(TreeNode root, Map<String, Integer> map, List<TreeNode> result) {
		// TODO Auto-generated method stub
		if(root == null)return "#";
		String serial = root.val +"," + inorder(root.left, map,result)+"," + inorder(root.right,map, result);
		if(map.getOrDefault(serial,0)==1)result.add(root);
		map.put(serial, map.getOrDefault(serial,0)+1);
		return serial;
		
	}

	//	public static void inorder(TreeNode root){
//		if(root== null)return ;
//		inorder(root.left);
//		System.out.print(root.val+",");
//		inorder(root.right);
//	}
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
        List<TreeNode> res = findAllDuplicatesSubTree(root);
        for(TreeNode t : res){
        	System.out.print(t.val+",");
        }
	}

}
