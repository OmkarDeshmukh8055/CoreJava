package practiceArraytest;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]a= {{1,2,3}
            ,{4,5,6}, 
             {7,9,0}};

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
