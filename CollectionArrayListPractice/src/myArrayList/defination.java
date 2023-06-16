package myArrayList;

import java.util.ArrayList;
import java.util.List;

public class defination<p>
{
	String modelName;
	int carSpeed;
	int a[] = new int[5];
	int index = 0;

	public  void add(int num)
	{
		if(index<a.length)
		a[index++]=num;
		else
		{
			int size = (int)(a.length*1.5);
			int b[]=new int[size];
				for (int i = 0; i < a.length; i++) 
				{
					b[i]=a[i];
				}
			
				a=b;
				a[index++]=num;
			
		  }
	    }

public void print()
{
	for (int i = 0; i <index; i++) 
	{
		System.out.println(a[i]);
	}
	System.out.println();
}
	
public defination(String modelName, int carSpeed)
{
		super();
		this.modelName = modelName;
		this.carSpeed = carSpeed;
}


public String getModelName()
{
	return modelName;
}

@Override
public String toString() {
	return "defination [modelName=" + modelName + ", carSpeed=" + carSpeed + "]";
}


public void setModelName(String modelName) {
	this.modelName = modelName;
}


public int getCarSpeed() {
	return carSpeed;
}


public void setCarSpeed(int carSpeed) 
{
	this.carSpeed = carSpeed;
}


public static void main(String[] args)
{
	String a= "abcd";
	
	System.out.println(a.toUpperCase());
}
}
