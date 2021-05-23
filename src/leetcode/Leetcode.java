package leetcode;

public class Leetcode
{

   // https://leetcode.com/problems/maximum-subarray/
   // https://leetcode.com/problems/maximum-subarray/discuss/1213155/Java-0-ms-faster-than-100.00

    // Nagarrow
    // Q-1. Java Style Variable To C and C style Variable to Java Convert

    public static void main(String[] args)
    {
        javaToCToJava("this_is_a_variable");

        javaToCToJava("thisIsAVariable");
    }

    // input : this_is_a_variable Output: thisIsAVariable using JAVA program
    private static void javaToCToJava(String input)
    {
        String result = "";
        String myInput = input;

        char c[] = myInput.toCharArray();

        for (int i =0 ; i < c.length; i++)
        {
            if (c[i] == '_')
            {
                i++;
                char chr = Character.toUpperCase(c[i]);
                result += chr;
            }
            else if(Character.isUpperCase(c[i]))
            {
                result += "_";
                result += Character.toLowerCase(c[i]);
            }
            else
            {
                result += c[i];
            }
        }
        System.out.println(result);
    }
}
