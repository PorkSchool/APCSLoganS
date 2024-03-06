/*
 * Purpose:
 * To combine all the skills I have learned and practice them in a picture lab
 * Logan Santamarina
 * 3/5/24
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods. Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue() {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture caterpillar = new Picture("caterpillar.jpg");

    caterpillar.mirrorVerticalRtoL();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple() {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    // TODO Auto-generated method stub

    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorHorizontalBotToTop();

    caterpillar.explore();
  }

  public static void testMirrorHorizontal() {
    // TODO Auto-generated method stub
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorHorizontal();

    caterpillar.explore();

  }

  /** Method to test the collage method */
  public static void testCollage() {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection() {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void keepOnlyBlue() {
    Picture beach = new Picture("beach.jpg");
    Pixel[][] pixels = beach.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);

      }
    }
    beach.explore();
  }

  public static void testNegate() {
    Picture beach = new Picture("beach.jpg");
    Pixel[][] pixels = beach.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());

      }
    }
    beach.explore();
  }

  public static void testGrayscale() {
    Picture beach = new Picture("beach.jpg");
    Pixel[][] pixels = beach.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {

        int avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
        pixelObj.setRed(avg);
        pixelObj.setGreen(avg);
        pixelObj.setBlue(avg);
      }
    }
    beach.explore();
  }

  public static void testFixUnderwater() {
    Picture underwater = new Picture("beach.jpg");
    Pixel[][] pixels = underwater.getPixels2D();

    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        int blue = pixelObj.getBlue();
        if (blue < 170) {
          pixelObj.setBlue(blue * 2);
        }
      }
    }
    underwater.explore();
  }

  /**
   * Main method for testing. Every class can have a main
   * method in Java
   */
  public static void main(String[] args) {
    // // uncomment a call here to run a test and
    // // comment out the ones you don't want to run

    // // Activity 5
    // // testZeroBlue();
    // keepOnlyBlue();
    // // testKeepOnlyRed();
    // // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();

    // // Activity 5 Challenge - optional
    // testFixUnderwater();

    // // Activity 6
    // testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBotToTop();

    // // Activity 6 Challenge - optional
    // // testMirrorDiagonal();

    // // Activity 7
    // testMirrorTemple();
    testMirrorArms();
    testMirrorGull();

    // Activity 8
    // testCollage();
    // testCopy();
    // testMyCollage();

    // Activity 9
    // testEdgeDetection();
    // testEdgeDetection2();

    // Extra methods
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }

  private static void testMirrorGull() {
    // TODO Auto-generated method stub
    Picture Gull = new Picture("seagull.jpg");
    Gull.mirrorVertical();
    Gull.explore();
  }

  private static void testMirrorArms() {
    // TODO Auto-generated method stub
    Picture arms = new Picture("snowman.jpg");
    arms.mirrorHorizontalBotToTop();
    arms.mirrorVerticalRtoL();
    arms.explore();
  }

}