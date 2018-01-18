package View;
import Controller.LogInController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.*;
import java.awt.event.ActionEvent;


public class LogIn {

    public static PasswordField passwordIn;
    public static TextField usernameIn;

    public static void makeLoginPage() {

        Main.stage.setTitle("Sign Up");
        Main.stage.setResizable(false);


        Pane root = new Pane();
        Scene loginScene = new Scene(root,300,263);
        Main.stage.setScene(loginScene);
        Main.stage.show();

        root.setPrefSize(300,263);
        root.setTranslateX(0);
        root.setTranslateY(80);


        Label loginText = new Label ("Sign Up");
        loginText.setTranslateX(280);
        loginText.setTranslateY(20);


        Label userNameText = new Label ("Username");
        userNameText.setTranslateX(270);
        userNameText.setTranslateY(42);


        // this will input and check the user input

        usernameIn = new TextField();
        usernameIn.setPromptText("Please enter your username");
        usernameIn.setTranslateX(270);
        usernameIn.setTranslateY(110);


        Button SignUpButton = new Button("Signing Up");
        SignUpButton.setOnAction((ae) -> LogInController.loadHomePage());
        root.getChildren().add(SignUpButton);


    }
}
