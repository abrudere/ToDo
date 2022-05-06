package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the ToDo app");

        ToDoList myToDo = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        do {
            System.out.println("Please choose an activity: ");
            System.out.println("""
                    1. Add ToDo
                    2. View all ToDos
                    3. View single ToDo
                    4. Mark ToDo as done
                    5. Delete ToDo
                    """);

            userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    myToDo.addToDo();
                    break;
                case "2":
                    myToDo.viewAllTodo();
                    break;
                case "3":
                    myToDo.viewSingleTodo();
                    break;
                case "4":
                    myToDo.markTodoAsDone();
                case "5":
                    myToDo.deleteTodo();
                    break;
            }
        } while (!userInput.equalsIgnoreCase("quit"));
    }
}
