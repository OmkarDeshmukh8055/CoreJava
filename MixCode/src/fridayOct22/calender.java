package fridayOct22;

public class calender {

	public static void main(String[] args) {
int day=445;
System.out.println(day/365+" yrs");
System.out.println(day%365/30 +"  month");
System.out.println(day%365%30/7 +"  weaks");
System.out.println(day%365%30%7 +"  days");
	}

}
