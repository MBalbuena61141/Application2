import Model.Actor;
import Model.ActorService;
import Model.DatabaseConnection;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
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
        topPane.setAlignment(Pos.TOP_LEFT);
        topPane.getStyleClass().add("logoPane");
        BorderPane.setAlignment(topPane, Pos.TOP_CENTER);

        root.setTop(topPane);       // <<<<<<< TOP





        root.setLeft(makeTrailerPane("Trailer one"));
        root.setCenter(makeTrailerPane("Trailer two"));
        root.setRight(makeTrailerPane("Trailer three"));








        VBox bottomPane = new VBox(20);
        Button bottomButton1 = new Button("I am bottom.");
        bottomPane.getChildren().add(bottomButton1);
        Button bottomButton2 = new Button("I am bottom again.");
        bottomPane.getChildren().add(bottomButton2);

        bottomPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(bottomPane, Pos.BOTTOM_CENTER);

        root.setBottom(bottomPane);       // <<<<<<< BOTTOM


        root.setLeft(makeTitlePane("Title"));
        root.setCenter(makeTitlePane("Title"));
        root.setRight(makeTitlePane("Title"));



       /* ArrayList<Actor> testList = new ArrayList<>();

       ActorService.selectAll(testList, database);

        for (Actor c: testList) {
            System.out.println(c);
        }
        */

    }


    public VBox makeTrailerPane(String name) {

        VBox pane = new VBox(20);
        pane.setPrefSize(341, 153);

        Button trailerButton = new Button(name);
        trailerButton.setPrefSize(200, 250);
        pane.getChildren().add(trailerButton);
        trailerButton.setAlignment(Pos.CENTER);

        Media trailerMedia = new Media(Main.class.getResource("Videos/video.mp4").toString());
        MediaPlayer trailerPlayer = new MediaPlayer(trailerMedia);
        MediaView trailerVideo = new MediaView(trailerPlayer);
        trailerVideo.setFitWidth(341);
        trailerVideo.setFitHeight(200);

        trailerPlayer.play();

        pane.getChildren().add(trailerVideo);

        return pane;

    }


    public VBox makeTitlePane (String name) {


        VBox pane = new VBox(20);
        pane.setPrefSize(100, 50);

        Button movieName = new Button(name );
        movieName.setPrefSize(100, 50);
        pane.getChildren().add(movieName);
        movieName.setAlignment(Pos.BOTTOM_CENTER );


        return pane;


    }


}










