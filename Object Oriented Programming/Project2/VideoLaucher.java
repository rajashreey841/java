/*

--------
Video Rental Inventory System .
-------

*/

import java.util.*;
public class VideoLaucher 
{
    public static void main(String[] args) 
    {	
		int input = 0;
		Scanner sc = new Scanner(System.in);
		VideoStore videoStore = new VideoStore();

		while(input !=6) 
        {
			System.out.println("\n1. Add Videos : "+"\n"+"2. Check Out Video : "+"\n"+"3. Return Video : "+
					   "\n"+"4. Receive Rating : "+"\n"+"5. List Inventory : "+"\n"+"6. Exit : ");
			System.out.print("Enter Your Choice (1..6) : ");
			
			String name;
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) 
            {
			case 1: 
				System.out.print("Enter the name of video you want to add: ");
				name = sc.nextLine();
				videoStore.addVideo(name);
				System.out.print("video "+ name + " Added successfully.");
				break;
					
			case 2: 
				System.out.print("Enter the name of video you want to check out: ");
				name = sc.nextLine();
				if(videoStore.checkVideo(name) == 0) 
                {
					System.out.print("Video does not exist");
				}
				else 
                {
					videoStore.doCheckout(name);
					System.out.print("video "+ name + " checked out successfully.");
				}
				break;
					
			case 3: 
				System.out.print("Enter the name of video you want to return: ");
				name = sc.nextLine();
				if(videoStore.checkVideo(name) == 0) 
                {
					System.out.print("Video does not exist");
				}
				else 
                {
					videoStore.doReturn(name);
					System.out.print("video "+ name + " Returned successfully.");
				}			
				break;
				
			case 4: 
				System.out.print("Enter the name of video you want to rate: ");
					name = sc.nextLine();
					if(videoStore.checkVideo(name) == 0) 
                    {
						System.out.print("Video does not exist");
					}
					else
                    {
						System.out.print("Enter the Rating for this video: ");
						int rating = sc.nextInt();
						videoStore.receiveRating(name, rating);
						System.out.print("Rating "+rating+" has been mapped to video "+ name +".");
					}
					break;
					
			case 5: 
				videoStore.listInventory();
				break;
				
			default:
				System.out.println("Exiting...!! Thanks for using the application.");
				break;
			}
		}
	}
    
}
