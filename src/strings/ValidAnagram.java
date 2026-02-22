package strings;

import java.util.Arrays;

public class ValidAnagram {

    /*
        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    */

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length())
            return false;

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        String s1 = new String(a1);
        String s2 = new String(a2);

        System.out.println(a1);
        System.out.println(a2);


        return s1.equals(s2);

    }



}
