package testpractice1Oct;

public class Test {
int c;
int fact;
   Test(int a)
{
	   this.c=a;
	   
	   if(a%2==0)
		   System.out.println("even");  
	   else
		   System.out.println("odd");
	
}
   
   void fact(int fact)
   {
	   int i=1;
	    do {		   
		 fact = fact=fact*i;
		   i++;
	    
	    }
		   while(i<5);
	    
		System.out.println(fact);
		   }
   void sum (int a,int b )
   {
	   System.out.println(a+b);
	   
   }
   
   }
	    
	   