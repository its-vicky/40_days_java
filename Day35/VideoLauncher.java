package Project2;
import java.util.Scanner;
public class VideoLauncher 
{
	public static void main(String[] args)
	{
		Scanner vc=new Scanner(System.in);
		int input = 0;
		VideoStore vStore=new VideoStore(null);
		
		while(true)
		{
			System.out.println("MAIN MENU");
			System.out.println("==========");
			System.out.println("\n1.Add Video:"+"\n"+"2.Check Out Video: "+"\n"+"3.Return Video:"+"\n"+"4.Receive Rating:"+"\n"+"5.List Inventory:"+"\n"+"6.Exit:");
			System.out.print("Enter Your Choice(1...6): ");
			if(input==6)
			{
				System.out.println("Exiting..!!Thanks for using this application.");
				System.exit(0);
			}
			String name;
			input=vc.nextInt();
			vc.nextLine();
		switch(input)
		{
		case 1: System.out.print("Enter the name of the video you want ot add: ");
			name=vc.nextLine();
			vStore.addVideo(name);
			System.out.println("Video\""+name+"\"added successfully.");
			break;
		case 2:System.out.print("Enter the name of the video you want to checkout: ");
			name=vc.nextLine();
				vStore.doCheckout(name);
				System.out.println("Video\""+name+"\"checked out successfully");
			break;
		case 3:System.out.print("Enter the name of the video you want to return: ");
			name=vc.nextLine();
				vStore.doReturn(name);
				System.out.println("Video\""+name+"\"returned successfully");
			break;
		case 4:System.out.print("Enter the name of the given video to assign rating: ");
			name=vc.next();
				System.out.print("Enter the rating for this video: ");
				int rating=vc.nextInt();
				vStore.receiveRating(name, rating);
				System.out.println("Rating\""+rating+"\" has been mapped to the Video \""+name+"\" ");
			break;
		case 5: 
			vStore.listInventory();
			break;
			default:System.out.println("Entered Invalid Choice.\nExiting..!! Thanks for using the Application..");
			break;
		}
	}
}

}
