/*
You will be given an array a and a value x. 
All you need to do is check whether the provided array contains the value.
Array can contain numbers or strings. X can be either.
Return true if the array contains the value, false if not.
 */

package it.jdk.codewars;

/**
 *
 * @author Pierluigi Mastroianni
 */

public class YouOnlyNeedOne {
    public static void main(String[] args){
        Object[] obj ={"what", "a", "great", "kata"};
        Object value= "kat";
        check(obj, value);
    }
    
    public static boolean check(Object[] a, Object x){
        boolean result = false;
        int n;
        for(n=0;n<a.length;n++){
            String element = a[n].toString();
            String value = x.toString();
            CharSequence cs = value;
            if(element.contains(cs) & element.equals(cs)){
                result=true;
            }
        }
        System.out.println(result);
        return result;
    }
    
}
