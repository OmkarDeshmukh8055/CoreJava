package day15;

public class miniMini2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {9,1,2,3,4,5,6,7,8};

int mini=a[0];

for (int i = 1; i < a.length; i++) {
	
		if(a[i]<mini) {
			mini=a[i];
	}
		
	   }System.out.println(mini);
	int min2=a[0];
	
	for (int i = 1; i < a.length; i++) {
		
			if(a[i]!=mini)
			{
				if(a[i]<min2)
					min2=a[i];
			}
		}System.out.println(min2);
		int min3=a[0];
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i]!=mini && a[i]!=min2)
			{
				 
				{
				if(a[i]<min3) 
                   min3=a[i];

				}
				}
			}
		System.out.println(min3);	
	

	
	}}
