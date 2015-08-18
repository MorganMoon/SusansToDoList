package morgan.todolist;

import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class Controller {
    public static ListView<ToDoList> toDoListListView;
    public TextField inputing;

    public void testing() throws Exception {
        CreateListPopup.display();
    }

}