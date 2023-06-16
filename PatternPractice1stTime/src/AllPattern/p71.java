package AllPattern;

public class p71 {

	public static void main(String[] args) {
  
for (int i = 0; i < 9; i=i+2)
{  int counter=1;
      for (int j = 0; j < 9; j++) 
      {
		if(j-i<=0)
			System.out.print(counter);
		if(j<i/2)
			counter++;
		else
			counter--;
	}
      System.out.println();
}
	}

}
