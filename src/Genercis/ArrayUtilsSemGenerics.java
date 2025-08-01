public class ArrayUtilsSemGenerics 
{
    //Quando método é estático ele tem que levar a declaração quando for genérico
    public static<T> T getElemento(T[] array, int index) 
    {
        if (index >= array.length || index < 0) { return null; }
        return array[index];
    }

    public static void main (String[] args) 
    {
        //Vetores de Object
        Integer[] integers = {1, 2, 3};
        String[] strings = {"text 1", "text 2", "text 3"};


        Integer primeiroObjeto = getElemento(integers, 0);
        System.out.println("\n \n primeiroObjeto: " + primeiroObjeto);
        
        // tentativa de armazenar o resultado em uma String (ClassCastException)
        // neste caso como estamos tipando String invés de Object, não é necessário declarar o Casting
        String primeiraString = getElemento(strings, 0);

        System.out.println("\n \n " + primeiraString);
          
    }
}