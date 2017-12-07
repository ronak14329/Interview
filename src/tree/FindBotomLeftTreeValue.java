/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 * Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:
Input:

    2
   / \
  1   3

Output:
1
Example 2: 
Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7
 */
public class FindBotomLeftTreeValue {

	/**
	 * @param args
	 * In this solution we need to keep the track of the depth.
	 * 
	 */
	
	public static int findBottomLeftTreeValue(TreeNode root){
		return findBottomLeftTreeValueHelper(root,1,new int[]{0,0});
	}
	private static int findBottomLeftTreeValueHelper(TreeNode root, int depth, int[] res) {
		// TODO Auto-generated method stub
		if(res[1] < depth){
			res[0]= (int) root.val;
			res[1]= depth;
		}
		if(root.left !=null)findBottomLeftTreeValueHelper(root.left,depth+1, res);

		if(root.right !=null)findBottomLeftTreeValueHelper(root.right,depth+1, res);
		return res[0];
	}
	
	public static int findBottomRightTreeValue(TreeNode root){
		return findBottomRightTreeValueHelper(root,1,new int[]{0,0});
	}
	private static int findBottomRightTreeValueHelper(TreeNode root, int depth, int[] res) {
		// TODO Auto-generated method stub
		if(res[1] < depth){
			res[0]= (int) root.val;
			res[1]= depth;
		}
		if(root.right !=null)findBottomRightTreeValueHelper(root.right,depth+1, res);
		
		if(root.left !=null)findBottomRightTreeValueHelper(root.left,depth+1, res);

		return res[0];
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
        root.right.left.left = new TreeNode(8);
        root.right.right.right = new TreeNode(10);
        
        System.out.println(findBottomLeftTreeValue(root));
        System.out.println(findBottomRightTreeValue(root));
	}

}
