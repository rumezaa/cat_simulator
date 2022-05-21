package replit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import java.util.ArrayList;


public class Main extends Application 
{ 

  
  @Override
  public void start(Stage primaryStage) {

    //cat object
    Cat cat = new Cat();
    cat.nap();

    //making our scene
    Rectangle ground = new   Rectangle(300,10,Color.GREEN);
    ground.setX(0);
    ground.setY(190);




    
    //main pane
    Pane pane = new Pane();

    pane.getChildren().addAll(ground, cat);
    Scene scene = new Scene(pane, 300, 200);
    primaryStage.setTitle("kitty scene");
    primaryStage.setScene(scene);
    primaryStage.show();

    //Registering the event to the scene
scene.setOnMousePressed(cat.mouseHandler);



    
    //handle key events
    scene.setOnKeyPressed(new   EventHandler<KeyEvent>() {
    @Override
  public void handle(KeyEvent event) {
    if (event.getCode() == KeyCode.DOWN) {
      cat.sit();
      cat.getChildren().remove(cat.text);
    }

    else if(event.getCode() == KeyCode.UP){
      cat.stand();
      cat.walking_left.stop();
      cat.walking_right.stop();
      cat.getChildren().remove(cat.text);
    }

    else if(event.getCode() ==KeyCode.RIGHT){
      cat.move_right();
      cat.walking_left.stop();
      cat.getChildren().remove(cat.text);
    }

      else if(event.getCode() ==KeyCode.LEFT){
      cat.move_left();
      cat.walking_right.stop();
      cat.getChildren().remove(cat.text);
    }
}
});

  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 
