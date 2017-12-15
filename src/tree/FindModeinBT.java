/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ronak Goyal
 *
 */
public class FindModeinBT {

	/**
	 * @param args
	 */
	
	public static Map<Integer, Integer> map;
	public static  int max = Integer.MIN_VALUE;
	 public static int[] findModeInBT(TreeNode root){
		 map = new HashMap<>();
		// int max =0;
		 if(root == null ) return new int[]{};
		 inorder(root);
		 List<Integer> list = new ArrayList<>();
		 for(int key : map.keySet()){
			 if(map.get(key) == max)list.add(key);
		 }
		 int[] res = new int[list.size()];
		 for(int i =0;i<list.size();i++){
			 res[i] = list.get(i);
		 }
		 System.out.println("max ="+max);
		 return res;
		 
	 }
	 
	 public static void inorder(TreeNode root){
		 if(root == null)return;
		 if(root.left != null)inorder(root.left);
		 if(map.containsKey((Integer)root.val)){
			 map.put((Integer) root.val, map.get(root.val)+1);
			 max = Math.max(max, map.get(root.val));
		 }else{
			 map.put((Integer) root.val, 1);
		 }
		 
		 if(root.right != null)inorder(root.right);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);
       int [] res = findModeInBT(root);
       for(int i : res){
    	   System.out.println(i);
       }
	}

}
