
/*

--------
Tech Module : 2.
Project 1: Video Rental Inventory System.
--------

*/


public class Video
{
    public String videoName;
    public boolean checkout;
    public int rating;
    String getName() 
    {
		return videoName;
	}
	
	void doCheckout() 
    {
		checkout = true;
	}
	
	void doReturn() 
    {
		checkout = false;
	}
	
	void receiveRating(int rating) 
    {
		this.rating = rating;
	}
	
	int getRating() 
    {
		return rating;
	}
	
	boolean getCheckout() 
    {
		return checkout;
	}

    Video(String name)
    {
        videoName=name;

    }
}
