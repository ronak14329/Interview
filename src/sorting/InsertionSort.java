package sorting;

public class InsertionSort {
	
	public int[] insertionSort(int [] nums){
		if(nums==null || nums.length==0 || nums.length==1)return nums;
		
		for(int i=1;i<nums.length;i++){
			int key = nums[i];
			int j=i;
			while(j > 0  && nums[j-1]>key){
				nums[j]= nums[j-1];
				j--;
			}
			nums[j]=key;
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort insert = new InsertionSort();
     int [] nums = {6,4,3,2,9};
     int [] num = insert.insertionSort(nums);
     for(int i : num)System.out.println(i);
	}

}// t.c = O(n^2)
