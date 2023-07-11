package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        for (String s : sourceList) {
            i++;
            if (i%3 == 0) {
                list.add(s);
                list.add(s);
            }
        }
        return list;
    }
}
