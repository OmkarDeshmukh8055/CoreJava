package patternNov8;

public class AverageOfInnerEle {

	public static void main(String[] args) {
int a[][]= {{1,2,3,4},
		   {5,6,7,8},
		   {9,8,7,6}};
int INercnt=0;
int sum=0;
int avg=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length; j++) 
	{
		if(i!=0 && j!=0 && i!=a.length-1&& j!=a[i].length-1)
		{
			System.out.println(a[i][j]);
			INercnt++;
			sum=sum+a[i][j];
			avg=sum/INercnt;
		}
	}
}
System.out.println(sum);
System.out.println(avg);

	}

}
