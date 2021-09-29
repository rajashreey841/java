/*

-----------
Create an employee class with properties of your choice. Create an object of this class and also create a clone of the same. 
After making the clone, change the properties of the original employee object and 
print the properties of both the original and clone object and note down your observation.
----------

*/

public class Employee implements Cloneable 
{
	private String name;
	public Employee(String name) 
    {
		this.name = name;
	}
	
	public String getName() 
    {
		return name;
	}

	public void setName(String name) 
    {
		this.name = name;
	}
	
	@Override
	public Employee clone() 
    {
		try 
        {
			return (Employee) super.clone();
		} 
        catch (CloneNotSupportedException e) 
        {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
	public static void main(String[] args) 
    {
		Employee emp = new Employee("Ravi kumar");
		Employee empClone = emp.clone();
		empClone.setName("Rajkumar");
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}
