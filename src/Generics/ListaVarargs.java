package Genercis;
import java.util.ArrayList;
import java.util.List;

class TodoListSWA 
{
    List<String> todoList = new ArrayList<>();

    public void adicionar(String... tarefas)
    {
        for(String tarefa : tarefas)
         {
            todoList.add(tarefa);
         }
    } 

    //Antes tinha que fazer sobrecarga de método para aceitar diferente tipos de argumentos

    // public void adicionar(String tarefa)
    // {
    //     for(String tarefa : tarefas)
    //      {
    //         todoList.add(tarefa);
    //      }
    // } 

    // public void adicionar(String tarefa, String tarefa2)
    // {
    //     for(String tarefa : tarefas)
    //      {
    //         todoList.add(tarefa);
    //      }
    // } 
}


public class ListaVarargs 
{
    public static void main(String[] args) 
    {

        TodoListSWA exemplo = new TodoListSWA();

        exemplo.adicionar("\\n" + //
                        " \\n" + //
                        "estudar Java");
        exemplo.adicionar("\\n" + //
                        " \\n" + //
                        "Estudar Java", "Tomar café");
        exemplo.adicionar(new String[] { "Jerffs", "jerffs2" });

    }
}
