import java.util.ArrayList;

public class Streams {
    
    

     public static void main(String... params) throws Exception{
        ArrayList<Object> livros = new ArrayList<>();

        livros
        .stream()
        .filter(livro -> livro.toString().toLowerCase().contains("a") || livro.toString().toLowerCase().contains("o")) // métodos eager
        .forEach(System.out::println);  // métodos consumo
    }


}

