package erp;

public class Addition_Of_Two_Array {
	
		public static void main(String[] args) {
			int[][] a={{1,2,3},
					    {4,5,6},
					     {7,8,9}};
			int[][] b={{1,2,3},
					    {4,5,6},
					     {7,8,9}};
			int[][] c=new int[a.length][a[0].length];
			add(a,b,c);
		
		}//EndOfMainMethod

		private static void add(int[][] a, int[][] b, int[][] c) {
		
			//code here
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					c[i][j]=c[i][j]+a[i][j]+b[i][j];
				}
			}
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

