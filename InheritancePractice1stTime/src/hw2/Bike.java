package hw2;

public class Bike extends Vehicle {
	
	 int DiscountRate;

	

	public Bike(String vehicleName, String bikeModel, String serviceCenter, int price, int discountRate) {
		super(vehicleName, bikeModel, serviceCenter, price);
		DiscountRate = discountRate;
	}
	public void Display1()
	{
		System.out.println("Bike [DiscountRate=" + DiscountRate + ", VehicleName=" + VehicleName + ", BikeModel=" + BikeModel
				+ ", serviceCenter=" + serviceCenter + ", price=" + price+"]");
	}

	public static void main(String[] args) {

		Bike b=new Bike("pune", "fazer", "Yamaha", 100000, 2000);
		b.Display();
		b.Display1();
		
	}
}
