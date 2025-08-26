import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReading 
{
    public static void main(String... args)
    {
        File arquivo = new File("src/vivaldi-links.txt");

        try 
        {
            // Muito interessante para leitura de arquivos e cenários multi-thread.
            BufferedReader leitor  = new BufferedReader(new FileReader(arquivo));

            String linha;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }    
}
