package day5;

public class h46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 6; i++) {
	for (int j = 0; j < 6; j++) {
		if (j-i<=0) {
			System.out.print(i+1);
			
		} else {
			System.out.print(" ");

		}
	}
	System.out.println();
}
	}

}
