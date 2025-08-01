
// contrário do UppwerBoundedWildcard

import java.util.Arrays;
import java.util.List;


public class LowerBoundedWildCard {

    // defino super classes de uma subclasse
    // quem for super classe de Integer, irei ceitar no meu método.
    public static void printOnlyIntegerOrSuperClass(
        List<? super Integer> list
    ) {
        System.out.println(list);
    }

    public static void main(String... args)
    {
        List<Integer> integers = Arrays.asList(4, 5, 6 ,7);
        List<Number> numbers = List.of(4.9, 5.0, 6, 7);

        // Aceita lista de inteiros ou da superclasse!
        printOnlyIntegerOrSuperClass(integers);
        printOnlyIntegerOrSuperClass(numbers);

        //Não aceita Double!
        List<Double> doubles = List.of(1.0, 2.0);
        //printOnlyIntegerOrSuperClass(doubles);

    }
}
