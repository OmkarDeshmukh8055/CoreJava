package ArrayExamPracticeOCT8;

public class ladder 
{

	public static void main(String[] args) 
	{
      int []a= {1,2,3,4,5,8,54,2,24,4};

       for (int i = 0; i < a.length; i++) 
        {
    	   int num=a[i];
           int counter=0;
        
    	   for (int j = i+1; j < a.length; j++)
    	   {
			if(num<a[j]) 
			{
				counter++;
			
		}}if(counter==0)
    	   System.out.println(num);
	
        }

	}

}
