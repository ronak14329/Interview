package miscellaneous;

public class TeemoAttacking {
  
	public static int tA(int[] arr, int d){
		if(arr.length==0)return 0;
		int begin=arr[0];
		int total=0;
		for(int i=0;i<arr.length;i++){
			int t=arr[i];
			total+= t<begin+d?t-begin:d;
			begin =t;
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,3,7};
System.out.println(tA(arr,2));
	}
  
}
