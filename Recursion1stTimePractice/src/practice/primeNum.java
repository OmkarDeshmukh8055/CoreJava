package practice;

import java.util.Iterator;

public class primeNum {

	public static void main(String[] args) {
		
		int num=1;
		while(num<=100)
		{	
			int cnt=0;
			for (int i = 2; i <num; i++)
			{
				if(num%i==0)
				{
				cnt++;	
				}
				
			}
			if(cnt==0)
				System.out.println(num);
			num++;
		}
	}

}
