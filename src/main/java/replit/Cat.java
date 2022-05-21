package replit;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import com.google.common.base.StandardSystemProperty;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.*;




public class Cat extends Pane {

  ///setting imges
  public Image cat_stand = new Image("file:CatFrames/Cat.png", 100, 100, true, false);
  public Image cat_stand2 = new Image("file:CatFrames/Cat2.png", 100, 100, true, false);

  
  public Image cat_nap1 = new Image("file:CatFrames/cat_nap.png", 55, 55, true, false);
  public Image cat_nap2 = new Image("file:CatFrames/cat_nap2.png", 55, 55, true, false);
  public Image cat_sit = new Image("file:CatFrames/cat_sit.png", 65, 65, true, false);
  public Image cat_right = new Image("file:CatFrames/cat_walk1.png", 85, 85, true, false);
  public Image cat_right2 = new Image("file:CatFrames/cat_walk2.png", 85, 85, true, false);

  public Image cat_left = new Image("file:CatFrames/cat_walk_1.png", 85, 85, true, false);
  public Image cat_left2 = new Image("file:CatFrames/cat_walk_2.png", 85, 85, true, false);

  public Text text = new Text("meow");


  public ImageView cat = new ImageView();

  //for swithcing between keyframes
  public int val = 0;

        //Create an animation timeline
    public Timeline napping = new Timeline(new       KeyFrame(Duration.seconds(4), event -> {    
nap();
}));

      public Timeline walking_right = new Timeline(new       KeyFrame(Duration.seconds(3), event -> {    
walk_right();
}));

    public Timeline walking_left = new Timeline(new       KeyFrame(Duration.seconds(3), event -> {    
walk_left();
}));

  

  public EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
@Override
public void handle(MouseEvent event) {
  napping.stop();
  stand();
}
};



  
  
  public Cat(){
    cat.setImage(cat_nap1);
    cat.setX(150);
    cat.setY(150);

    cat.setOnMouseClicked(event ->{
     meow();
     
    });

    this.getChildren().add(cat);

        //creating animation
    napping.setCycleCount(Animation.INDEFINITE);
    napping.play();
    
    //Animation frame rate
    napping.setRate(3);
    
  }


  
//show text on cat click
  public void meow(){
    stand();
    
    text.setX(cat.getX());
    text.setY(cat.getY() + 10);
    text.setFont(Font.font("Times New Roman", 20));
    this.getChildren().add(text);
    
  }
  
  public void sit(){
    cat.setImage(cat_sit);
    cat.setY(135);
    
  }

  public void stand(){
    cat.setImage(cat_stand);
    cat.setY(120);
 

  
}
//play teh animation to move right
public void move_right(){
    walking_right.setCycleCount(Animation.INDEFINITE);
    walking_right.play();
    
    //Animation frame rate
    walking_right.setRate(5);
}

//play the animation to move left
public void move_left(){
      walking_left.setCycleCount(Animation.INDEFINITE);
    walking_left.play();
    
    //Animation frame rate
    walking_left.setRate(5);
}   


public void walk_right(){
      val++;
      double pos = cat.getX();
      cat.setY(130);
    
    if(val %2 ==0){
      cat.setImage(cat_right);
      cat.setX(pos+10);
    }

    else{
      cat.setImage(cat_right2);
      cat.setX(pos+10);
    }

    if(pos>300){
      cat.setX(0);
    }
    
}

public void walk_left(){
      val++;
      double pos = cat.getX();
      cat.setY(130);

    
  
    if(val %2 ==0){
      cat.setImage(cat_left);
      cat.setX(pos-10);
      
    }

    else{
      cat.setImage(cat_left2);
      cat.setX(pos-10);
    }

    

        if(pos<0){
      cat.setX(300);
    }

      
}
  

  public void nap(){
    val++;
    if(val %2 ==0){
      cat.setImage(cat_nap2);
    }

    else{
      cat.setImage(cat_nap1);
    }
    
  
    
  }
}