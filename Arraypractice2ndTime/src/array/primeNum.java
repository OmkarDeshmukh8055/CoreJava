package array;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("starting point must be greater than 1");
int start=sc.nextInt();
System.out.println("ending point");

int end=sc.nextInt();
	
	
	for (int i = start; i < end; i++) 
	{	
		int cnt=0;

			for (int j = 2; j < i; j++) {
				
			
		
		if(i%j==0)
		{
			cnt++;
			break;
		}
	}
		
		if(cnt==0)
		{
			System.out.println(i);
		}
		
	}
			
	}

}
