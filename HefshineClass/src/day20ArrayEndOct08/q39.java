package day20ArrayEndOct08;

public class q39 {

	public static void main(String[] args) {
int[]a= {5,1,3,6,8,2,9,0,10};

//  below array is second array  in example
//int[] a= {1,2,4,0,2};

int incas=0 , decas=0 ,incn=0, decn=0;//incas increasing array size
//decas decreasing array size
//incn increasing count number
//decn decreasing count number
if(a[0]>a[1])
{
	decn=a[0]; incn=a[1];
}
else
{
	decn=a[1]; incn=a[0];
}
decas++; incas++;

for (int i = 2; i < a.length; i++)
{
	if(a[i]>incn)
	{
		incas++;
		incn=a[i];
	}
	else if(a[i]<decn)
	{
		decas++;
		decn=a[i];
	}
	else
	{
		System.out.println("-1 no such seq possible");
		System.exit(0);
	}
	
}

int [] inca=new int [incas];
int [] deca=new int [decas];
 int  incaindex=0 ; int decaindex=0;
 
 if(a[0]>a[1])
 {
	deca[decaindex++]=a[0];
	inca[incaindex++]=a[1];
	incn=a[1];
 }

 for (int i = 2; i < a.length; i++)
 {
	 if(a[i]>incn)
	 {
		 incn=a[i];
		 inca[incaindex++]=a[i];
		 
	 }
	 else
	 {
		 deca[decaindex++]=a[i];
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
