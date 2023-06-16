package sundayOct10array;

public class removeElement 
{

	public static void main(String[] args) 
	{
    int[]a= {1,2,3,4,5,6};
    
    int j=0;
    int i=0;
    int b[]=new int [a.length-1];
    while(i<a.length && j<b.length)
    {
    	if(a[i]!=4)
    	{
    		b[j]=a[i];
    		j++;
    	}
       i++;
    }
    for (int k = 0; k < b.length; k++) 
    {
    	System.out.println(b[k]);
	}
    
  	

	}	

}
