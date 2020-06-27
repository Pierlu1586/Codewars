/*
Messi goals function
Messi is a soccer player with goals in three leagues:
LaLiga
Copa del Rey
Champions
Complete the function to return his total number of goals in all three leagues.
Note: the input will always be valid.
For example:
5, 10, 2  -->  17
 */

package it.jdk.codewars;

/**
 *
 * @author Pierluigi Mastroianni
 */

public class GrasshopperMessiGoalsFunction {

    public static void main(String[] args) {
        int laLigaGoals = 5;
        int copaDelReyGoals = 3;
        int championsLeagueGoals = 2;
        System.out.println(goals(laLigaGoals, copaDelReyGoals, championsLeagueGoals));
    }

    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        int tot = laLigaGoals + copaDelReyGoals + championsLeagueGoals;
        return tot;
    }

}
