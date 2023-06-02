package Project2HW;

import java.util.Arrays;

public class Anagrams {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
     */

    static String isAnagram(String str1, String str2){
      str1= str1.replaceAll("\\s","").toLowerCase();
       str2=str2.replaceAll("\\s","").toLowerCase();

       char[] first=str1.toCharArray();
       char[] second=str2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        boolean anagram = Arrays.equals(first,second);
        String res=(anagram) ? "Are anagrams" : "Are not anagrams";
        return res;
    }
    public static void main(String[] args) {
      String str1="Dormitory ";
      String str2="dirty room";
      String result=isAnagram(str1,str2);
        System.out.println(result);
    }
}
