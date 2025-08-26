import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResources 
{
       public static void main(String... args)
        {

            // try () {} é o Try With Resources
            // ao invés de fazer o fechamento dos recursos com método close manualmente
            // Agora o próprio compílador vai se encarregar de criar as cláusulas de fechamento desses recursos.
        try (
         // Muito interessante para leitura de arquivos e cenários multi-thread.
            BufferedReader leitor  = new BufferedReader(new StringReader("Hello"));

            StringWriter escritor = new StringWriter();
        )
        {
           

            escritor.write(leitor.readLine());
            System.out.println(escritor.toString());
        

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }     
}
