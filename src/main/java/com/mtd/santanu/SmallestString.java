package com.mtd.santanu;

public class SmallestString {
    public static String solution(String S) {
        // Initialize the smallest string with the string without the first character
        String smallestString = S.substring(1);
        
        // Iterate over the string and remove each character one by one
        for (int i = 0; i < S.length(); i++) {
            // Form a new string by skipping the character at index i
            String newString = S.substring(0, i) + S.substring(i + 1);
            
            // Compare lexicographically to find the smallest string
            if (newString.compareTo(smallestString) < 0) {
                smallestString = newString;
            }
        }
        
        return smallestString;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(solution("acb")); // Expected: "ab"
        System.out.println(solution("hot")); // Expected: "ho"
        System.out.println(solution("codility")); // Expected: "odility"
        System.out.println(solution("aaa")); // Expected: "aa"
    }
}
