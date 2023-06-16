package testpractice1Oct;

public class bike  extends vehicle {

int discountRate;
 int vehiclePrice;

bike()
{

}
void Display(int discountRate)
{
	this.discountRate=discountRate;
	System.out.println("Discountrate "+discountRate);
}
void Discount()
{	this.vehiclePrice=vehiclePrice;
this.discountRate=discountRate;
discountRate=95000*discountRate/100;
System.out.println("Discount Amt "+discountRate);

}

}
