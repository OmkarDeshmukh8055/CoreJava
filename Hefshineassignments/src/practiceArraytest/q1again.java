package practiceArraytest;

import java.util.Iterator;

public class q1again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]a= {{1,2,3,},
		    {4,5,6,},
		    {7,8,9}};

int [][]b=new int[a.length][a.length];
for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length; j++)
	{
			
		b[j][i]=a[i][j];
		}
}
for (int i = 0; i < b.length; i++)
{
for (int j = 0; j < b.length; j++) 
{
	System.out.print(b[i][j]+" ");
}

	}
	}
}
