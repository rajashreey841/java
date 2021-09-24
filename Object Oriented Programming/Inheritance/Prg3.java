/*

--------
Create a school application with a class called Person. Create name and dateOfBirth as member variables.
Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.
Create a class called Student that inherits from Person class. This class will have a member variable called studentId. 
Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.
Create objects of each of this classes, invoke and test the methods that are available in these classes.
---------

*/

class Person 
{
    String name, dateOfBirth;
    
    Person(String name, String dateOfBirth) 
    {
    	this.name = name;
    	this.dateOfBirth = dateOfBirth;
    }
    
}

class Teacher extends Person 
{
	double salary;
    String subject;

    Teacher(String name, String dateOfBirth, String subject, double salary) 
    {
    	super(name, dateOfBirth);
        this.subject = subject;
        this.salary = salary;
    }
    void display() 
    {
        System.out.println("Teacher ->" + " Name: " + name + ", Date of Birth: " + dateOfBirth + ", Subject: " + subject + ", Salary: " + salary);
    }
    
}

class Student extends Person 
{
	int studentId;
	
    Student(String name, String dateOfBirth, int studentId) 
    {
    	super(name, dateOfBirth);
    	this.studentId = studentId;
	}

}

class CollegeStudent extends Student 
{
	String collegeName;
	String year;

    CollegeStudent(String name, String dateOfBirth, int studentId, String year, String CollegeName) 
    {
    	super(name, dateOfBirth, studentId);
        this.year = year;
        this.collegeName = CollegeName;
    }
    
    void display() 
    {
        System.out.println("Student ->" + " Name: " + name + ", Date of Birth: " + dateOfBirth + ", Student ID: " + studentId + ", Year: " + year + ", College: " + collegeName);
    }

}

public class Prg3 
{

	public static void main(String[] args) 
    {
		Teacher teacher = new Teacher(" Prof.shilpa","18/01/1980", "Java", 65000);
		CollegeStudent collegeStudent = new CollegeStudent("Swapna","12/04/1999", 117067, "Fourth", "Vemana Institute of Technology ");
		teacher.display();
		collegeStudent.display();
	}

}



