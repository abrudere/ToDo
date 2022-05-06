package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    ArrayList<ToDo> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    void addToDo() {
        System.out.println("Add ToDo");
        ToDo todo = new ToDo();

         System.out.println("Please input a task: ");
         todo.task = scanner.nextLine();

         System.out.println("Please input todo id: ");
         todo.id = scanner.nextInt();

         this.tasks.add(todo);
         System.out.println(todo.task + " Added Successfully");
    }

    void viewAllTodo() {
        System.out.println("All tasks: ");

        for (ToDo todo: tasks) {
            System.out.println("+ " + todo.id + todo.task);
        }
    }

    void viewSingleTodo() {
        try {
            System.out.println("View task by index");
            System.out.println("Please input the index of the task you want to view: ");
            int index = intScanner.nextInt();
            ToDo todo = tasks.get(index);
            System.out.println("Task " + todo.task);
        } catch (Exception ex) {
            System.out.println("Unable to find a task, please try again");
        }

    }

    void markTodoAsDone() {

    }

    void deleteTodo() {
        try {
            System.out.println("Delete task by index");
            System.out.println("Please input the index of the task you want to delete: ");
            int index = intScanner.nextInt();

            ToDo todo = this.tasks.get(index);
            System.out.println("Task removed successfully" + todo.task);
        } catch (Exception ex) {
            System.out.println("Unable to find a task, please try again");
        }
    }




}
