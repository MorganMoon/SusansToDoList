package morgan.todolist;

/**
 * Created by Morgan on 8/18/2015.
 */
import com.sun.deploy.util.StringUtils;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class CreateListPopupController {

    public Button cancelbtn;
    public TextField listNameInput;
    public static Label popupLabel;

    public static void setPopupLabel(String word){
        popupLabel.setText("Create ToDo " + word);
    }

    public void test()
    {
        System.out.println("Works");
    }

    public void closeWindow(){
        Stage stage = (Stage)cancelbtn.getScene().getWindow();
        stage.close();
    }

    public void addListOrItem(){
        if(popupLabel.getText().matches("Create ToDo List"))
            addList();
        else if(popupLabel.getText().matches("Create ToDo Item"))
            addItem();
    }

    public void addList(){
        if(listNameInput.getText().equals("") || listNameInput.getText().equals(null) || listNameInput.getText().matches("\\p{javaWhitespace}*")) {
            ToDoList thelist2 = new ToDoList();
            Controller.toDoListListView.getItems().add(thelist2);
        }
        else{
            ToDoList thelist = new ToDoList(listNameInput.getText());
            Controller.toDoListListView.getItems().add(thelist);
        }
        closeWindow();
    }

    public void addItem(){
        if (listNameInput.getText().equals("") || listNameInput.getText().equals(null) || listNameInput.getText().matches("\\p{javaWhitespace}*")) {
            ToDoItem theitem2 = new ToDoItem();
            Controller.toDoItemListView.getItems().add(theitem2);
        } else {
            ToDoItem theitem = new ToDoItem(listNameInput.getText());
            Controller.toDoItemListView.getItems().add(theitem);
        }
        closeWindow();
    }

}
