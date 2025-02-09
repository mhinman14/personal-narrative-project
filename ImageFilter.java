import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }

  // Add filter methods here
// colors the image based on the grayscale value
   public void colorize() {
 Pixel[][] pixels = getImagePixels();
    
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel pixel = pixels[row][col];
        int average = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;

        if (average < 85) {
          pixel.setRed(255);
          pixel.setGreen(0);
          pixel.setBlue(0);
        } else if (average < 170) {
          pixel.setRed(0);
          pixel.setGreen(255);
          pixel.setBlue(0);
        } else {
          pixel.setRed(0);
          pixel.setGreen(0);
          pixel.setBlue(255);
        }
      }
    }
  }
public void makeNegative() {
  Pixel[][] pixels = getImagePixels();

  for(int row = 0; row < pixels.length; row++) {
    for(int col = 0; col < pixels[0].length; col++) {

      Pixel currentPixel = pixels[row][col];
      currentPixel.setRed(255 - currentPixel.getRed());
  currentPixel.setGreen(255 - currentPixel.getGreen());
  currentPixel.setBlue(255 - currentPixel.getBlue());
    }
  }
}
  public void adjustBrightness(int value) {
    Pixel[][] pixels = getImagePixels();
    
    for (int row = 0; row < pixels.length; row++) {
        for (int col = 0; col < pixels[0].length; col++) {
            Pixel pixel = pixels[row][col];
            int newRed = Math.min(Math.max(pixel.getRed() + value, 0), 255);
            int newGreen = Math.min(Math.max(pixel.getGreen() + value, 0), 255);
            int newBlue = Math.min(Math.max(pixel.getBlue() + value, 0), 255);

            pixel.setRed(newRed);
            pixel.setGreen(newGreen);
            pixel.setBlue(newBlue);
        }
    }
}

   public void mirrorVertical() {
 Pixel[][] pixels = getImagePixels();
    int width = pixels[0].length;

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        Pixel leftPixel = pixels[row][col];
        Pixel rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }

  
}