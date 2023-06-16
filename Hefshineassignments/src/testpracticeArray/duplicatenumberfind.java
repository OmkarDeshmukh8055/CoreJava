package testpracticeArray;


public class duplicatenumberfind {
public static void main(String []args) {
	int []a= {1,2,33,22,33,3,3,22,33,33,33,33,22,22,2};
	int cnt=0;
	for (int i = 0; i < a.length; i++)
	{
		for (int j = i+1; j < a.length; j++) 
		{
			if(a[i]==a[j])
			{
				cnt++;
				break;
			}
		}
	}

int []b=new int[a.length-cnt];
int k=0;
for (int i = 0; i < a.length; i++) 
{
	int num=a[i] ;
	int countB=0;
	for (int j = 0; j < b.length; j++)
	{
		if(b[j]==num)
			countB++;
	}
	if(countB==0)
	{
		b[k]=num;
		k++;
		
	}
}for (int i = 0; i < b.length; i++) {
	System.out.println(b[i]);
}
}
}