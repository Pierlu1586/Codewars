//Write a function which converts the input string to uppercase.

package it.jdk.codewars;

/**
 *
 * @author Pierluigi Mastroianni
 */

public class MakeUpperCase {

    public static void main(String[] args) {
        String lowerCaseWord = "casa";
        System.out.println(MakeUpperCase(lowerCaseWord));
    }

    public static String MakeUpperCase(String str) {
        return str.toUpperCase();
    }

}
