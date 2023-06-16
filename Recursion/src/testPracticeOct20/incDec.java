package testPracticeOct20;

import java.util.Arrays;

public class incDec {

	public static void main(String[] args) {
 int []a= {5,1,3,6,8,2,9,0,10};
 int inn=0,den=0,inc=0,dec=0;
       
        
				if(a[0]>a[1])
				{
					inn=a[1];
					den=a[0];
					inc++;
					dec++;
				}
				else

					{
						inn=a[0];
						den=a[1];
						inc++;
						dec++;
					}
				for (int i = 2; i < a.length; i++)
				{
					if(a[i]>inn)
					{
						inn=a[i];
						inc++;
					}
					else if(a[i]<den)
					{
						den=a[i];
						dec++;
					}
					else {
						System.out.println(-1);
						System.exit(0);
				}
				}
				
				int inca[]=new int[inc];
				int deca[]=new int[dec];
int incindex=0,decindex=0;
				if(a[0]>a[1])
				{
					inn=a[1];
					den=a[0];
					deca[decindex++]=a[0];
					inca[incindex++]=a[1];
				}
				else

					if(a[0]<a[1])
					{
						inn=a[0];
						den=a[1];
						deca[decindex++]=a[1];
						inca[incindex++]=a[0];
					}
				for (int i = 2; i < a.length; i++)
				{
					if(a[i]>inn)
					{
						inn=a[i];
						inca[incindex++]=a[i];
					}
					else 
					{
						deca[decindex++]=a[i];
					}
				}
				for (int i = 0; i < inca.length; i++)
				{
					System.out.print(inca[i]+" ");
				}
				System.out.println();
				for (int i = 0; i < deca.length; i++) 
				{
					System.out.print(deca[i]+" ");
				}
           	}


}
