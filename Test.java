import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Test {

    public static void leitor(String path) throws IOException {
        int cont = 0;
        try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = buffRead.readLine()) != null) {
                // Normaliza a linha para remover acentos
                linha = removerAcentos(linha);

                // Divide a linha em palavras usando espaços e caracteres de pontuação como delimitadores
                StringTokenizer tokenizer = new StringTokenizer(linha, " \t\n\r\f!\"#$%&'()*+,./:;<=>?@[\\]^_`{|}~");

                // Loop para processar cada palavra
                while (tokenizer.hasMoreTokens()) {
                    String palavra = tokenizer.nextToken();
                    // Remova qualquer outro caractere de pontuação que possa ter sobrado
                    palavra = palavra.replaceAll("[^a-zA-Z0-9]", "");
                    // Imprima a palavra resultante
                    cont++;
                    System.out.print(palavra + " ");
                    
                    
                }
            }
            System.out.println();
            System.out.println(cont + " Palavras");
        }
        
    }
    
    

    // Função para remover acentos de uma string
    public static String removerAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD)
            .replaceAll("[^\\p{ASCII}]", "");
    }
    
    
    public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

    
}


   
