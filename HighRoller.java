/**
 * Created by Lee Laffan on 03/01/2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class HighRoller extends Application {

    public static HighRoller highRoller;
    public MainScene mainScene;
    public Stage window;

    public static final int WIDTH = 800, HEIGHT = 800;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("High Roller");
        mainScene = new MainScene(window);
        window.setScene(mainScene.initScene);

        window.show();
    }
}
