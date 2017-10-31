package com.ltse.tools;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class TodoList {
    private HashMap<String, Collection<Item>> list = new HashMap<String, Collection<Item>>();


    void insertItem(Item item) {
        String date = item.getDate();
        list.get(date).add(item);
    }

    Collection<Item> getListForDate(String date) {
        return list.get(date);
    }

    String getAllContentsForDate(String date) {
        String contents = "";
        for (Iterator iterator = getListForDate(date).iterator(); iterator.hasNext();) {
            Item item = (Item) iterator.next();
            contents += Integer.toString(item.getId()) + ": " + item.getContent() + ";";
        }

        return contents;


    }


    String getIncompleteContentsForDate(String date) {
        String contents = "";
        for (Iterator iterator = getListForDate(date).iterator(); iterator.hasNext();) {
            Item item = (Item) iterator.next();
            if (!item.getCompleted() == true) {
                contents += item.getContent() + ";";
            }
        }

        return contents;
    }
}
