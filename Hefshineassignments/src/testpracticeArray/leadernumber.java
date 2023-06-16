package testpracticeArray;

public class leadernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,1,21,21,12,32,1,23,2,3,4	};
for (int i = 0; i < a.length; i++) 
	
{
	
int num=a[i];
int greatnum=0;
for (int j= i+1; j < a.length; j++)
{

if(a[j]>num)
	greatnum++;

}if(greatnum==0)
	System.out.println(num);
}}
	}