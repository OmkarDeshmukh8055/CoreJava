package practiceArraytest;

public class q2again {

	public static void main(String[] args) {
int []a= {1,2,3,4,5,6,7};

int []b=new int [a.length-2];
int  i=0; int j=0;
while(i<a.length && j<b.length)
{
if(a[i]!=5 && a[i]!=1) {
	b[j]=a[i];
j++;
}
i++;
}
for (int j2 = 0; j2 < b.length; j2++) {
	System.out.println(b[j2]);
}
	}
	}
	