package sorting;
//Java program for implementation of QuickSort
class QuickSort
{
 /* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
 int partition(int arr[], int low, int high)
 {
     int pivot = arr[high]; 
     int i = (low-1); // index of smaller element
     for (int j=low; j<high; j++)
     {
         // If current element is smaller than or
         // equal to pivot
         if (arr[j] <= pivot)
         {
             i++;

             // swap arr[i] and arr[j]
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     // swap arr[i+1] and arr[high] (or pivot)
     int temp = arr[i+1];
     arr[i+1] = arr[high];
     arr[high] = temp;

     return i+1;
 }


 /* The main function that implements QuickSort()
   arr[] --> Array to be sorted,
   low  --> Starting index,
   high  --> Ending index */
 void sort(int arr[], int low, int high)
 {
     if (low < high)
     {
         /* pi is partitioning index, arr[pi] is 
           now at right place */
         int pi = partition(arr, low, high);

         // Recursively sort elements before
         // partition and after partition
         sort(arr, low, pi-1);
         sort(arr, pi+1, high);
     }
 }

 /* A utility function to print array of size n */
 static void printArray(int arr[])
 {
     int n = arr.length;
     for (int i=0; i<n; ++i)
         System.out.print(arr[i]+" ");
     System.out.println();
 }

 // Driver program
 public static void main(String args[])
 {
     int arr[] = {10, 7, 8, 9, 1, 5};
     int n = arr.length;

     QuickSort ob = new QuickSort();
     ob.sort(arr, 0, n-1);

     System.out.println("sorted array");
     printArray(arr);
 }
}
//public class QuickSort {
//
//	public int[] quick(int[] arr) {
//		quickSort(arr, 0, arr.length - 1);
//		return arr;
//	}
//
//	public void quickSort(int[] arr, int low, int high) {
//		if (low < high) {
//			int pivotLocation = partition(arr, low, high);
//			quickSort(arr, low, pivotLocation-1);
//			quickSort(arr, pivotLocation + 1, high);
//		}
//	}
//
//	public int partition(int[] arr, int low, int high) {
//		int pivot = arr[low];
//		int lefthand = low;
//		for (int i = low; i < high; i++) {
//			if (arr[i] < pivot) {
//				swap(arr, i, lefthand);
//				lefthand++;
//			}
//		}
//		swap(arr, low, lefthand);
//		return lefthand;
//	}
//	
//	private void quickS(int lowInd, int highInd){
//		int i = lowInd;
//		int j = highInd;
//		int pivot = array[(i+j)/2];
//		while(i<j){
//			while(array[i]<pivot)i++;
//			while(array[j]>pivot)j--;
//			if(i<=j){
//				swap(array,i,j);
//				i++;
//				j--;
//			}
//		}
//	}
//
//	public void swap(int[] arr, int i, int j) {
//		int temp = arr[i];
//		arr[i] = arr[j];
//		arr[j] = temp;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		QuickSort insert = new QuickSort();
//		int[] nums = { 6, 4, 3, 2, 9 };
//		int[] num = insert.quick(nums);
//		for (int i : num)
//			System.out.println(i);
//	}
//
//}
