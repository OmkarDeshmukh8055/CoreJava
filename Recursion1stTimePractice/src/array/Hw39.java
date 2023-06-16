package array;

import java.util.Arrays;

public class Hw39 {

	public static void main(String[] args) {

		int a[]= { 5, 1, 3, 6, 8, 2, 9, 0, 10 };
		
		int incn=0,decn=0,inc=0,dec=0;
		
			if(a[0]>a[1])
			{
				decn=a[0];
				incn=a[1];
			}
			else
			{
				incn=a[0];
				decn=a[1];
			}
			inc++;dec++;
				
			for (int i = 2; i < a.length; i++)
			{
				if(a[i]>incn)
				{
					incn=a[i];
					inc++;

				}
				else if(a[i]<decn)
				{
					decn=a[i];

					dec++;
				}
			}
			int ia[]=new int [inc];
			int da[]=new int [dec];
			int ii=0,di=0;
			System.out.println(inc);
			System.out.println(dec);
			if(a[0]>a[1])
			{
				ia[ii++]=a[1];
				da[di++]=a[0];
				incn=a[1];
			}
			
			for (int i = 2; i < a.length; i++)
			{
					 if(a[i]>incn)
					{
						ia[ii++]=a[i];
						incn=a[i];
						inc++;
					}
						
					 else
					 {
					   da[di]=a[i];
					   di++;
				     }
			}
			System.out.println(Arrays.toString(ia));
			System.out.println(Arrays.toString(da));


		}
}
