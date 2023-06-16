package AllPattern;

public class p73SIR {

	public static void main(String[] args) {
    int start=1;
for (int i = 0; i < 5; i++) 
{   
	int counter=start;
	int diff=4;
	for (int j = 0; j <5; j++) 
	{
		if(j-i<=0)
			System.out.print(counter+" ");
		counter=counter+diff;
		diff--;
	}
	System.out.println();
	start++;
}
	}

}
