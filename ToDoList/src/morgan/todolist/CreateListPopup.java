package morgan.todolist;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Morgan on 8/18/2015.
 */
public class CreateListPopup {


    public static void display(String type) throws  Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(CreateListPopup.class.getResource("FXML/createToDoList.fxml"));
        root.getStylesheets().add(CreateListPopup.class.getResource("DarkTheme.css").toExternalForm());
        CreateListPopupController.setPopupLabel(type);
        primaryStage.setTitle("Create " + type);
        primaryStage.setScene(new Scene(root, 230, 105));
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.setResizable(false);
        primaryStage.showAndWait();
    }
}
