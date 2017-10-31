package com.ltse.tools;

import java.util.concurrent.ThreadLocalRandom;

public class Item {

    int id = 0;
    String date = "";
    String content = "";
    Boolean completed = false;

    public Item(String date, String content) {
        this.id = ThreadLocalRandom.current().nextInt(10000, 100000);
        this.date = date;
        this.content = content;
    }

    int getId() {
        return id;
    }

    String getDate() {
        return date;
    }



    String getContent() {
        return content;
    }
    Boolean getCompleted() {
        return completed;
    }

    void setCompleted() {
        this.completed = true;
    }


}