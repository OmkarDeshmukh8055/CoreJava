package day15;

public class findmini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {11,2,3,4,5,6,7};
int mini=a[0];

for (int i = 0; i < a.length; i++) {
	if(mini>a[i])
	{
		mini=a[i];
	}
}
System.out.println(mini);
	}

}
