/*

---------
Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables

Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables
In the main method, create a book object and print all details of the book (including the author details)
----------

*/

class Author 
{
	private String name, email;
	private char gender;
	
	Author(String name, String email, char gender)
    {
		this.name = name;
		this.email = email;
		this.gender = gender;
		
	}
	
	public String toString() 
    {
		return "Author [Name: " + name + ", Email: " + email + ", Gender: " + gender + "]";
	}

}
class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	Book(String n, Author a, double p, int q)
    {
		this.name = n;
		this.author = a;
		this.price = p;
		this.qtyInStock = q;
	}

	public String getName() 
    {
		return name;
	}


	public Author getAuthor() 
    {
		return author;
	}

	public double getPrice() 
    {
		return price;
	}

	public void setPrice(double price) 
    {
		this.price = price;
	}

	public int getQtyInStock() 
    {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock)
     {
		this.qtyInStock = qtyInStock;
	}
   
	public String toString() {
		return "Book Name: " + name + ", Author: " + author + ", Price: " + price + ", QtyInStock: " + qtyInStock;
	}

}

public class Prg1 {

	public static void main(String[] args) {
		Author author = new Author("Rajesh", "rajesh561@gmail.com", 'M');
		Book book = new Book("Java programming language", author, 2005.0, 700);
		System.out.println(book);
	}

}

