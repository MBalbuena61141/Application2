import Model.DatabaseConnection;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class LogIn extends Application {
    public static DatabaseConnection database;


    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);


        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Loging In");
        stage.setScene(scene);
        stage.show();

    }

    public static void logIn(String []args) {

        launch(args);
    }










    }