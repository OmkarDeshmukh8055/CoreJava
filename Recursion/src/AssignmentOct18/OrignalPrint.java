package AssignmentOct18;
public class OrignalPrint {

	public static void main(String[] args) {
  int a[]= {1,2,34};
  
  int i=0;
  int num=2;
  
  findnum(a,i,num);
  
	}

	private static void findnum(int[] a, int i, int num) {
         if(i<a.length)
         {
        	if( a[i]==num)
        		System.out.println("found at index "+i);
         
         else
         
        	 findnum(a,i+1,num);
         }
         
	
	else
	{
		System.out.println("not found");
	}
	}

}
