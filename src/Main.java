import Model.Actor;
import Model.ActorService;
import Model.DatabaseConnection;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static DatabaseConnection database;

    @Override
    public void start(Stage stage) throws Exception {
        database = new DatabaseConnection("DatabaseProject.db");

        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 1024, 768);

        stage.setTitle("Application");
        stage.setScene(scene);
        stage.show();

        scene.getStylesheets().add("CSS.css");


        //Top Buttons (Logo, search, watchlist and login/sign up)//

        HBox topPane = new HBox(20);


        Button logo = new Button("Logo.");
        logo.getStyleClass().add("Logo");
        topPane.getChildren().add(logo);

        Button search = new Button("Search");
        search.setPrefSize(200, 25);
        search.getStyleClass().add("topButtons");
        topPane.getChildren().add(search);


        Button watchList = new Button("Your Watch List");
        watchList.setPrefSize(150, 25);
        watchList.getStyleClass().add("topButtons");
        topPane.getChildren().add(watchList);

        Button logIn = new Button("LogIn");
        logIn.setPrefSize(80, 25);
        logIn.getStyleClass().add("topButtons");
        topPane.getChildren().add(logIn);

        Button signUp = new Button("SignUp");
        signUp.setPrefSize(80, 25);
        signUp.getStyleClass().add("topButtons");
        topPane.getChildren().add(signUp);
        root.setTop(topPane);
        topPane.setAlignment(Pos.TOP_LEFT);
        topPane.getStyleClass().add("logoPane");
        BorderPane.setAlignment(topPane, Pos.TOP_CENTER);



        //LEFT section.

        VBox leftPane = new VBox(20);
        leftPane.setPrefSize(341, 153);

        HBox boxLeftPane = new HBox(20);
        boxLeftPane.setPrefSize(341, 768);
        boxLeftPane.getStyleClass().add("leftPane");

        Button trailerButton = new Button("trailer two");
        trailerButton.setPrefSize(200, 250);
        leftPane.getChildren().add(trailerButton);
        leftPane.getChildren().add(boxLeftPane);
        trailerButton.setAlignment(Pos.CENTER);


        root.setCenter(leftPane);


        //MIDDLE section


       VBox centerPane = new VBox(20);
        centerPane.setPrefSize(341, 153);

        HBox boxCenterPane = new HBox(20);
        boxCenterPane.setPrefSize(200, 768);
        //boxCenterPane.getStyleClass().add("panes");

        Button centerButton1 = new Button("trailer one");
        centerButton1.setPrefSize(200, 250);
        boxCenterPane.getChildren().add(centerButton1);
        centerPane.getChildren().add(boxCenterPane);
        boxCenterPane.setAlignment(Pos.TOP_LEFT);


        root.setCenter(centerPane);


        //RIGHT Section


        VBox rightPane = new VBox(20);
        rightPane.setPrefSize(341, 153);

        HBox boxRightPane = new HBox(20);
        boxRightPane.setPrefSize(341, 768);
        boxRightPane.getStyleClass().add("panes");

        Button rightButton1 = new Button("I am right.");
        rightPane.getChildren().add(rightButton1);
        Button rightButton2 = new Button("I am right again.");
        rightPane.getChildren().add(rightButton2);
        root.setRight(rightPane);
        rightPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(rightPane, Pos.CENTER_RIGHT);


        VBox bottomPane = new VBox(20);
        Button bottomButton1 = new Button("I am bottom.");
        bottomPane.getChildren().add(bottomButton1);
        Button bottomButton2 = new Button("I am bottom again.");
        bottomPane.getChildren().add(bottomButton2);
        root.setBottom(bottomPane);
        bottomPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(bottomPane, Pos.BOTTOM_CENTER);


        ArrayList<Actor> testList = new ArrayList<>();

       ActorService.selectAll(testList, database);

        for (Actor c: testList) {
            System.out.println(c);
        }


    }



}









