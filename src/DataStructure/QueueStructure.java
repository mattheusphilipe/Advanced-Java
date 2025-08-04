package DataStructure;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStructure 
{

    public static void main(String... args)
    {
        //Criando uma fila usando LinkedList
        // A LinkedList é uma estrutura do tipo FIFO
        Queue<String> fila = new LinkedList<>(); 

        //Adicionando elementos à fila - add() ou offer()
        fila.offer("Cliente1");
        fila.add("null");
        fila.add("Jerffs");

        System.out.println("\n Clientes na fila" + fila);

        //Removendo e exibindo o elemento da frente - poll()
        String elementoRemovido = fila.poll();
        System.out.println("\n Clientes atendido: " + elementoRemovido);
        System.out.println("\n Clientes na fila após remoção" + fila);

        // Exibindo o elemento da frente da fila sem removê-lo peek()
        String elementoDaFrente = fila.peek();
        System.out.println("\n Clinte da frente da fila: " + elementoDaFrente);
        System.out.println("\n Clientes na fila após remoção" + fila);

    }
    
}
