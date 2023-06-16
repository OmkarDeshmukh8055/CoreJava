package array;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Enter number");
		int num = sc.nextInt();
		boolean notPresent=true;
		int i = 0;
		while (i < a.length)
		{
			if (a[i] == num) 
			{
				notPresent=false;
				System.out.println("found at index " + i);
				break;
			}
			
			i++;
		}
		if(notPresent)
		{
			System.out.println("not");
		}


	}

}
