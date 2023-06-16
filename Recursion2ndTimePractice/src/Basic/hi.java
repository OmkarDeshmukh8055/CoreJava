package Basic;

import java.util.Scanner;

public class hi {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for (int i = 2; i <n; i++) 
	{
		if(n%i==0)
		{
			int d=i;
			int cnt=0;
			for (int j = 2; j < d; j++) 
			{
				if(d%j==0)
				{
					cnt++;
				}
			}
			if(cnt==0)
				sum=sum+d;
		}
	}
	System.out.println(sum);
	}
}
