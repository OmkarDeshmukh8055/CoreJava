package day4;

public class hwq {

	public static void main(String[] args) {
		/*/ TODO Auto-generated method stub
int count=1234;
for(int num=0;num<5;num=count/10)
	count=count++;
System.out.println(count);
	}*/
		int num=123456;
		int sum=0;
		while(num>0)
		{sum=sum+num%10;
		num=num/10;
		
		}
		System.out.println(sum);
	
	}
}
