package ArraypracticeOCT7;

public class findMinMaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,3,4,5,7,8,9};
//minimum find
int min=a[0];
for (int i = 0; i < a.length; i++) {
	if(min>a[i])
		min=a[i];
	
}	
System.out.println("min " +min);

//max find

int max=a[0];
for (int i = 0; i < a.length; i++) {
	if(max<a[i])
		max=a[i];
}System.out.println("max "+max);

//difference between min & max

System.out.println("diff "+(max-min));
	}

}
