
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Lee Laffan on 03/01/2017.

import javafx.scene.Scene;

/**
 * Created by u170440 on 03/01/2017.

 */
public class GameScene {

    public Scene game;

    public Stage window;
    public int playerNumber = 1;
	public static int triesLeft = 20;
    public static Label currentLabel, highestLabel, playerLabel, rollingLabel, triesLeftLabel;

    public GameScene(Stage window){
    	this.window = window;
    	System.out.println("I made it this far");
    	init();
    }
    
    public void init(){
    	playerLabel = new Label("Player " + playerNumber);
    	highestLabel = new Label("Highest Roll: 0");
    	currentLabel = new Label("Current Roll: " + mainFunctions.getCurrent());
    	rollingLabel = new Label("Not rolling");
    	triesLeftLabel = new Label("Tries left: " + triesLeft);
    			
    	Button roll = new Button("Roll!");
    	Button keep = new Button("Keep!");
    	
    	//Roll details
    	roll.setOnAction(e -> mainFunctions.roll());
    	
    	
    	VBox layout = new VBox(20);
    	layout.setAlignment(Pos.CENTER);
    	
    	layout.getChildren().addAll(playerLabel, highestLabel, currentLabel, triesLeftLabel, rollingLabel, roll, keep);
    	game = new Scene(layout, HighRoller.WIDTH, HighRoller.HEIGHT);
    	
    	
    }

    public GameScene(){

        System.out.println("Working");


    }


}
