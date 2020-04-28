/*
Write a function to convert a name into initials. 
This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
 */

package it.jdk.codewars;

/**
 *
 * @author Pierluigi Mastroianni
 */

public class AbbreviateTwoWords {
    
    public static void main(String[] args){
        String name = "John Doe";
        abbrevName(name);
    }
    
    public static String abbrevName(String name){
        String[] trimAndSplitName = name.trim().split(" ");
        name = trimAndSplitName[0].toUpperCase().charAt(0)
                +"."
                +trimAndSplitName[1].toUpperCase().charAt(0);
        return name;
    }
    
}
