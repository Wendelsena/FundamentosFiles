package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {

		String path = "C:\\temp\\in.txt";
	
		// esquema basico para le um arquivo com BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // buffer acelerara a leitura do FileReader
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		
		}
	}

}
