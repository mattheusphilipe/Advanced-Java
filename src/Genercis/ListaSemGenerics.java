import java.util.ArrayList;
import java.util.List;

class Lista<T>
{
    // Object é um tipo mais genérico
    // private List<Object> lista = new ArrayList<>();

    //trocar para o tipo <T> estritamente genérico

    private List<T> lista = new ArrayList<>();


    // public void adicionar(Object elemento)
     public void adicionar(T elemento)
    {
        lista.add(elemento);
    
    }

    // public Object obter(int indice) 
    public T obter(int indice) 
    {
        return lista.get(indice);
    }

}

public class ListaSemGenerics 
{


    public static void main(String[] args) 
    {
            //Exemplo sem o uso de generics

    Lista<Integer> numeros = new Lista<>();
    numeros.adicionar(1);
    numeros.adicionar(2);

    Lista<String> textos = new Lista<>();

    textos.adicionar("hello");
    textos.adicionar("World!");


    int numero = (int) numeros.obter(0);

        System.out.println("\n \n " + numero); // Okay, pois o tipo é int

        // String texto = (String) numeros.obter(0); // ClassCastException

         String texto = (String) textos.obter(1); 

        System.out.println("\n \n" + texto);
    }
}