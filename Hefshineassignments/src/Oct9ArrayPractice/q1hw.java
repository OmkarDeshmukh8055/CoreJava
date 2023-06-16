package Oct9ArrayPractice;

public class q1hw {

	public static void main(String[] args) {
int []a= {1,2,34,6,23,3,2,5,2};
int num=2;
int index=0;
int cnt=0;
for (int i = 0; i < a.length; i++) 
{
if(a[i]==num)	
	cnt++;
index=i;
break;
}
if(cnt==0)
	System.out.println("not found"); 
else
	System.out.println("index "+index);
}
	}

