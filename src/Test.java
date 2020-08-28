import java.util.Scanner;

//------------------------------------------------------------------
// Garrett McCue 
// 08/27/20
// SU2-CPSC-501-002
// Programming Fundamentals
// Program 4
//-------------------------------------------------------------------
public class Test {

	public static void main(String[] args) {
		// Assignment header
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Garrett McCue");
		System.out.println("PROGRAMMING ASSIGNMENT 4 - SET \n");

		Scanner scan = new Scanner(System.in);
		Set set = new Set();
		boolean x = true;
		
		// uses switch statement to get the command from the user
		// in order to implement the proper command
		while (x) { // continuous loop
			System.out.print("Enter command: ");
			String[] array = scan.nextLine().split(" ");
			try {
				switch (array[0]) {
				case "add":
					set.add(Integer.valueOf(array[1]));
					System.out.println(set);
					break;

				case "del":
					set.delete(Integer.valueOf(array[1]));
					System.out.println(set);
					break;

				case "exists":
					System.out.println(set.exists(Integer.valueOf(array[1])));
					break;

				default:
					System.out.println("Please enter a valid command... ");

				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number... ");

			}
			
		}
		scan.close();
	}

}
