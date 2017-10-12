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


         HBox topPane = new HBox(20);
         Button logo = new Button("Logo.");
         logo.getStyleClass().add("Logo");
         topPane.getChildren().add(logo);
         Button search = new Button("Search.");
         topPane.getChildren().add(search);
         root.setTop(topPane);
         topPane.setAlignment(Pos.TOP_LEFT);
         topPane.getStyleClass().add("funkyPane");
         BorderPane.setAlignment(topPane, Pos.TOP_CENTER);

         VBox leftPane = new VBox(20);
         Button leftButton1 = new Button("I am left.");
         leftPane.getChildren().add(leftButton1);
         Button leftButton2 = new Button("I am left again.");
         leftPane.getChildren().add(leftButton2);
         root.setLeft(leftPane);
         leftPane.setAlignment(Pos.CENTER);
         BorderPane.setAlignment(leftPane, Pos.CENTER_LEFT);


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

         VBox centerPane = new VBox(20);
         Button centerButton1 = new Button("I am centre.");
         centerPane.getChildren().add(centerButton1);
         Button centerButton2 = new Button("I am centre again.");
         centerPane.getChildren().add(centerButton2);
         root.setCenter(centerPane);
         centerPane.setAlignment(Pos.CENTER);
         BorderPane.setAlignment(centerPane, Pos.CENTER);





     }

}







