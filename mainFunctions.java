

import java.util.Random;

public class mainFunctions{
	
	static int highest = 0;
	static int current = highest;
	static Random rand = new Random();
	
	public void exitGame(){
		System.exit(0);
	}
	
	public static void roll(){
		current = (int) (100 - Math.sqrt(rand.nextInt(99 * 99)));
		if(current >= highest){
			highest = current;
		}
		System.out.println(current);
		setRollingText("Rolling...");
		
		
		GameScene.currentLabel.setText("Current Roll: " + getCurrent());
		GameScene.highestLabel.setText("Highest Roll: " + getHighest());
		GameScene.triesLeftLabel.setText("Tries left: " + --GameScene.triesLeft);
	}
	
	public static void playerWait(int timeInSeconds){
		try{
			Thread.sleep(timeInSeconds * 1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public static void setRollingText(String text){
		GameScene.rollingLabel.setText(text);
		
	}
	
	public static int getCurrent(){
		return current;
	}
	
	public static int getHighest(){
		return highest;
	}
	
	public void keepAlert(){
		//KeepAlert ka = new KeepAlert();
	}
	
	
}
