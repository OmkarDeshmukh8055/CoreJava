package testpracticeArray;

public class q12again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {33,5,5,7,8,76,98};
int evencount=0;
for (int i = 0; i < a.length; i++) {
	if(a[i]%2==0)
	
		evencount++;
	}
	
	int [] even=new int[evencount];
int []odd=new int[a.length-evencount];

int j=0;
int k=0;
for (int i = 0; i < a.length; i++) {
	if(a[i]%2==0)
	
		even[j++]=a[i];
		else 
			odd[k++]=a[i];
		
}
System.out.println("even number");
	for (int i = 0; i < even.length; i++) {
System.out.println(even[i]);
}
	System.out.println("odd number");
	for (int i = 0; i < odd.length; i++) {
	System.out.println(odd[i]);	
	
	}
	}	
}
