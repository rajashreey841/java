/*

------
Create a class Box that uses a parameterized method to initialize the dimensions of a box.
(dimensions are width, height, depth of double type). 
The class should have a method that can return volume. 
Create an object of Box class and test the functionalities.
------

*/
class Box 
{
	double width,height,depth;

	Box(double w, double h, double d) 
	{
		width = w;
		height = h;
		depth = d;
	}
	
	public double Volume() 
	{
		return width * height * depth;
	}
}

public class Prg1 
{
    public static void main(String[] args) 
    {
		Box box = new Box(2,5,7);
		System.out.println(box.Volume());
	}
    
}
