package testpractice22sep;

public class p78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 20; j++) {
				if(j-i<=0 || j+i<10 &&j>4 || j-i>=10&&j<15 || j+i>=19)
						System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
}
	}

}
