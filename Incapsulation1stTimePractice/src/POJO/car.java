package POJO;

public class car {
 // POJO : plain old java Object
 
private int numOfWheels;

private int numOfGears;

public car(int numOfWheels, int numOfGears) {
	super();
	if(numOfWheels>=0 && numOfWheels<=5  && numOfGears>=0 && numOfGears<=5)

	this.numOfWheels = numOfWheels;
	this.numOfGears = numOfGears;
}

public car() {
	super();

}


public String toString() {
	return "car [numOfWheels=" + numOfWheels + ", numOfGears=" + numOfGears + "]";
}

public int getNumOfWheels() {
	return numOfWheels;
}

public void setNumOfWheels(int numOfWheels) {
	if(numOfWheels>=0 && numOfWheels<=5)

	this.numOfWheels = numOfWheels;
}

public int getNumOfGears() {
	return numOfGears;
}

public void setNumOfGears(int numOfGears) {
	if(numOfGears>=0 && numOfGears<=5)
	this.numOfGears = numOfGears;
}




}
