package miscellaneous;

public class RemoveDuplicateFromSortedArray {
 public static int removeDuplicate(int[] arr){
	 int x=0;
	 int temp=Integer.MIN_VALUE;
	 for(int i =0;i<arr.length;i++){
		 if(arr[i]!=temp){
			 arr[x]=arr[i];
			 x++;
			 temp=arr[i];
		 }
	 }
	 for(int i:arr){
		 System.out.println(i);
	 }
	 return x!=0?x:0;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a = {1,1,2,3,4,5,5,5,6,7,8,9};
System.out.println(removeDuplicate(a));
	}

}
