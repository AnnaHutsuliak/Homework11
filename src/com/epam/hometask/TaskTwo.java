package com.epam.hometask;

import java.util.HashMap;
import java.util.Map;

public class TaskTwo {
    public static void main(String[] args) {
        dictionary();
        addWord();
        addNewWord("blue", "голубий");
        addNewWord("red", "червоний");
    }

    public static void addNewWord(String english, String ukrainian) {
        HashMap<String, String> translated = new HashMap<>();
        translated.put(english, ukrainian);
        System.out.println(translated);
    }

    static void dictionary() {
        HashMap<String, String> translated = new HashMap<>();
        translated.put("one", "oдин");
        translated.put("two", "два");
        translated.put("white", "білий");
        translated.put("black", "чорний");
        for (Map.Entry<String, String> entry : translated.entrySet()) {
            System.out.println((entry.getKey() + "   " + entry.getValue()));
        }
    }

    public static void addWord() {
        String keyValue = "green  зелений";
        System.out.println(keyValue);
    }
}
