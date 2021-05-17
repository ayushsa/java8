package lambda.two;

import java.util.Arrays;

public class Test {

    public static void main(String[] args)
    {
        Interf i = (s)-> s.length();

        System.out.println(i.getLength("Hello"));
    }

}
