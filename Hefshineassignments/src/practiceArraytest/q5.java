package practiceArraytest;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3}, 
			    {4,5,6},
	           {7,8,9}};
int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==0 || i==a.length-1 || j==0 || j==a[i].length-1)
				{
					sum=sum+a[i][j];	
				}
		           }
			
		}System.out.println ("sum "+sum);
		System.out.println( "avrage "+sum/8);
	}
 }

