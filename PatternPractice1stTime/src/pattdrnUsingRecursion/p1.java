package pattdrnUsingRecursion;

public class p1 {

	
	public static void main(String[] args) {

    loopi(0);
	}

	private static void loopi(int i) {

   if(i<5)
   {
	   loopj(i,0);
	   System.out.println();
	   loopi(i+1);
   }
	}

	private static void loopj(int i, int j) {
  
 if(j<5)
 {
	 if(j-i<=0)
	 System.out.print("*");
	 else
		 System.out.print(" ");
	 loopj(i,j+1);
  }
	}

}
