import java.io.IOException;
import java.util.Scanner;

public class Menu {
	
	public void MainMenu() throws IOException {
		
		try {
		System.out.println("\n******Main MENU******");
		System.out.println("1. List of files");
		System.out.println("2. User Operations");
		System.out.println("3. Close");
	
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		switch (n)
		{
			case 1: FileOperations.ListFiles(); MainMenu(); ;
			break;

			case 2: UserOperMenu();
			break;
	
			case 3: System.out.println("Application Closed..."); cls(); break;
			default: System.out.println("Enter a valid option\n"); MainMenu(); break;
		}
	} catch (Exception e) {
		System.out.println("Enter a valid option");
		MainMenu();
	}
	}
		
	
	public void UserOperMenu() throws IOException
	{
		
		System.out.println("1. Add a file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search a file");
		System.out.println("4. Main Menu");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		switch (n)
		{
		case 1: FileOperations.AddFile(); UserOperMenu(); break;

		case 2: FileOperations.DeleteFile(); UserOperMenu(); break;

		case 3: FileOperations.SearchFile(); UserOperMenu(); break;
		
		case 4: MainMenu();
		break;
		default: System.out.println("Enter a valid option\n" ); UserOperMenu(); break;
		}
	}
		
	
	
	
	//clear console for closing the application
	public static void cls()
	{	
		try {
			
			new ProcessBuilder("cmd", "cls", "/c").inheritIO().start().waitFor();
		}catch (Exception E)
		{
			System.out.println(E);
		}
	}
}
