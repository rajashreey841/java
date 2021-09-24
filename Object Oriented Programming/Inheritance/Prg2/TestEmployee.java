/*

-----
Program : 2
-----

*/

public class TestEmployee 
{
    public static void main(String[] args) 
    {
		Employee obj = new Employee("Ravi", 24000000, 2020, "012420201");
		
		System.out.println("Details of Employee:");
		System.out.println("Name: " + obj.getName());
		System.out.println("Year Of Starting: " + obj.getYearOfStart());
		System.out.println("Annual Salary: " + obj.getAnnualSalary());
		System.out.println("Insurance Number: " + obj.getNationalInsuranceNo());
	}
    
}
