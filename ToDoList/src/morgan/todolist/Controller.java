package morgan.todolist;

import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class Controller {
    public static ListView<ToDoList> toDoListListView;
    public static int listViewIndex;
    public TextField inputing;

    public void createList() throws Exception {
        CreateListPopup.display();
    }

    public void removeList(){
        toDoListListView.getItems().remove(listViewIndex);
    }


}