package test23septillpattern;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 9; j++) {
		if (j-i<=0) 
			System.out.print((char)+(j+65));
		if(j-i<=2&&j>=3)
System.out.print((char)+(j-i-1+65));
		
	}
System.out.println();
	}
	}
}
