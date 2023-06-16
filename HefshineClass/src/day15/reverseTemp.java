package day15;

public class reverseTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,2,3,4,5,6};
int i=0;
int j=(a.length-1);
while(i<j)
{
	int temp=a[i];
	a[i]=a[j];
	i++;
	j--;
	
}
for (int k = 0; k < a.length; k++) {
	System.out.println(a[k]);
	
}
	}

}
