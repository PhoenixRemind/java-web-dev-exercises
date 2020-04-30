package org.launchcode.java.studios.studio2;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;


public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two " +
                "terms has to be zero to start with. So if you move all the terms over to one side, you can " +
                "put the quadratics into a form that can be factored allowing that side of the equation to " +
                "equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
        char[] charsInText = quote.toLowerCase().toCharArray();


        for(char i : charsInText) {
            if(!charCounts.containsKey(i)) {
                charCounts.put(i, 1);
            } else {
                int count = charCounts.get(i);
                charCounts.put(i, count+1);
            }
        }
        for(Map.Entry<Character, Integer> count : charCounts.entrySet()) {
            System.out.println((count.getKey() + " : " + count.getValue()));
        }

    }
}
