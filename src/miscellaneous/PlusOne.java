package miscellaneous;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
	 public static int[] plusOne(int[] digits) {
		    for (int i = digits.length - 1; i >=0; i--) {
		        if (digits[i] != 9) {
		            digits[i]++;
		            break;
		        } else {
		            digits[i] = 0;
		        }
		    }
		    if (digits[0] == 0) {
		        int[] res = new int[digits.length+1];
		        res[0] = 1;
		        return res;
		    }
		    return digits;
		}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	      List<Integer> ret = new ArrayList<Integer>();
	      //The basic idea is that we iterate through the input array and mark elements as negative using nums[nums[i] -1] = -nums[nums[i]-1]. In this way all the numbers that we have seen will be marked as negative. In the second iteration, if a value is not marked as negative, it implies we have never seen that index before, so just add it to the return list.  
	        for(int i = 0; i < nums.length; i++) {
	            int val = Math.abs(nums[i]) - 1;
	            System.out.println("At i = "+i+ " val = "+val);
	            if(nums[val] > 0) {
	            	 System.out.println("before num[val] = "+nums[val]);
	                nums[val] = -nums[val];
	                System.out.println("num[val] "+nums[val]);
	            }
	        }
	        
	        for(int i = 0; i < nums.length; i++) {
	        	System.out.println("the value of nums[i] "+i+" = "+nums[i]);
	            if(nums[i] > 0) {
	            	System.out.println("the value of nums[i] to add "+(i+1)+" = "+nums[i]);
	                ret.add(i+1);
	            }
	        }
	        return ret;   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x={990};
		int []y=plusOne(x);
for(int a:y){
	System.out.println(a);
}
int b[] ={4,3,2,7,8,2,3,1};
List<Integer>res = new ArrayList<>();
res = findDisappearedNumbers(b);
for(int c:res){
	System.out.println(c);
}
	}

}
