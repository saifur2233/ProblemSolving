
package problem02;

/**
 *
 * @author Saifur Rahman
 */
import java.util.*;
public class RomanMain {

    int RomanValueCheck(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
 

    int romanToDecimal(String str)
    {
        int result = 0;
 
        for (int i = 0; i < str.length(); i++)
        {
            int str1 = RomanValueCheck(str.charAt(i));
            if (i + 1 < str.length())
            {
                int str2 = RomanValueCheck(str.charAt(i + 1));

                if (str1 >= str2)
                {
                    result = result + str1;
                }
                else
                {
                    result = result + str2 - str1;
                    i++;
                }
            }
            else {
                result = result + str1;
            }
        }
 
        return result;
    }
 
    public static void main(String args[])
    {
        RomanMain ob = new RomanMain();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Roman character: ");
        String input = in.nextLine();

        String str = input;
        System.out.println("Integer to Roman Convert is: "+ ob.romanToDecimal(str));
    }
}
