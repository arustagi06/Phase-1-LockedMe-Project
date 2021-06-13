import java.io.IOException;

public class Driver {
	public static String root = "C:\\Users\\amitr_000\\eclipse-workspace\\Project\\files";;

	public static void main(String[] args) throws IOException {
				
		//Scanner s = new Scanner(System.in);
		System.out.println("Welcome to LockedMe");
		System.out.println("Developer: Amit Rustagi");
		System.out.println("Version name 1.0");
		
		Menu m = new Menu();
		m.MainMenu();
		
		
	}
}
