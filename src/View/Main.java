package View;

import Model.DatabaseConnection;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static DatabaseConnection database;
    public static Stage stage;

    @Override
    public void start(Stage startStage) throws Exception {

        stage = startStage;
        database = new DatabaseConnection("DatabaseProject.db");



        LogIn.makeLoginPage();


       /* ArrayList<Actor> testList = new ArrayList<>();

       ActorService.selectAll(testList, database);

        for (Actor c: testList) {
            System.out.println(c);
        }
        */

    }





}










