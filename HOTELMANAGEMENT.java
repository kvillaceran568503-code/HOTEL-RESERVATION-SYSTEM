package HOTELMANAGEMENT;
import java.util.Scanner;
	
public class HOTELMANAGEMENT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int hotel[][] = new int[7][5];
		int choice;
		
		
			while(true) {
				System.out.println("\n===HOTEL RESERVATION SYSTEM===");
				System.out.println("1. View Rooms");
				System.out.println("2. Check In");
				System.out.println("3. Check Out");
				System.out.println("4. Exit");
				System.out.println();
				System.out.print("Enter choice: ");
				choice=sc.nextInt();
				
				if (choice==1) {
					for (int i=6; i>=0; i--) {
						System.out.print("Floor "+(i+1)+ ": ");
						for (int j=0; j<5; j++) {
							System.out.print("[ "+hotel[i][j] + "]");	
						}
						System.out.println();
					}
					
				} else if(choice==2) {
					System.out.print("Enter Floor (1-7): ");
					int floor =sc.nextInt() - 1;
					
					System.out.print("Enter room (1-5): ");
					int room=sc.nextInt() - 1;
					
					if(hotel[floor][room]==0) {
						hotel[floor][room]=1;
						System.out.println("Check-in succesful!");
					} else {
						System.out.println("Room already occupied!");
					}
					
				} else if(choice==3) {
					System.out.print("Enter Floor (1-7): ");
					int floor =sc.nextInt() - 1;
					
					System.out.print("Enter Floor (1-5): ");
					int room=sc.nextInt() - 1;
					
					if(hotel[floor][room]==1) {
						hotel[floor][room]=0;
						System.out.println("Check-out succesful!");
					} else {
						System.out.println("Room already empty!");
					} 
					
				} else if(choice ==4) {
					System.out.println("Exiting system...");
					break;
				} else { 
					System.out.println("Invalid choice!");
				}
			}
			sc.close();
	}
}
