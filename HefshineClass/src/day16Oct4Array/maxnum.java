package day16Oct4Array;

public class maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {2,32,2,44,685,44,120};
for (int i = 0; i < a.length; i++)
{
	int num=a[i];
	int greatercount=0;
	for (int j = i+1; j < a.length; j++)
	{
	if(a[j]>num)	
		greatercount++;
			
		}
	if(greatercount==0)
		System.out.println(num);
}
	}

}
