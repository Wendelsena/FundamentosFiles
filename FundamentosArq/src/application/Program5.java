package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		// COMO OBTER INFORMAÇÕES DO CAMINHO DO FILE OU FOLDER	
		
		Scanner sc = new Scanner (System.in);
		
			System.out.print("Enter a file path: ");
			String strPath = sc.nextLine();
			
			File path = new File(strPath);
			
			System.out.println("getName: " + path.getName() + " --- Apenas o nome do folder/file");
			System.out.println("getParent: " + path.getParent() + " --- Caminho sem o nome do folder/file");
			System.out.println("getPath: " + path.getPath() + " --- Caminho completo");
			
		sc.close();
		

	}

}
