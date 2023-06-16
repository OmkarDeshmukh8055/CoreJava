package classOct19;

import java.util.Arrays;

public class SequenseOfAssendingANDdisending 
{
  static int inc=1, inn=0, dec=1, den=0,inindex=1, deindex=1; 
	public static void main(String[] args) 
	{
         
		int a[]= {9,1,3,6,8,2,9,0,10};
		
		     if(a[0]>a[1])
		     {
		    	 den=a[0]; inn=a[1];
		     }
		     else
		     {
		    	  den=a[1]; inn=a[0]; 
		      }
		      int i=2;
		      findcont(a,i);
		      int[] ina=new int [inc];
		      int[] dea=new int [dec];
		      if(a[0]>a[1])
		      {
		    	  
		    	  den=a[0];inn=a[1];
		    	  dea[0]=a[0];ina[0]=a[1];
		      }
		      else
		      {
		    	  den=a[0];inn=a[0];
		    	  dea[0]=a[1];ina[0]=a[0];
		      
		      }
		      i=2;putelement(a,i,ina,dea);
		      System.out.println(Arrays.toString(ina));
		      System.out.println(Arrays.toString(dea));
		      
	}
	private static void putelement(int[] a, int i, int[] ina, int[] dea)
	{
          if(i<a.length)
          {
        	  if(a[i]>inn)
        	  {
        	  inn=a[i];
        	  ina[inindex++]=a[i];
          }
          else
          {
        	  den=a[i];
        	  dea[deindex++]=a[i];
          }
		putelement(a,i+1,ina,dea);
          }
	}

private static void findcont(int[] a, int i)
{
  	if(i<a.length)
  	{
  		if(a[i]>inn)
  		{
  			inc++;inn=a[i];
  		}
  		else if(a[i]<den)
  		{
  			dec++;den=a[i];
  		}
  		else
  		{
  			System.out.println("no such seq possible");
  		System.out.println(0);
  		}
  		findcont(a,i+1);
  	}
}
}

