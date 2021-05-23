package leetcode;

public class Leetcode
{

   // https://leetcode.com/problems/maximum-subarray/
   // https://leetcode.com/problems/maximum-subarray/discuss/1213155/Java-0-ms-faster-than-100.00

    // Nagarrow
    // Q-1. Java Style Variable To C and C style Variable to Java Convert

    public static void main(String[] args)
    {
        // 1
        javaToCToJava("this_is_a_variable");
        javaToCToJava("thisIsAVariable");

        //2
        // https://www.geeksforgeeks.org/majority-element/
        int arr[] = { 5, 1, 2, 5, 5, 5, 1 };
        int n = arr.length;
        // Function calling
        findMajority(arr, n);

        //3 Print the frequency of each character in Alphabetical order
        String s = "geeksforgeeks";
        compressString(s);
    }

    private static void compressString(String s)
    {
        // To store the frequency
        // of the characters
        int freq[] = new int[26] ;

        // Update the frequency array
        for (int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
        }

        // Print the frequency in alphatecial order
        for (int i = 0; i < 26; i++)
        {
            // If the current alphabet doesn't
            // appear in the string
            if (freq[i] == 0)
                continue;

            System.out.print((char)(i + 'a') +""+ freq[i]);
        }
    }

    private static void findMajority(int[] arr, int n)
    {
        int maxCount = 0;
        int index = -1;

        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for (int j = 0; j < n; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }

            // update maxCount if count of
            // current element is greater
            if (count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
        {
            System.out.println(arr[index]);
        }
        else
        {
            System.out.println("No Majority Element");
        }
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
