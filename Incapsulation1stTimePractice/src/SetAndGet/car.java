package SetAndGet;

public class car {


private int numOfWheels;

public void setNoOfWheels(int num) throws Exception
{
	if(num>=0 && num<5)
	 numOfWheels=num;
	else
	throw new Exception("In this car maximum 4 wheels  ");
}
public int getNoOfWheels()
{
	return numOfWheels;
}


}
