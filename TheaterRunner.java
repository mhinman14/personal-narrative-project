import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // 2D Array
    String[][] vacation = {
      {"Bahamas", "Paris"},
      {"London", "Bora Bora"}
    };


    ImageFilter[][] images = {
       { new ImageFilter("college-student-travel-destinations.jpg"), new ImageFilter("Blue-Lagoon-Bahamas.jpg") },
      { new ImageFilter("eiffel-tower-in-paris-151-medium.jpg"), new ImageFilter("study-in-london.jpg"), new ImageFilter("bora-bora-white-sand-beach.jpg") },
    };
    

    // MyStory object
    MyStory scene = new MyStory(vacation, images);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}