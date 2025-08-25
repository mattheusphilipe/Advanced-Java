package Threads;
public class ThreadsBasics 
{
        // principalmente para otimizações e perfomance.
        // Vantagens de Threads é evitar longa espera em operações bloqueantes com I/O, operações que utilizem interfaces gráficas
        // E, também tarefas independentes onde uma tarefa não precisa esperar por outra para ser executada.
        // Threads: execução simultãneas nos cores do processador.
        public static void main(String... args)
        {
            System.out.println("\n Aqui");
            System.out.println(Thread.activeCount());

            Thread thread1 = new Thread(
                new PrintTask("Task 1"),
                "TF1"
            );

            Thread thread2 = new Thread(
                () -> System.out.println(
                    Thread.currentThread().getName()
                )
            );

            thread1.start();
            thread2.start(); // termina execução primeiro pois, leva menos tempo para ser executada embora começou depoisda primeira

        } 
}