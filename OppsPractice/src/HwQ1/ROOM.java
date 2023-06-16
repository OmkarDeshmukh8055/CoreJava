package HwQ1;

public class ROOM
{
	int length;
	int width;
	int hight;
	public ROOM(int length,	int width,	int hight)
	{
		this. length=length;
		this. width=width;
		this. hight=hight;
		
	}
	float whiteWashingArea()
	{
		return (2*(length*hight)+2*(width*hight)+(length*width));
	}
	int whiteCostArea()
	{
		return ((2*(length*hight)+2*(width*hight)+(length*width))*80);

	}
	int floweringCost()
	{
		return ((length*width)*200);
	}
	int cementCost()
	{
		return (length*width*100);
	}
	
}
