import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapStructure 
{
    public static void main(String... args)
    {
        //Criando um HashMap para armazenar as matriculas e nomes
        // Diferente do HashMap aqui eu consigo definir se é para ser seguir a ordem de inserção
        Map<Integer, String> mapaAlunos = new LinkedHashMap<>(
            4, 0.75f, true
        );
        //accessOrder: true - Colocar os elementos em uma forma de acesso mais faciliatada
        // que neste caso significa por eles no final da fila

        //Adicionando pares chave-valor ao mapa
        mapaAlunos.put(104, "joão");
        mapaAlunos.put(102, "Goku");
        mapaAlunos.put(103, "maria");
        mapaAlunos.put(101, "Obama");


        System.out.println(mapaAlunos.get(104)); // para o accessOrder ter efeito, algum item tem que ser acessado

        System.out.println(" \n Alunos: " + mapaAlunos);

        //Iterando sobre o HashMap e exibindo os pares

        for(Map.Entry<Integer, String> entrada : mapaAlunos.entrySet()) 
        {
            int matricula = entrada.getKey();
            String aluno = entrada.getValue();

            System.out.println("\n Matricula: " + matricula + ", Aluno: " + aluno);
        }

        //De acordo com os acessos, eu mudo como os itens são armazenados.
        // Infuenciam muito na perfomance dos programas, na ordem de acesso a alguma recurso.


        //output

        //  Alunos: {102=Goku, 103=maria, 101=Obama, 104=joão}

        //  Matricula: 102, Aluno: Goku

        //  Matricula: 103, Aluno: maria

        //  Matricula: 101, Aluno: Obama

        //  Matricula: 104, Aluno: joão
        
    }
    
}
