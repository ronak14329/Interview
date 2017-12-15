package sorting;

public class SelectionSort {
	public int[] selectionSort(int []nums){
		if(nums==null || nums.length==0 || nums.length==1)return nums;
		
		for(int i = 0;i<nums.length;i++){
			int min =i;
			for(int j = i+1;j<nums.length;j++){
				if(nums[j]< nums[min])min=j;
			}
			swap(nums,i,min);
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
		SelectionSort insert = new SelectionSort();
	     int [] nums = {6,4,3,2,9};
	     int [] num = insert.selectionSort(nums);
	     for(int i : num)System.out.println(i);
	}

}// find the index of minimum in the array and swap with i