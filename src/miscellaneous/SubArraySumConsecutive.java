package miscellaneous;

public class SubArraySumConsecutive {
 public static boolean subArraySum(int []arr, int target){
	 int curr_sum=0;
	 for(int i =0; i<arr.length;i++){
		 curr_sum=arr[i];
		 for(int j=i+1;j<arr.length;j++){
			 if(curr_sum==target)return true;
			 if(curr_sum>target || j==arr.length)break;
			 curr_sum=curr_sum+arr[j];
		 }
	 }
	 
	 return false;
 }
 static public int compute(int n) {
     return compute(n,n);
 }

 static public int compute(int x, int y) {
     if (x == 0 || y == 0) {
         return 1;
     }
     //Since we can come from the top or left to right
     return compute(x - 1, y) + compute(x, y - 1);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a={6,12,1,7,5,2,3};
System.out.println(subArraySum(a,14));

System.out.println("Hi "+compute(2));
	}
	
	

}
