package morgan.todolist;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class Controller {
    public static ListView<ToDoList> toDoListListView;
    public static ListView<ToDoItem> toDoItemListView;
    public static int listViewIndex = Integer.MIN_VALUE; // Selected list index
    public static int itemViewIndex = Integer.MIN_VALUE; // Selected Item index
    public static Label listNameLabel;

    public void createList() throws Exception {
        CreateListPopup.display("List");
    }

    public void removeList(){
        if(listViewIndex != Integer.MIN_VALUE)
            toDoListListView.getItems().remove(listViewIndex);
    }

    public void createItem() throws Exception {
        if(toDoListListView.getItems().isEmpty()){
            System.out.println("Cant Do That");
        }
        else
            CreateListPopup.display("Item");
    }

    public void removeItem(){
        if(itemViewIndex != Integer.MIN_VALUE) {
            toDoListListView.getItems().get(Controller.listViewIndex).getToDoItems().remove(itemViewIndex);
            update();
        }
    }

    public void exit(){
        save();
    }

    public void save(){
        System.out.println("Content Saved...");
    }
    public static void update(){
        resetItemList();
        changeListNameLabel();
        if(toDoListListView.getItems().get(listViewIndex).getToDoItems().isEmpty())
        {
            System.out.println("List empty");
            for(ToDoItem item : toDoListListView.getItems().get(listViewIndex).getToDoItems()){
                toDoItemListView.getItems().add(item);
            }
        }
        else{
            for(ToDoItem item : toDoListListView.getItems().get(listViewIndex).getToDoItems()){
                toDoItemListView.getItems().add(item);
            }
        }
    }

    public static void changeListNameLabel() {
        listNameLabel.setText(toDoListListView.getItems().get(listViewIndex).getTitle() + "'s items");
    }

    public static void resetItemList(){
        toDoItemListView.getItems().clear();
    }
}