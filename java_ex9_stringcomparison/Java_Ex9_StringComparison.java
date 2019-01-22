/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #9
 * Section 1.5.3, “String Comparison” (page 25) has an example of 
 * two strings s and t so that s.equals(t) but s != t. 
 * Come up with a different example that doesn’t use substring).
 */
package java_ex9_stringcomparison;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Java_Ex9_StringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = scan.next();
        System.out.print("Enter 2nd string: ");
        String str2 = scan.next();
        // Comparison of strings
        if(str1.equals(str2))System.out.println("Equal strings");
        else System.out.println("Different strings");
    }
    
}
