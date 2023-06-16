package cwq2;

public class areaOf {

public void area(int size)
{
	int squreArea=size*4;
	System.out.println("Area of squre "+squreArea);
}
public void area(int length,int width)
{
	int rectangleArea=length*width;
	System.out.println("Area of rectangle "+rectangleArea);
}
public void area(int base,int hight,int hypotenuse)
{
	int trangleArea=(base*hight*hypotenuse)/2;
	System.out.println("Area of trangle "+trangleArea);
}

}
