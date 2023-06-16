package test_1oct;

public class Test {
 
	
	
int a;
int fact;
int sum;
Test(int a){
if(a%2==0)
{
	System.out.println("Even");
}
	else {
		System.out.println("odd");
}
}




void sum (int a, int b) {
	
	sum=a+b;
	System.out.println("sum "+sum);
}

void fact (int fact) {
	this.fact=fact;
	
	int i=1;
	do {
		System.out.println("fact "+fact);
		
	}
	while(i<5); {
		
		fact=fact*i;
	
}
	
}

	
}