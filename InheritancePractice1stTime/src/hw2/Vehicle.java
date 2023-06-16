package hw2;

public class Vehicle {

	String VehicleName;
	String BikeModel;
	String serviceCenter;
	int price;
	public Vehicle(String vehicleName, String bikeModel, String serviceCenter,int price) {
		super();
		VehicleName = vehicleName;
		BikeModel = bikeModel;
		this.serviceCenter = serviceCenter;
		this.price=price;
	}
	public void Display() {
		System.out.println( "VehicleName=" + VehicleName + " BikeModel=" + BikeModel + " serviceCenter=" + serviceCenter
				 +" BikePrice= "+price);
	}
	
}
