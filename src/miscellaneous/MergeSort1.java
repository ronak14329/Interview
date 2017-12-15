package miscellaneous;

public class MergeSort1 {
	private static  int[] array;
    private static int[] tempMergArr;
    private static  int length;

	public static int[] compute(int[] inputArr) {
		 array = inputArr;
	      length = inputArr.length;
	      tempMergArr = new int[length];
	      doMergeSort(0, length - 1);
return array;
	  }
	  private static  void doMergeSort(int lowerIndex,int higherIndex){
		  if(lowerIndex<higherIndex){
			  int middle=(lowerIndex+higherIndex)/2;
			  doMergeSort(lowerIndex,middle);
			  doMergeSort(middle+1,higherIndex);
			  merge(lowerIndex,middle,higherIndex);
		  }
	  }

	  //private static int[] merge(int[] array1, int[] array2){

	  //}
	  private static void merge(int lowerIndex, int middle, int higherIndex) {
		  
	      for (int i = lowerIndex; i <= higherIndex; i++) {
	          tempMergArr[i] = array[i];
	      }
	      int i = lowerIndex;
	      int j = middle + 1;
	      int k = lowerIndex;
	      while (i <= middle && j <= higherIndex) {
	          if (tempMergArr[i] <= tempMergArr[j]) {
	              array[k] = tempMergArr[i];
	              i++;
	          } else {
	              array[k] = tempMergArr[j];
	              j++;
	          }
	          k++;
	      }
	      while (i <= middle) {
	          array[k] = tempMergArr[i];
	          k++;
	          i++;
	      }

	  }
	  public static int compute1(int n) {
		  int [][] matrix= new int[n+1][n+1];
		//  for(int i =0;i<matrix.length;i++){
		  //	matrix[0][i]=1;
		 // }
		 // for(int j=0;j<matrix[0].length;j++){
		 // 	matrix[j][0]=1;
		 // }
		  for(int i =0;i<matrix.length;i++){
		  	for(int j=0;j<matrix[0].length;j++){
		  		if(i==0||j==0){
		  			matrix[i][j]=1;
		  		}else{
		  		matrix[i][j]=matrix[i][j-1]+matrix[i-1][j];
		  	}}
		  }
		  return matrix[n][n];
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compute1(2));
		System.out.println("The output is");
int[] input = { 3, 9, 1, 4, 7 };

printList(MergeSort1.compute(input));
//printList(Quicksort.compute(input));
}

private static void printList(int[] result){
System.out.print("[ ");
for(int i : result){
  System.out.print(i + " ");
}
System.out.print("]");
}}


