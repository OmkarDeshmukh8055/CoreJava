package testpractice23sep;

public class leapyrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int yrs=2028;
if(yrs%100==0)
	System.out.println("leap");

else if(yrs%400==0)
	System.out.println("leap");
else if(yrs%4==0)
	System.out.println("leap");
else
	System.out.println("not leap");
	}

}
