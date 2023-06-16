package testPracticetillOct23;

public class minFind {

	public static void main(String[] args) {
        int a[]= {2,3,4,5,1,55,6};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) 
        {
		    
				if(min>a[i])
					min=a[i];	
		}System.out.println(min);
		
		 int min1=Integer.MAX_VALUE;
	        for (int i = 0; i < a.length; i++) 
	        {
			    if(min!=a[i])
			    {
					if(min1>a[i])
						min1=a[i];	
			}
	        }System.out.println(min1);
	}

}
