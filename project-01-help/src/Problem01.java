import processing.core.*;

public class Problem01 extends PApplet {
    static float MIN_SIZE = 10;
    static float CHANGE = 2;
    static float MAX_SIZE = 144;
    static String MESSAGE = "Hello, Processing!!!";

    float colorcount = 1;
    float messageSize;


    public void settings() {
        fullScreen();
    }


    public void setup() {
        messageSize = MIN_SIZE;
    }

    public void draw() {

        background(0, 0, 0);
        textSize(messageSize);
        text(MESSAGE, width / 2f, height / 2f);
        textAlign(CENTER, CENTER);
        messageSize += CHANGE;

        if (messageSize >= MAX_SIZE || messageSize <= MIN_SIZE) {
            CHANGE = -CHANGE;
        }
        if (messageSize == MIN_SIZE) {
            colorcount += 1;
        }
        if (colorcount == 1) {
            fill(255, 0, 0);
        }
        if (colorcount == 2) {
            fill(0, 255, 0);
        }
        if (colorcount == 3) {
            fill(0, 0, 255);
        }
        if (colorcount == 4 && messageSize <= MIN_SIZE) {
            colorcount = 1;
        }
    }


    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}