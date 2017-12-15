package miscellaneous;

public class SortedArrayMerge {
	 public void merge(int A[], int m, int B[], int n) {
		 
	        while(m > 0 && n > 0){
	            if(A[m-1] > B[n-1]){
	                A[m+n-1] = A[m-1];
	                m--;
	            }else{
	                A[m+n-1] = B[n-1];
	                n--;
	            }
	        }
	 
	        while(n > 0){
	            A[m+n-1] = B[n-1];
	            n--;
	        }
	    }
	 public void merge1(int A[], int m, int B[], int n) {
			int i = m - 1;
			int j = n - 1;
			int k = m + n - 1;
		 
			while (k >= 0) {
				if (j < 0 || (i >= 0 && A[i] > B[j]))
					A[k--] = A[i--];
				else
					A[k--] = B[j--];
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SortedArrayMerge s= new SortedArrayMerge();
int[] a;
a = new int[]{1,2,3,4,5};

int[] b;
b=new int[]{6,7,8,9};
s.merge1(a, 9, b, 4);
System.out.println();
		s.merge(a, 5, b, 4);
	}

}
