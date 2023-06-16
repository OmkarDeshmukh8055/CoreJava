package practiceArraytest;

public class q4again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]a= {{21,21,43},
		{44,65,76},
		{34,43,56}};

for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if(j-i==0)
			System.out.print(" ");
		else
			System.out.print(a[i][j]+" ");
		
	
}System.out.println();
	}
	}
}
