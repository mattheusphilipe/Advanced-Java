public class MethodReference 
{
    public static void main(String... args) 
    {
        String text = "\t \n Olá!!!!";


        // Com Lambda
        // StringProcessor processor = str -> StringUtils.toUpperCase(str);

        //Com method reference

        StringProcessor processor = StringUtils::toUpperCase;

        System.out.println(processor.process(text));
    }
}