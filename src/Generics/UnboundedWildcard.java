package Generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard 
{
    
    private static void printList(List<?> list) 
    {
        System.out.println(list);
    }

    public static void main(String... args) 
    {
        List<Integer> integers = Arrays.asList(1,2,3);
        List<Double> doubles = List.of(1.1, 2.2, 3.3);

        //Aceita qualquer coisa!

        printList(doubles);
        printList(integers);
    }
}
