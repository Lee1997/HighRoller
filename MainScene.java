/**
 * Created by Lee Laffan on 03/01/2017.
 */
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainScene {

    public Stage window;
    public Scene initScene;
    public GameScene gameScene;

    public MainScene(Stage window){
        this.window = window;
        init();
    }
<<<<<<< HEAD
    
	public void init(){
=======

    public void init(){
>>>>>>> 4c6ca33d694ec30baa326b1467007d55b1ca6b8d
        Label title = new Label("High Roller");
        Button newGame = new Button("New Game");
        Button exitGame = new Button("Exit");

        title.setStyle("-fx-font-base: #b3ffff; -fx-font-size: 100px; -fx-font-weight: bold; -fx-font-fill: #3eb5b7; -fx-effect: dropshadow(gaussian, rgba(255,255,255,0.5), 0,0,0,1);");
        title.setMaxWidth(Double.MAX_VALUE);
        title.setAlignment(Pos.CENTER);

        newGame.setEffect(new DropShadow());
<<<<<<< HEAD
        newGame.setPrefSize(600, 100);
        newGame.setStyle("-fx-font-size: 40px; -fx-base: #b3ffff; -fx-font-weight: bold;");
=======
        newGame.setPrefSize(300, 100);
        newGame.setStyle("-fx-font-size: 40px; -fx-base: #b3ffff; -fx-font-weight: bold;");
        newGame.setMaxWidth(600);
>>>>>>> 4c6ca33d694ec30baa326b1467007d55b1ca6b8d
        newGame.setAlignment(Pos.CENTER);
        newGame.setPadding(new Insets(10, 50, 10, 50));
        newGame.paddingProperty();
        newGame.setOnAction(e -> newGame());

        exitGame.setEffect(new DropShadow());
        exitGame.setPrefSize(300, 100);
        exitGame.setStyle("-fx-font-size: 40px; -fx-base: #b3ffff; -fx-font-weight: bold;");
        exitGame.setMaxWidth(600);
        exitGame.setAlignment(Pos.CENTER);
        exitGame.setPadding(new Insets(10, 100, 10, 100));
<<<<<<< HEAD
        exitGame.setOnAction(e -> closeGame());
=======
        exitGame.setOnAction(e -> System.exit(0));
>>>>>>> 4c6ca33d694ec30baa326b1467007d55b1ca6b8d

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(title, newGame, exitGame);
        layout.setStyle("-fx-background-color: #5950ff");
        initScene = new Scene(layout, HighRoller.WIDTH, HighRoller.HEIGHT);

    }

    public void newGame(){
<<<<<<< HEAD
        gameScene = new GameScene(window);
        window.setScene(gameScene.game);
    }
    
    public void closeGame(){
    	System.exit(0);
    }
=======
        gameScene = new GameScene();
        window.setScene(gameScene.game);
    }
>>>>>>> 4c6ca33d694ec30baa326b1467007d55b1ca6b8d




}
