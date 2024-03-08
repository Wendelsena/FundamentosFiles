package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// este objeto vai encapsular todo o processo de acessar o arq e tbm o caminho.
		File file = new File("C:\\Temp\\in.txt"); // para indicar que é um caminho é necessario colocar "\\"
		Scanner sc = null;

		try { // no momento de abrir um arq, pode gerar uma excessão do tipo IO, por isso, é
				// necessario o os blocos TryCatch

			// Scanner recebendo o file como argumento
			sc = new Scanner(file);

			// enquanto existir alguma linha no arq.
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// boa pratica: colocar o fechamento do recurso dentro de um bloco finally (ou
		// seja, o recurso vai ser fechado independemte se tray deu certo ou não
		finally {
			
			// se o scanner for diferente de null, feche. (para evitar o erro nullException)
			if (sc != null) {
				sc.close();
			}
		}
	}

}
