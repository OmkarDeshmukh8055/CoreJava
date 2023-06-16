package ArrayPractice;

import java.util.Scanner;

public class ArrayEleFromUser {

	public static void main(String[] args) {

		int a[][] = new int[3][3];
		System.out.println("Enter Array a [i][j]");
			
		for (int i = 0; i < 3; i++)
		{

			for (int j = 0; j < 3; j++) 
			{

				Scanner sc = new Scanner(System.in);

				a[i][j] = sc.nextInt();

			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
