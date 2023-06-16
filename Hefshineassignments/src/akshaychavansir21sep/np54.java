package akshaychavansir21sep;

public class np54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=9;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <9; j++) {
				if (j-i>=0 ) 
					System.out.print(" "+cnt);
				
				 else 
					 System.out.print(" ");
				}
			System.out.println();
			cnt--;
		}

	}

}
