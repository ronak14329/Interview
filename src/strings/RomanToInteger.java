/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class RomanToInteger {

	/**
	 * @param args
	 */
	
	public static int romanToInteger(String s){
		// create a array to save the values
		
		int [] nums = new int[s.length()];
		for(int i =0 ; i<s.length();i++){
			switch(s.charAt(i)){
			case 'M' : nums[i] =1000;
		              break;
			case 'D' : nums[i] =500;
			break;
			case 'C' : nums[i] =100;
			break;
			case 'L' : nums[i]=50;
			break;
			case 'X' : nums[i]=10;
			break;
			case 'V' : nums[i] =5;
			break;
			case 'I' : nums[i] =1;
			break;
			}
		}
		// for saving the result 
		int result =0;
		for(int i = 0;i<nums.length-1;i++){
			if(nums[i]<nums[i+1]){
				result -=nums[i];
			}else{
				result += nums[i];
			}
		}
		return result+nums[nums.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(romanToInteger("IX"));
	}

}
