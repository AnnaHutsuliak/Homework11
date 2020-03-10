package com.epam.hometask;

import java.util.*;

public class TaskOne {
    public static void main(String[] arg) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Integer((int) (Math.random() * 100) + 100));
        }
        Set<Integer> set = new HashSet();
        set.addAll(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(set);
    }
}