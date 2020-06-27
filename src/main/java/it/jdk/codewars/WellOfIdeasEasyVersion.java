/*
For every good kata idea there seem to be quite a few bad ones!
In this kata you need to check the provided array (x) for good ideas 'good' 
and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', 
if there are more than 2 return 'I smell a series!'. If there are no good ideas, 
as is often the case, return 'Fail!'.
 */

package it.jdk.codewars;

/**
 *
 * @author Pierluigi Mastroianni
 */

public class WellOfIdeasEasyVersion {

    public static void main(String[] args) {
        String[] array = {"good"};
        System.out.println(well(array));
    }

    public static String well(String[] x) {
        String response;
        int i;
        int g = 0;
        for (i = 0; i < x.length; i++) {
            if (x[i].equals("good")) {
                g += 1;
            }
        }
        if (g == 1 || g == 2) {
            response = "Publish!";
        } else if (g > 2) {
            response = "I smell a series!";
        } else {
            response = "Fail!";
        }
        return response;
    }

}
