package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		// variavel File recebendo o caminho digitado (File pode ser caminho de um pasta ou apenas de um arquivo)
		File path = new File(strPath);
		
		System.out.println();
		// vetor para filtrar apenas quem for diretorio(pasta) no caminho 
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// vetor para filtrar apenas quem for files no caminho 
		System.out.println("-----------------------------");
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		// irá criar uma subpasta chamada subdir a partir do caminho strPath
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfully: " + success);
		sc.close();

	}

}
