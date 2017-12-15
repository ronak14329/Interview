/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 
Example 1:
Input: Binary tree: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

Output: "1(2(4))(3)"

*/
public class TreeToString {

	/**
	 * @param args
	 */ 
	
	public static String treeToString(TreeNode root){
	   StringBuilder sb = new StringBuilder();
	   if(root == null)return "";
	   helper(sb, root);
	   return sb.toString();
	}
	
	public static void helper(StringBuilder sb, TreeNode root){
		if(root!=null){
			sb.append(root.val);
			if(root.left!=null && root.right!= null){
				sb.append("(");
				helper(sb,root.left);
				sb.append(")");
				if(root.right!=null){
					sb.append("(");
					helper(sb,root.right);
					sb.append(")");	
				}
				
			}
		}
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
        System.out.println(treeToString(root));
	}

}
