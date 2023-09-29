

import java.io.IOException;
public class Principal {

    public static void main(String[] args)throws IOException{
        String path = "C:\\Users\\aluno\\Desktop\\TextoTest.txt";//colocar o diretorio do txt
        String texto =new Scanner(new File("Texto.txt"),"UTF-8").useDelimiter("\\A");
        
        Test.leitor(path);
       // Test.escritor(path);
       
    }
}
