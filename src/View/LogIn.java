package View;

import Controller.LogInController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LogIn {


    public static void makeLoginPage() {

        Main.stage.setResizable(false);

        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 200);
        Main.stage.setTitle("Loging In");
        Main.stage.setScene(scene);
        Main.stage.show();

        Button loginButton = new Button("Login");
        loginButton.setOnAction((ae) -> LogInController.loadHomePage());
        root.getChildren().add(loginButton);

    }

    }