package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String words[] = s.split(" ");

        int lastWord = words.length-1;

        System.out.println(words[lastWord]);


        return words[lastWord].length();

    }

}
