package day17;

public class outersubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]b= {{1,2,3,}
,{4,5,6}
,{7,8,9}};

int sum=0;

for (int i = 0; i < b.length; i++) {
	for (int j = 0; j < b[i].length; j++) {
		if(i==0||i==b.length-1 ||j==0||j==b[i].length-1)
			
		{}
		else
			sum=sum+b[i][j];
		
	}
}System.out.println(sum);

	}

}
