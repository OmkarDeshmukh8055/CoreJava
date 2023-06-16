package erp;

public class Rotate_Left {

	
		public static void main(String[] args) 
		{
			int[] a= {3,2,4,6,5,6,8};
			myCode(a);
		}
		//EndOfMainMethod

		private static void myCode(int[] a) 
		{
			//WriteCode Here
			int c=a[0];
			for (int i = 0; i < a.length-1; i++) {
				a[i]=a[i+1];
			}
			a[a.length-1]=c;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		}
	}

	