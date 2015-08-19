package morgan.todolist;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;

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

    public void resetListListView(){
        toDoListListView.getItems().clear();
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

    public static void exit() throws Exception{
        save();
        Stage stage = (Stage)listNameLabel.getScene().getWindow();
        stage.close();
    }

    public static void save() throws Exception{
        FileOutputStream fos = new FileOutputStream("SusyToDo.susy");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(ToDoList list : toDoListListView.getItems() ){
            oos.writeObject(list);
        }
        System.out.println("Content Saved...");
    }

    public static void load() throws Exception{
        File fakeFis = new File("SusyToDo.susy");
        if(fakeFis.exists()) {
            FileInputStream fis = new FileInputStream("SusyToDo.susy");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                try {
                    toDoListListView.getItems().add((ToDoList) ois.readObject());
                } catch (EOFException e) {
                    System.out.println("Done Loading");
                    break;
                }
            }
        }
        else{
            System.out.println("No Save exists");
        }
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