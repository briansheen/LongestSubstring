package com.example;

public class Main {

    public static void main(String[] args) {
	    String s = "abcabcabbc";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s){
        String substring = "";
        String substringHolder = "";
        for(int i = 0; i < s.length(); ++i){
            char theChar = s.charAt(i);
            if(!substring.contains(String.valueOf(theChar))){
                substring += String.valueOf(theChar);
            } else {
                if(substring.length() > substringHolder.length()){
                    substringHolder = substring;
                }
                substring = substring.substring(substring.indexOf(theChar)+1,substring.length())+theChar;
            }
        }
        if(substring.length()>substringHolder.length()){
            return substring.length();
        }
        return substringHolder.length();
    }
}
