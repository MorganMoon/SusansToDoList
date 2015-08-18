package morgan.todolist;

/**
 * Created by Morgan on 8/18/2015.
 */
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateListPopupController {

    public Button cancelbtn;
    public TextField listNameInput;

    public void test()
    {
        System.out.println("Works");
    }

    public void closeWindow(){
        Stage stage = (Stage)cancelbtn.getScene().getWindow();
        stage.close();
    }

    public void addList(){
        if(listNameInput.getText().equals("") || listNameInput.getText().equals(null) ) {
            ToDoList thelist2 = new ToDoList();
            Controller.toDoListListView.getItems().add(thelist2);

        }
        else{
            ToDoList thelist = new ToDoList(listNameInput.getText());
            Controller.toDoListListView.getItems().add(thelist);
        }
        closeWindow();
    }

}
