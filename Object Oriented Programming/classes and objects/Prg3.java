/*

---------
Design a class that can be used by a health care professional to keep track of a patient’s vital statistics.
The following are the details:
Name of the class - Patient
Member Variables - patientName(String),height(double),weight(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. 
The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.
----------

*/

class Patient 
{
	String name;
	double height,weight;
	
	public Patient(String name, double height, double weight) 
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public double BMI () 
	{
		return ( weight / ( height * height ) ) * 703;
	}
}

public class Prg3 
{
	public static void main(String[] args) 
	{
		Patient obj = new Patient("Krishna", 1.627, 60);
		System.out.println(obj.BMI());

	}

}