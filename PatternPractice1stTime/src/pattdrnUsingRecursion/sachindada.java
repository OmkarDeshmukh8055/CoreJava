package pattdrnUsingRecursion;

public class sachindada {

	public static void main(String[] args) {
   int counter=1;
for (int i = 0; i < 5 ; i++)
{     int cnt=counter;
   for (int j =0; j <5; j++) 
   {
	   if(j+i>=4)
	   {
		  
	System.out.print(3+(cnt+(i-j))+" ");
	  cnt=cnt+counter;
	   
	   }
	   
	else
		System.out.print(" ");
}	
   counter++;
   System.out.println();
}
	}

}
