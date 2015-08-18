package morgan.todolist;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML/main.fxml"));
        primaryStage.setTitle("Susy-ToDo");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();

        //toDoLists stuff
        Controller.toDoListListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoList>() {
            @Override
            public void changed(ObservableValue<? extends ToDoList> observableValue, ToDoList oldValue, ToDoList newValue) {
                Controller.listViewIndex = Controller.toDoListListView.getItems().indexOf(newValue);
                System.out.println("Selected: " + Controller.listViewIndex + "(" + newValue + ")");
            }
        });
    }

}