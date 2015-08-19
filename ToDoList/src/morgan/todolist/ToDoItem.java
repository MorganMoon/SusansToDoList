package morgan.todolist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Morgan on 8/17/2015.
 */
public class ToDoItem {
    private String title;
    private Date timeCreated;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    //constructors --------------------
    public ToDoItem(String title) {
        this.title = title;
        this.timeCreated = new Date();
    }

    public ToDoItem()
    {
        this.title = "Susan's ToDo Item";
        this.timeCreated = new Date();
    }

    //methods --------------------

    public String toString(){
        return title + " ----- " + timeCreated.toString();
    }

    //getters and setters --------------------

    //title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //timeCreated
    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}
