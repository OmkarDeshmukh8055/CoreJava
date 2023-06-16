package as21sep;

public class np5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <5;j++)
					 {
			if (j+i<=4) 
				System.out.print(j+i+1);
			else if (j-i<=-4)
				System.out.print(5-j);
			else 
				System.out.print(" ");

				
			}
			System.out.println();

	}
}
}
