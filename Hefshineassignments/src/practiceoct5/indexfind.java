package practiceoct5;

public class indexfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3,4,5};


int num=4;
int counter=0;
int index=0;
for (int i = 0; i < a.length; i++) {
	if(a[i]==num)
	{
		counter++;
index=i;
break;
}
}
	if(counter==0)
		System.out.println("not found");
	else
		System.out.println("found "+index);
	}
}
