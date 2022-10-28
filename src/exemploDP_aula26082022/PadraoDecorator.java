package exemploDP_aula26082022;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class PadraoDecorator {

	public static void main(String[] args) throws Exception {

	// FileInputStream é representado como Decorator pela variável "fs" e BufferedReader
	// pela variável "br", em seguida sobrecarregamos o segundo decorator com o primeiro
	// em seu parâmetro, sinalizando que BufferedReader deve ler o arquivo recebido pelo
	// sistema através de FileInputStream.
		FileInputStream fIS = new FileInputStream(
				"C:\\Users\\Remakker\\Documents\\Repositórios\\exemplosJavaWebIntermediario\\exemplosJavaDesignPattern\\teste-input.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fIS));
		String s;

		while ((s = br.readLine()) != null)
			System.out.println(s);
		fIS.close();
	}

	// fIS = fileInputStream.
	
}