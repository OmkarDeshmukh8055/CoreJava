package day6;

public class q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 11; i++) {
	for (int j = 0; j <6; j++) {
		if(j+i<=5  &&i<5)
			
		System.out.print((char)(5-j-i+65)+" ");
		else	if(i>=5&& j-i<=-5)
			System.out.print((char)+(5-j+65)+" ");
		else
			System.out.print(" ");

	}
	System.out.println();
}
	
}
}