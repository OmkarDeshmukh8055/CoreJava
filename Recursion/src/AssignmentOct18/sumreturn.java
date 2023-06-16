package AssignmentOct18;

public class sumreturn
{
  public static void main(String []args)
  {
	  int []a= {1,2,3,4,5};
	  
	  int i=0;
	  int result=myaddition(a,i);
	  System.out.println(result);
  }

private static int myaddition(int[] a, int i) 
{
     if(i<a.length)
     {
    	 int sum=myaddition(a,i+1);
      return sum+a[i];
	}
	return 0;
}
}
