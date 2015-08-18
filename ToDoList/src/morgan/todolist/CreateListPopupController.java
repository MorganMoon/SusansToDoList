package morgan.todolist;

/**
 * Created by Morgan on 8/18/2015.
 */
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreateListPopupController {

    public Button cancelbtn;

    public void test()
    {
        System.out.println("Works");
    }

    public void closeWindow(){
        Stage stage = (Stage)cancelbtn.getScene().getWindow();
        stage.close();
    }

}
