package erp;
class h{
public static void main(String args[]) 
{
	
        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];               
    int sum = 0;
    for (int i = 0; i < 3; ++i) 
        for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;
    for (int i = 0; i < 3; ++i) 
        for (int j = 0; j < i + 1; ++j)
                sum  = sum+arr[i][j];
    System.out.println(sum); 	
      
         int a,b,c,d;
         a=b=c=d=20;
        a+=b-=c*=d/=20;
       System.out.println(a+" "+b+" "+c+" "+d);
       int sum1 = 0;
       for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
           sum1 += i;
    System.out.println(sum1);
    int x, y, z;
    x = 0;
    y = 1;
x = y = z = 9;
System.out.println(y);

    } 
}