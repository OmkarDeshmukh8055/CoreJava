package array;

import java.util.Arrays;
import java.util.Scanner;

public class additionOfTwoArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);  
		System.out.println("enter Array Size of row and col");
		
		int row=sc.nextInt();
		int col=sc.nextInt();

		int a[][]=new int[row][col];
		System.out.println("Enter Element");
		for (int i = 0; i < a.length; i++)
		{	 
			for (int j = 0; j < a[0].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
