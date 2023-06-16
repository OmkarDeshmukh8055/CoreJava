package day14Oct1Array;

public class arry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a={21,24,23,78,88};

int num=21;
int counter=0;
int index=0;
for (int i = 0; i < a.length; i++) {
	if( a[i]==num)
		counter++;
	index=i;
}
	

if (counter==0)

	System.out.println("not found");
	else
		System.out.println("found "+index); 

}

}
