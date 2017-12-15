package miscellaneous;

public class Helloh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s="HELLO";
//for(int a=0;a<s.length();a++){
//	 System.out.println(s.charAt(a) +" =" + (s.charAt(a)-'A'));
//}
//		int low=0;
//		int high =10;
//		while(low<=high){
//		long mid = (low + high) >>> 1;
//		System.out.println(mid);
		
	String s="Hello world mt name is Ronak";
	String [] arr = s.split(" ");
	for(String n:arr){
		System.out.println(n);
	}
	int a = arr.length;
	System.out.println(a);
	int len = arr[a-1].length();
	System.out.println(len);
int f=0;
int g=10;
System.out.println(f&g);
	}
}
//