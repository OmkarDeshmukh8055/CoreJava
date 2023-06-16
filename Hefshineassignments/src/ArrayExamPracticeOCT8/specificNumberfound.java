package ArrayExamPracticeOCT8;

public class specificNumberfound 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,3,6,9,5};
		int num=1;
        int counter=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num) 
			{
				System.out.println("found "+num+" "+"index "+i);
				counter++;
				
			}
		}
	      if(counter==0) 
      	 {
		 System.out.println("not found");
    	 }

	}

}
