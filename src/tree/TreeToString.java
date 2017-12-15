/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 *  You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.

Example 1:
Input: Binary tree: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

Output: "1(2(4))(3)"

Explanation: Originallay it needs to be "1(2(4)())(3()())", 
but you need to omit all the unnecessary empty parenthesis pairs. 
And it will be "1(2(4))(3)".
Example 2:
Input: Binary tree: [1,2,3,null,4]
       1
     /   \
    2     3
     \  
      4 

Output: "1(2()(4))(3)"

Explanation: Almost the same as the first example, 
except we can't omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the out
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
