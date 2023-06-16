package arrayRecursion;

public class Ex1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};

loopi(a,0);
	}

	private static void loopi(int[] a, int i) {
   if(i<a.length)
   {
	   System.out.println(a[i]);
	   loopi(a,i+1);
   }
		
	}

}
