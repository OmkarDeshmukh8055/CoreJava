package ArraypracticeOCT7;

public class q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a= {{1,2,3,4,5,6},
            {6,5,4,3,2,1},
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
            {6,5,4,3,2,1},
            {1,2,3,4,5,6}};

for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if(i==0 || j==0 || i==a.length-1|| j==a.length-1)
			System.out.print(a[i][j]+" ");
		else
			System.out.print("  ");
	}System.out.println();
}
	}

}
