package akshaychavansir21sep;

public class np4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			int count=5;
			for (int j = 0; j <5; j++) {
				if (j+i<=4) 
					System.out.print(count--);
				 else 
					 System.out.print(" ");
				}
			System.out.println();
		}

	}

}
