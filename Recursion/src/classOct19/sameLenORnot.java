package classOct19;

public class sameLenORnot {

	public static void main(String[] args) {
   int a[]= {1,2,3,4,5};
   int b[]= {1,1,2,3,4,5};
   int i=0;
   
   check(a,b,i);
	}

	private static void check(int[] a, int[] b, int i) {

    if(a.length>i)
    {
    	if(a[i]==b[i])
    	{
    		
    		check(a,b,i+1);
    	}
    		
    else
   
    {
    	System.out.println(" not same len");
    }
	
	}
    else
    	System.out.println("same");
	}
}
