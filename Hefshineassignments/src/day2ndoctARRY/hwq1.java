package day2ndoctARRY;

public class hwq1 {

	public static void main(String[] args) {

int[] a= {1,2,3,4,4,5,6,7};
int num=4;
int counter = 0;
int index=0;
for (int i = 0; i < a.length; i++) {
 	
if(a[i]==num)
{
counter++;
index=i;
break;
}
}
if(counter==0) {
	System.out.println("not found");}
else {
System.out.println("index found "+index);
}
}}