package sundayOct10array;

public class minmin2find {

	public static void main(String[] args) {
int a[]= {1,21,3,4,5,6,7,87,654,32,2};

int min=a[0];

for (int i = 0; i < a.length; i++) 
{
   if(min>a[i])
	   min=a[i];
}
System.out.println(min); 
	int min2=a[0];
for (int j = 0; j < a.length; j++) 
{
	if(min!=a[j]) 
		if(min2>a[j])
		{
			min2=a[j];
	}
}
System.out.println(min2);
	}
}
