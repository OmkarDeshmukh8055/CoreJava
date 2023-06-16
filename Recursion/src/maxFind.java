
public class maxFind {

	public static void main(String[] args) {
		 int []a= {11,12,13,14,50,15,16,17};
		 
		 int i=0;
		 int max=Integer.MIN_VALUE;
		 printmax(a,i,max);

		}

			private static void printmax(int[] a, int i,int max)
			{
				if(i<a.length)
				{
				  if(a[i]>max)
					  max=a[i];
				  printmax(a,i+1,max);
				}
				else
				{
					System.out.println(max);
				}

	}

}
