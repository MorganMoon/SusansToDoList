package morgan.todolist;

import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class Controller {
    public ListView<ToDoList> toDoListListView;
    public TextField inputing;

    public void testing() throws Exception {
        //ToDoList thelist = new ToDoList(inputing.getText());
        //toDoListListView.getItems().add(new ToDoList(inputing.getText()));
        CreateListPopup.display();
    }

}