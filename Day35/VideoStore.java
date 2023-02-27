package Project2;

public class VideoStore extends Video 
{
	VideoStore(String name) 
	{
		super(name);
	}
	Video[] store=new Video[5];
	
	void addVideo(String name)
	{
	int count=0;
	if(count<5)
	{
		store[count++]=new Video(name);
	}
	else
	{
		System.out.println("Video Store is Full..!!");
	}
}
	public void doCheckout(String name)
	{
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}else
			for(Video video:store) {
				if(video!=null) {
					if(video.getName().equals(name))
						video.doCheckout();
				}
			}
	}
	public void doReturn(String name)
	{
		for(Video v:store)
		{
			if(v!=null && v.getName().equals(name))
			{
				v.doReturn();
			}
		}
	}
	void receiveRating(String name,int rating)
	{
		for(Video v:store)
		{
			if(v!=null && v.getName().equals(name))
			{
				v.receiveRating(rating);
			}
		}
	}
	void listInventory()
	{
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}else
			for(Video video:store) {
				if(video!=null) {
					System.out.print("--------------------------------------------------------------------------");
					System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n","Video Name","Checkout Status","Rating");
					System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n",video.getName(),video.getCheckout(),video.getRating());
					System.out.println("--------------------------------------------------------------------------");
				}
			}
	}
}
