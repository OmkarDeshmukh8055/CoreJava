package testpracticeArray;

public class leadernumbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5,3,2,11};
for (int i = 0; i < a.length; i++) {
	

int number=a[i];
int GrtNo=0;

for (int j= i+1; j < a.length; j++) {
	if(a[j]>number)
		GrtNo++;
}
	if(GrtNo==0)
		
System.out.println(number);
	
}
	}}
