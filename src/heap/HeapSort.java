/**
 * 
 */
package heap;

import java.util.Scanner;

/**
 * @author Ronak Goyal
 *
 */
public class HeapSort {

	/**
	 * @param args
	 */
	private static int N;
	public static void sort(int arr[]){
		heapify(arr);
		for(int i =N;i>0;i--){
			swap(arr,0,i);
			N= N-1;
			minheap(arr,0);
		}
	}
	
	public static void heapify(int []arr){
		N= arr.length-1;
		for(int i =N/2;i>=0;i--){
			minheap(arr,i);
		}
	}
	
	public static void swap(int []arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void maxheap(int []arr, int i){
		int left =  2*i+1;
		int right = 2*i+2;
		int max = i;
		if(left <= N && arr[left] >arr[max]){
			max = left;
		}
		if(right <= N && arr[right] > arr[max]){
			max = right;
		}
		if(max!= i){
			swap(arr,i,max);
			maxheap(arr,max);
		}
	}
	public static void minheap(int []arr, int i ){
		int left = 2*i+1;
		int right = 2*i +2;
		int min = i;
		if(left <= N && arr[left]<arr[min]){
			min = left;
		}
		if(right <= N && arr[right] < arr[min]){
			min = right;
		}
		if( min != i){
			swap(arr,i, min);
			minheap(arr,min);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner( System.in );        
	        System.out.println("Heap Sort Test\n");
	        int n, i;    
	        /* Accept number of elements */
	        System.out.println("Enter number of integer elements");
	        n = scan.nextInt();    
	        /* Make array of n elements */
	        int arr[] = new int[ n ];
	        /* Accept elements */
	        System.out.println("\nEnter "+ n +" integer elements");
	        for (i = 0; i < n; i++)
	            arr[i] = scan.nextInt();
	        /* Call method sort */
	        sort(arr);
	        /* Print sorted Array */
	        System.out.println("\nElements after sorting ");        
	        for (i = 0; i < n; i++)
	            System.out.print(arr[i]+" ");            
	        System.out.println();  
	}

}
