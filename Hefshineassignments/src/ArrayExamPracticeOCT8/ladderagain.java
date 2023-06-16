package ArrayExamPracticeOCT8;

public class ladderagain 
{

	public static void main(String[] args) 
	{
int []a= {1,2,3,7,4,7,6};

for (int i = 0; i < a.length; i++)
{
		int counter=0;
	for (int j = i+1; j < a.length; j++) 
	{
		if(a[i]<a[j])
       {
			counter++;
					
	   }
	}
if(counter==0)
	System.out.println(a[i]);

}
	}

}
