import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperations {
	
	public static void ListFiles() throws IOException {	   
		      
		
			File file = new File(Driver.root);
		
			File[] files = file.listFiles();
			
			Arrays.sort(files);
			
			for (File eachFile : files)
				System.out.println(eachFile.getName());
			}

		
	public static void AddFile() throws IOException {
		
		System.out.println("Enter a file to be created \n");
		Scanner s = new Scanner(System.in);
		String filename = s.nextLine();
		File file = new File(Driver.root, filename);
		
		if (file.createNewFile())
			System.out.println("File created \n");
		else
			System.out.println("File not created");
	}

	public static void DeleteFile() throws IOException {
		
		System.out.println("Enter a file to be deleted \n");
		Scanner s = new Scanner(System.in);
		String filename = s.nextLine();
		File file = new File(Driver.root, filename);
		
		if (file.delete())
			System.out.println("File deleted \n");
		else
			System.out.println("File doesn't exist");
	}

	public static void SearchFile() throws IOException {
		
		System.out.println("Enter a file to be Searched \n");
		Scanner s = new Scanner(System.in);
		String filename = s.nextLine();
		File file = new File(Driver.root, filename);
		
		if (file.exists())
			System.out.println("File exist \n");
		else
			System.out.println("File doesn't exist \n");
	}
}
