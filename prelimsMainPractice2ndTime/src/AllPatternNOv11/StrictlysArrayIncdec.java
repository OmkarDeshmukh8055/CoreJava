package AllPatternNOv11;

import java.util.Arrays;

public class StrictlysArrayIncdec {

	public static void main(String[] args) {

		int[]a= {5,1,3,6,8,2,9,0,10};
		int incs = 0, decs = 0, incn = 0, decn = 0;

		if (a[0] > a[1])
		{
			decn = a[0];
			incn = a[1];
		} else 
		{
			decn = a[0];
			incn = a[1];
		}
		incs++;
		decs++;
		
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>incn)
			{
				incn=a[i];
				incs++;
			}
			else if(a[i]<decn)
			{
				decn=a[i];
				decs++;
			}		
		}
		int ina[]=new int [incs];
		int deca[]=new int [decs];
		int i1=0,i2=0;
		if (a[0] > a[1])
		{
			ina[i1++]=a[1];
			deca[i2++]=a[0];
			incn=a[1];
		}
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>incn)
			{
				ina[i1++]=a[i];
				incn=a[i];

			}
			else 
			{
				deca[i2++]=a[i];
			}		
		}
		for (int i = 0; i <ina.length; i++) {
			System.out.print(ina[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < deca.length; i++) {
			System.out.print(deca[i]+" ");
		}

		
		
	}

}
