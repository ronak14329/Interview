package sorting;

public class BubbleSort {
	
	
	public int[] bubble(int []nums){
		for(int i=0;i<nums.length;i++){
			for(int j = 0;j<nums.length-1;j++){
				if(nums[j]>nums[j+1])swap(nums,j,j+1);
			}
		}
		return nums;
	}
	public void swap(int []nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort insert = new BubbleSort();
	     int [] nums = {6,4,3,2,9};
	     int [] num = insert.bubble(nums);
	     for(int i : num)System.out.println(i);
	}

}
