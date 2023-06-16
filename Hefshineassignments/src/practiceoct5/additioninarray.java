package practiceoct5;

public class additioninarray {

	public static void main(String[] args){
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5};
int avr=0;
int sum=0;
for (int i = 0; i < a.length; i++) {
	

sum=sum+a[i];
 avr=sum/5;
}
System.out.println(sum);
System.out.println(avr);
	}
}
