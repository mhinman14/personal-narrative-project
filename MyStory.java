import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] vacationText;
  private ImageFilter[][] image;
  
  // Constructor
  public MyStory(String[][] vacationText, ImageFilter[][] image) {
    this.vacationText = vacationText;
    this.image = image;
  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawOpeningScene();
    drawBahamas();
    drawParis();
    drawLondon();
    drawBoraBora();
    drawEndScene();
  }

  public void drawOpeningScene() {
    clear("white");
    playSound("chime.wav");
    setTextHeight(25);
    setTextColor("teal");
    drawText("Where to go on vacation?".toUpperCase(), 20, 374);
    drawImage(image[0][0], 0, 0, 400);
    pause(1.0);
    drawImage(image[0][0], 0, 0, 400);
    image[0][0].colorize();
    
  }

 public void drawBahamas() {
   clear("white");
   setTextHeight(25);
    setTextColor("black");
    drawText("Bahamas?".toUpperCase(), 96, 56);
    
    // Create ImageFilter before drawing
    ImageFilter baha = new ImageFilter("Blue-Lagoon-Bahamas.jpg");
    drawImage(baha, 50, 150, 300);
    pause(1.5);
    baha.makeNegative();
    drawImage(baha, 50, 150, 300);
    pause(1.0);
}

public void drawParis() {
       clear("white");
  setTextHeight(25);
    setTextColor("black");
    drawText("Paris sounds fun!", 48, 68);
    
    // Create ImageFilter before drawing
    ImageFilter paris = new ImageFilter("eiffel-tower-in-paris-151-medium.jpg");
    drawImage(paris, 50, 150, 300);
    pause(1.5);
    paris.adjustBrightness(100);
    drawImage(paris, 50, 150, 300);
    drawText("Woah too bright!".toUpperCase(), 70, 118);
    pause(1.0);
}

  public void drawLondon() {
       clear("white");
    setTextHeight(25);
    setTextColor("black");
    drawText("Lo-lo-lo-lo-LONDON", 62, 33);

    ImageFilter london = new ImageFilter("study-in-london.jpg");
    drawImage(london, 50, 150, 300);
    pause(1.5);
    london.mirrorVertical();
    drawImage(london, 50, 150, 300);
    pause(1.0);
  }

  public void drawBoraBora() {
       clear("white");
    setTextHeight(25);
    setTextColor("black");
    drawText("Ah, Bora Bora sounds like paradise.", 3, 45);
    
    // Create ImageFilter before drawing
    ImageFilter bora = new ImageFilter("bora-bora-white-sand-beach.jpg");
    drawImage(bora, 50, 150, 300);
    pause(1.5);
    bora.makeNegative();
    drawImage(bora, 50, 150, 300);
    pause(1.0);
  }

  public void drawEndScene() {
    clear("white");
    setTextHeight(30);
    setTextColor("teal");
    drawText("I think I'll just stay home.", 50, 200);
  }

  
  

  
  
  
}