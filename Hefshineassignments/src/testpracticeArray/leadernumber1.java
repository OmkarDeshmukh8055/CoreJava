package testpracticeArray;

public class leadernumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5,3,5,3};
for (int i = 0; i < a.length; i++) 
 {
	
int num=a[i];
int Grtno=0;
for (int j = i+1; j < a.length; j++)
 {
	if(a[j]>num)
		Grtno++;

		
	}
if(Grtno==0)
	System.out.println(num);
}

	}

}
