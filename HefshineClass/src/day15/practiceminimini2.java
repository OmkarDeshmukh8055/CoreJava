package day15;

public class practiceminimini2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {12,1,2,3,4,5,6,7};

int min=a[0];

for (int i = 1; i < a.length; i++) {

if(min>a[i])
{
min=a[i];

}
}
System.out.println(min); 
int min2=a[0];

for (int i = 1; i < a.length; i++) {
	if (min!=a[i]) {
	if	(min2>a[i]) {
			min2=a[i];
		}
	}
	
}System.out.println(min2);

int min3=a[0];
for (int i = 1; i < a.length; i++) {
	if(min!=a[i] && min2!=a[i])
{
	if(min3>a[i])
	{
		min3=a[i];
		
	}
}
}System.out.println(min3);
int min4;

min4=a[0];

for (int i = 1; i < a.length; i++) {
	if(min!=a[i] && min2!=a[i] && min3!=a[i])
	{
		if(min4>a[i]) {
			min4=a[i];
		}
	}
}System.out.println(min4);





























	}

}
