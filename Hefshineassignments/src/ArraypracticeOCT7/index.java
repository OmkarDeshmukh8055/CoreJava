package ArraypracticeOCT7;

public class index {

	public static void main(String[] args) {
int[]a= {1,2,3,4,5	};
int num=8;

int counter=0;
for (int i = 0; i < a.length; i++)
{
	if(a[i]==num) 
	{
		counter++;
	
	System.out.println("index "+i);
	}
	}
	if(counter==0) {
		System.out.println("not found");
}
	}
}
