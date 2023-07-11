package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int size = sourceList.size()-1; size >= 0; size--) {
            if (sourceList.get(size) % 2 == 1){
                linkedList.add(sourceList.get(size));
            }
        }
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0){
                linkedList.add(sourceList.get(i));
            }
        }
        return linkedList;
    }
}
