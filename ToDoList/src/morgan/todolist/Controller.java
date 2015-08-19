package morgan.todolist;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class Controller {
    public static ListView<ToDoList> toDoListListView;
    public static ListView<ToDoItem> toDoItemListView;
    public static int listViewIndex; // Selected list index
    public static int itemViewIndex; // Selected Item index
    public static Label listNameLabel;

    public void createList() throws Exception {
        CreateListPopup.display("List");
    }

    public void removeList(){
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
        toDoItemListView.getItems().remove(itemViewIndex);
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
            toDoListListView.getItems().get(listViewIndex).getToDoItems().add(new ToDoItem("fart"));
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