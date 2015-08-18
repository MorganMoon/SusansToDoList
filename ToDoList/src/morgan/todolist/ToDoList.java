package morgan.todolist;

import java.util.ArrayList;

/**
 * Created by Morgan on 8/17/2015.
 */
public class ToDoList {
    private String title;
    private ArrayList<ToDoItem> toDoItems;

    //constructors --------------------
    public ToDoList(String title) {
        this.title = title;
    }

    public ToDoList(){
        this.title = "Susy's ToDo List";
    }

    //methods --------------------
    //add ToDoItem
    public void add(ToDoItem item)
    {
        toDoItems.add(item);
    }

    //toString method
    public String toString()
    {
        return title;
    }

    //getters & setters --------------------
    //title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //toDoItems
    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }

    public void setToDoItems(ArrayList<ToDoItem> toDoItems) {
        this.toDoItems = toDoItems;
    }
}
