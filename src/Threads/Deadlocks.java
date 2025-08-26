package Threads;
public class Deadlocks 
{
    public static Object colher = new Object();
    public static Object vasilha = new Object();   
    public static void main(String... args)
    {
    // Deadlocks é um comportamento de execução e espera infinita a um recurso que nunca será liberado.
    // Neste cenário temos um Thread esperando um recurso que nunca será liberado. 
    // Que é um dos cozinheiros sempre estarão a espera do utensílio que o outro está em posse e com isso nnehum dos ddois fica com os dois e nunca encerram. 

    // public static void main(String... args)
    // {
    //     Thread cozinheiro1 = new Thread(
    //         () -> {
    //             synchronized (colher) {
    //                 System.out.println("c1: Segurando a colher...");
    //                 System.out.println("c1: Esperando a vasilha...");

    //                 synchronized (vasilha) {
    //                     System.out.println("segurando a colher e a vasilha.");
    //                 }
    //             }
    //         }
    //     );

        // Sempre evitar um bloco de execução synchornized (aninhado) dentro do outro. Pois estes blocos fechan o acesso a recursos
        // Só que nest exemplo não faz diferença

        // Thread cozinheiro2 = new Thread(
        //     () -> {
                
        //         synchronized (vasilha) {
        //             System.out.println("c2: Segurando a vasilha...");
        //             System.out.println("c2: Esperando a colher...");
                    
        //             synchronized (colher) { 
        //                 System.out.println("c2: segurando a colher e a vasilha."); 
        //             }
        //         }
        //     }
        // );

    // Para resolver:

        Thread cozinheiro1 = new Thread(
            () -> {
                synchronized (colher) {
                    System.out.println("c1: Segurando a colher...");
                    System.out.println("c1: Esperando a vasilha...");

                    synchronized (vasilha) {
                        System.out.println("segurando a colher e a vasilha.");
                    }
                }
            }
        );

    // Só alterar a ordem de consumo do segundo cozinheiro, para que ele fique esperando a colher e a vasilha quando o
    // cozinheiro 1 liberar os recursos.
        Thread cozinheiro2 = new Thread(
            () -> {
                
                synchronized (colher) {
                    System.out.println("c2: Segurando a vasilha...");
                    System.out.println("c2: Esperando a colher...");
                    
                    synchronized (vasilha) { 
                        System.out.println("c2: segurando a colher e a vasilha."); 
                    }
                }
            }
        );



        cozinheiro1.start();
        cozinheiro2.start();


        // Sempre que trabalhar com threads, tenha cuidado com os deadlocks, considere os blocos sincronizados
        // que o seu programa definiiu e analisa se o recurso sincronizado será de fato liberado em algum momento.
    }
}
