package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {

		// GRAVANDO INFORMAÇÕES EM ARQUIVOS <<<<<<<<<<<

		// vetor de strings iniciando com 3 valores
		String[] lines = new String[] { "Good morning", "Good aftenoon", "Good night" };

		String path = "C:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // o parametro true é para o processo
																					// não excluir o arq anterior e sim,
																					// apenas escrever mais

			// para cada String line no meu vetor lines, chamo bw.write(line) e escrevo a
			// linha no meu arq.
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); // para dar quebra de linha
			}

		} catch (IOException e) { // para erros de escrita do arq
			e.printStackTrace(); // erro raiz
		}
	}

}
