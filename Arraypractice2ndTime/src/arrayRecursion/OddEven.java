package arrayRecursion;

import java.util.Arrays;

public class OddEven {

	public static void main(String[] args) {

int a[]= {1,2,4,5,6,7,8,9,0};

int evencnt=0;
  int e=ec(evencnt,a,0);
  System.out.println(e);

  int[] ea=new int[e];
  int eindex=0,oindex=0;
  int[] oa=new int[a.length-e];
  
  
 array(a,e,0,ea,oa,eindex,oindex);
 System.out.println("even Array");
 System.out.println(Arrays.toString(ea));
 System.out.println("odd Array");
 System.out.println(Arrays.toString(oa));
 

	}

	private static void array(int[] a, int e, int i, int[] ea, int[] oa, int eindex, int oindex) {

if(i<a.length)
{
	if(a[i]%2==0)
	{
		ea[eindex++]=a[i];
	}
	else
	{
		oa[oindex++]=a[i];
	}
	array(a, e, i+1, ea, oa, eindex, oindex);
}

	}

	private static int ec(int evencnt, int[] a, int i) {
		if(i<a.length)
		{
			if(a[i]%2==0)
			{
				evencnt++;
			}
			return ec(evencnt, a, i+1);
		}
		return evencnt;

		
	}
	

}
