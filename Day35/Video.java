package Project2;

public class Video 
{
	String videoName;
	boolean checkout;
	int rating;
	Video(String name)
	{
		this.videoName=name;
	}
	String getName()
	{
		return this.videoName;
	}
	void doCheckout()
	{
		this.checkout=true;
	}
	void doReturn()
	{
		this.checkout=false;
	}
	void receiveRating(int rating)
	{
		this.rating=rating;
	}
	int getRating()
	{
		return this.rating;
	}
	boolean getCheckout()
	{
		return this.checkout;
	}
}
