package miscellaneous;

public class FindDuplicate {
	public static int findDuplicate(int[] nums) {
	    int n = nums.length;
	    int slow = n;
	    int fast = n;
	    do{
	        slow = nums[slow-1];
	        System.out.println("slow "+slow);
	        fast = nums[nums[fast-1]-1];
	        System.out.println("fast "+fast);
	    }while(slow != fast);
	    slow = n;
	    System.out.println("After the do slow" );
	    while(slow != fast){
	    	
	        slow = nums[slow-1];
	        System.out.println("slow "+slow); 
	        fast = nums[fast-1];
	        System.out.println("fast "+fast);
	    }
	    return slow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]nums={1,2,3,4,5,6,7,7,8,9,10};
int n =findDuplicate(nums);
System.out.println("The solution is "+n);
	}

}
