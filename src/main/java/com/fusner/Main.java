package com.fusner;

import com.google.gson.Gson;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Gson gson = new Gson();
        String jasonData = "{ \"todos\": [ { \"body\": \"Walk the dog\", \"done\": false, \"id\": 0, \"priority\": 3, \"title\": \"dog\" },{ \"body\": \"Pay the bills\", \"done\": false, \"id\": 1, \"priority\": 1, \"title\": \"bills\" }] }";

        ToDoList toDoList = gson.fromJson(jasonData, ToDoList.class);
        System.out.println(toDoList.toString());

        String jasonData2 = gson.toJson(toDoList);

        System.out.println(jasonData2);
    }
}

class ToDoItem
{
    private String body;
    private Boolean done;
    private int id;
    private int priority;
    private String title;

    public ToDoItem(String body, Boolean done, int id, int priority, String title)
    {
        this.body = body;
        this.done = done;
        this.id = id;
        this.priority = priority;
        this.title = title;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public Boolean getDone()
    {
        return done;
    }

    public void setDone(Boolean done)
    {
        this.done = done;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ToDoItem{" +
                "body='" + body + '\'' +
                ", done=" + done +
                ", id=" + id +
                ", priority=" + priority +
                ", title='" + title + '\'' +
                '}';
    }
}

class ToDoList
{
    private ToDoItem[] todos;

    public ToDoList(ToDoItem[] todos)
    {
        this.todos = todos;
    }

    public ToDoItem[] getTodos()
    {
        return todos;
    }

    public void setTodos(ToDoItem[] todos)
    {
        this.todos = todos;
    }

    @Override
    public String toString()
    {
        return "ToDoList{" +
                "todos=" + Arrays.toString(todos) +
                '}';
    }
}
