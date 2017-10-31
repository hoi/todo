package com.ltse.tools;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Todo {

    static TodoList todoList = new TodoList();

    public static void main(String args[]) throws Exception
    {
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Todo List!");
        System.out.println("Possible commands:");
        System.out.println("add: Add item");
        System.out.println("list: See full list for a date");
        System.out.println("todo: See list of incomplete items for a date");
        System.out.println("done: Mark an item as completed");

        while(true) {
            System.out.println("Enter a command:");
            String command = inFromUser.readLine();
            switch (command) {
                case "add":
                    System.out.println("Enter date (yyyy-mm-dd):");
                    String date = inFromUser.readLine();
                    System.out.println("Enter content:");
                    String content = inFromUser.readLine();
                    todoList.insertItem(new Item(date, content));
                case "list":
                case "todo":
                case "done":
                default:
                    System.out.println("Command not recognized.");
            }
        }
    }



}
