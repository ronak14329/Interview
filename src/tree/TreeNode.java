/**
 * 
 */
package tree;

/**
 * @author Ronak Goyal
 *
 */
public class TreeNode<T> {
  T val;
  TreeNode left;
  TreeNode right;
  
  public TreeNode(T val){
	  this.val =val ;
	  this.left= null;
	  this.right =null;
  }
}
