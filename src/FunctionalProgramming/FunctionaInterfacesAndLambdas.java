package FunctionalProgramming;
public class FunctionaInterfacesAndLambdas 
{
    public static void main(String... args) 
    {

        // Inner Class
        // var saudacao = new Salute() {

        //     @Override
        //     public void saudar(String nome) {
                
        //         System.out.println("Olá: " + nome);
        //     }
            
        // };

        //Os lambdas vieram para abstrair as interfaces de InnerClass
        // para uma forma menos verbosa

        Salute saudacao = (String nome) -> {
            System.out.println("\n \t Olá: " + nome);
        };


        saudacao.saudar("Felipe");

        Imprimir imprimindo = () -> {
            System.out.println("\n \t Impressão iniciada! ");
        };

        imprimindo.impressao();
    }
}