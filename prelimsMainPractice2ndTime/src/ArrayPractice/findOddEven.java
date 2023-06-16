package ArrayPractice;

import java.util.Arrays;

public class findOddEven {

	public static void main(String[] args) {

int a[]= {1,2,3,4,5,6,7};

int evenc=0;
int oddc=0;
for (int i = 0; i < a.length; i++)
{

		if(a[i]%2==0)
			evenc++;
		else
			oddc++;

}
System.out.println(evenc);
System.out.println(oddc);

int ea[]=new int[evenc];
int eai=0;

int oa[]=new int[oddc];
int oai=0;

for (int i = 0; i < a.length; i++)
{

   for (int j = 0; j < a.length; j++) 
   {
	if(a[i]%2==0)
	{
		ea[eai++]=a[i];
		break;
	}
	if(a[i]%2!=0)
	{
		oa[oai++]=a[i];
		break;
	}
	
  }
} 

System.out.println(Arrays.toString(ea));
System.out.println(Arrays.toString(oa));

	}

}
