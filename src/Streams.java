import java.util.ArrayList;

public class Streams {
    
    // Paralelismo: capacidade de executar múltiplas tarefas simultaneamento em vários processadores.
    

    // Sem paralelismo
     public static void main(String... params) throws Exception{
        ArrayList<Object> livros = new ArrayList<>();

        // sempre deveolverá na mesma ordem sequencial
        livros
        .stream()
        .filter(livro -> livro.toString().toLowerCase().contains("a") || livro.toString().toLowerCase().contains("o")) // métodos eager
        .forEach(System.out::println);  // métodos consumo


        // Com paralelismo
        // Não obedece a ordem, resultado de ordem variável.
        // Ordem não é previsível pois está sendo executado
        // em uma Thread separada usando core do processador do hardware.
        livros
        .parallelStream()
        .filter(livro -> livro.toString().toLowerCase().contains("a") || livro.toString().toLowerCase().contains("o"))
        .forEach(System.out::println);
    }


}

