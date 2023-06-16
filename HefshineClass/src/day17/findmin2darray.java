package day17;

public class findmin2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]b= {{2,2,3},
		{4,5,6},{7,8,9}};

int max=0;
for (int i = 0; i < b.length; i++) {
	for (int j = 0; j < b.length; j++) {
		if(max<b[i][j])
		{
			max=b[i][j];		
	}
	}}System.out.println(max);
	
	int min=Integer.MAX_VALUE;
	for (int i = 0; i < b.length; i++) 
	{
		for (int j = 0; j < b.length; j++)
		{
			if(b[i][j]<min)
			{
				min=b[i][j];		
		}
		}
}System.out.println(min);
	
	}

}
