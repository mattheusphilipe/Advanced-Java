import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class Animal 
{
    public String infoAnimalString(String especieAnimal) 
    {
        return "Eu sou um " + especieAnimal;
    };
}

class Gato extends Animal
{

    @Override
    public String toString() 
    {
      
        return super.infoAnimalString("Gato");
    }

}

class Cachorro extends Animal 
{

    @Override
    public String toString() 
    {
        return super.infoAnimalString("Cachorro");
    }
}

public class GenericsSemWildCards
{
    //Deste jeito não aceita Gato ou Cachorro, só animal
    // public static void imprimirListaAnimais(List<Animal> animais) 
    public static void imprimirListaAnimais(List<? extends Animal> animais) 
    {
        for (Animal animal : animais) 
        {
            System.out.println(animal);
        }
    }

    public static void main(String... args) 
    {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        // Lista de animais
        List<Animal> lista = List.of(gato, cachorro);
        System.out.println("\n imprimindo lista de animais: \n");
        imprimirListaAnimais(lista);

        //Lista de gatos
        List<Gato> listaGatos = List.of(new Gato(), new Gato());
        System.out.println("\n lista de gatos: \n");

        // Não aceita Gato, só animal
        imprimirListaAnimais(listaGatos);
    }
    
}
