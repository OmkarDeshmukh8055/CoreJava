package solveProOfArraybyUsingColl;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListofArrayList {

	public static void main(String[] args) {
//  2D Array create
		
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("row count");
		int row=sc.nextInt();
		System.out.println("col count");
		int col=sc.nextInt();
		
		for (int i = 0; i < row; i++)
		{
		
		   list.add(new ArrayList<Integer>());	
		}
		for (int i = 0; i <row; i++) 
		{
			  ArrayList<Integer> temp=list.get(i);	

			for (int j = 0; j < col; j++) 
			{
				int num=sc.nextInt();
				temp.add(num);
			}
		}
		
		for (int i = 0; i <list.size(); i++)
		{
			
			for (int j = 0; j < list.get(i).size(); j++) 
			{
				System.out.print(list.get(i).get(j)+" ");
			}
			System.out.println();
		}

		
	}

}
