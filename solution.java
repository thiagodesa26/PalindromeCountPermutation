package com.myprojects;

import java.util.*;

class solution
{
    // Recursive function to count chars
    private static int countChars(String w, char currChar, int i) {
        if (i >= w.length()) {
            return 0;
        }
        int result = w.charAt(i) == currChar ? 1 : 0;
        return result + countChars(
                w, currChar, i + 1);
    }
    // Checks for uneven counts of chars
    public static int solution(String S){
        int num = 0;
        HashSet<Character> l = new HashSet<>();
        for(char c: S.toCharArray()){
            l.add(c);
        }
        Iterator<Character> i=l.iterator();
        while(i.hasNext()){
            if((countChars(S, i.next(), 0)%2!=0)){num++;}
        }
        return (num==0?0:num-1);
    }

    public static void main(String args[])
    {
        for (String word : Arrays.asList("AZBA","ervervige", "aaabab", "x","anntya", "civigfc","kayathyk", "lerfsdvel","bgtremadam","moqwertym","nolkjhgfdon")) {
            System.out.println(solution(word));
        }
    }
}
