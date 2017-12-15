package miscellaneous;

public class Insertion_Sort {
 public void Insertion(int a[]){
	 for(int i=1;i<a.length;i++){
		 int insert = a[i];
		 int j=i;
		 while((j>0)&&(a[j-1]>insert)){
			a[j]=a[j-1];
			j--;
		 }
		 a[j]= insert;
		 for(int n :a){
			 System.out.print(","+n);
		 }
		 System.out.println();
	 }
	 
 }
 public void InsertSort(int a[]){
	 for(int i=1;i<a.length;i++){
		 int insert=a[i];
		 int j=i;
		 while(j> 0 && a[j-1]>insert){
			 a[j]=a[j-1];
			 j--;
		 }
		 a[j]=insert;
		 for(int n :a){
			 System.out.print("  "+n);
		 }
		 System.out.println();
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Insertion_Sort insertt=new Insertion_Sort();
int x[]={7,2,4,9,3,1,98,33};
System.out.println("The length of the array "+x.length);
insertt.InsertSort(x);
	}

}
