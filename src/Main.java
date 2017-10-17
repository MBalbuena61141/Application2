import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

     @Override
     public void start(Stage stage) throws Exception {

         BorderPane root = new BorderPane();

         Scene scene = new Scene(root, 1024, 768);

         stage.setTitle("Hello World");
         stage.setScene(scene);
         stage.show();

         scene.getStylesheets().add("CSS.css");


         //Top Buttons (Logo, search, watchlist and login/sign up)//

         HBox topPane = new HBox(20);


         Button logo = new Button("Logo.");
         logo.getStyleClass().add("Logo");
         topPane.getChildren().add(logo);

         Button search = new Button("Search");
         search.setPrefSize(200,25);
         search.getStyleClass().add("topButtons");
         topPane.getChildren().add(search);

         Button watchList = new Button("Your Watch List");
         watchList.setPrefSize(150,25);
         watchList.getStyleClass().add("topButtons");
         topPane.getChildren().add(watchList);

         Button logIn = new Button("LogIn");
         logIn.setPrefSize(80,25);
         logIn.getStyleClass().add("topButtons");
         topPane.getChildren().add(logIn);

         Button signUp = new Button("SignUp");
         signUp.setPrefSize(80,25);
         signUp.getStyleClass().add("topButtons");
         topPane.getChildren().add(signUp);
         root.setTop(topPane);
         topPane.setAlignment(Pos.TOP_LEFT);
         topPane.getStyleClass().add("logoPane");
         BorderPane.setAlignment(topPane, Pos.TOP_CENTER);

         //Left section.

         VBox leftPane = new VBox(20);
         Button leftButton1 = new Button("I am left.");
         leftPane.getChildren().add(leftButton1);
         Button leftButton2 = new Button("I am left again.");
         leftPane.getChildren().add(leftButton2);
         root.setLeft(leftPane);
         leftPane.setAlignment(Pos.CENTER);
         BorderPane.setAlignment(leftPane, Pos.CENTER_LEFT);


         //Middle section


         VBox centerPane = new VBox(20);
         centerPane.setPrefSize(341,761);

         HBox boxCenterPane = new HBox(20);
         boxCenterPane.setPrefSize( 341, 761);
         boxCenterPane.getStyleClass().add("centerPane");

         Button centerButton2 = new Button("trailer two");
         centerButton2.setPrefSize(200,100);
         boxCenterPane.getChildren().add(centerButton2);
         centerPane.getChildren().add(boxCenterPane);
         boxCenterPane.setAlignment(Pos.CENTER);


         root.setCenter(centerPane);








         VBox rightPane = new VBox(20);
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






     }

}







