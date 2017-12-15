package miscellaneous;

public class BubbleSort {
// Best case =O(n) and average and worst is O(n^2)
	
	public static void Bubble(int arr[]){
		int n = arr.length;
		System.out.println(" The length od the array  is  : " +n);
		int k;
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				k=j+1;
				if(arr[j]>arr[k]){
					swapNum(j,k,arr);
				}
				//System.out.println(arr);
				for(int a:arr){
					System.out.print(a +",");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	public static void Bub(int arr[]){
		int n= arr.length;
		for(int i =0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					swapNum(j,j+1,arr);
				}
			}
			
		}
	}
	public static int[] selection(int[] input) {
		  int min ,min_index,temp=0;
		  for(int i=0;i<input.length;i++){
			  min=input[i];
			  min_index=i;
			  for(int j=i;j<input.length;j++){
				  if(input[j]<min){
					  min=input[j];
					  min_index=j;
				  }
			  }
			  if(min<input[i]){
				  temp=input[i];
				  input[i]=input[min_index];
				  input[min_index]=temp;
			  }
			  
		  }
	 return input;   
	  }
	public static void swapNum(int j1,int k1, int arr1[]){
		int temp;
		temp = arr1[j1];
		arr1[j1]=arr1[k1];
		arr1[k1]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int at[]={9,4,7,2,8};
for(int i:at){
	System.out.print(i);
}
System.out.println();
//Bub(at);
selection(at);
for(int i:at){
	System.out.print(i);
}
	}

}
