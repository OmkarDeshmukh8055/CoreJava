package test23septillpattern;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 20; j++) {
		if (j-i<=0&&j<=5||j+i<=9&&j>=5||j-i>=10&&j<=14||j+i>=19) 
			System.out.print("*");
	 else 
System.out.print(" ");
		}
	System.out.println();
}
	}

}
