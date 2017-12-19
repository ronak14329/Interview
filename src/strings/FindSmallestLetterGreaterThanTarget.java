/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class FindSmallestLetterGreaterThanTarget {

	/**
	 * @param args
	 */
	
	public static char findSmallest(char [] letters, char target){
		int i =0;
		int j = letters.length;
		while(i<j){
			int mid = (i+j)/2;
			if(letters[mid] > target)i =mid+1;
			else j = mid;
		}return letters[i%letters.length];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] input ={'a','b','c'};
System.out.println(findSmallest(input, 'z'));
	}

}
