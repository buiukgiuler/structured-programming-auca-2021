import processing.core.*;

public class Problem08 extends PApplet {
    static float MIN_SIZE = 80;
    static float MAX_SIZE = 144;
    static float CHANGE = 1;
    static float CHANGE1= 1;
    static float CHANGE2= 1;
    static String MESSAGE = "Java Slogan:";
    static String MESSAGE1 = "Write once,";
    static String MESSAGE2 = "Run anywhere!";
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
        text(MESSAGE, width / 2f, height / 3f);
        textAlign(CENTER, CENTER);
        fill(0, 255, 0);
        messageSize += CHANGE;

        if (messageSize >= MAX_SIZE || messageSize <= MIN_SIZE) {
            CHANGE = -CHANGE;
        }

        textSize(messageSize);
        text(MESSAGE1, width / 2f, height / 2f);
        textAlign(CENTER, CENTER);
        fill(0, 0, 255);
        messageSize += CHANGE;

        if (messageSize >= MAX_SIZE || messageSize <= MIN_SIZE) {
            CHANGE1 = -CHANGE1;

        }
        textSize(messageSize);
        text(MESSAGE2, width / 2f, height / 1.5f);
        textAlign(CENTER, CENTER);
        fill(255, 0, 0);
        messageSize += CHANGE;

        if (messageSize >= MAX_SIZE || messageSize <= MIN_SIZE) {
            CHANGE2 = -CHANGE2;
        }
    }
    public static void main(String[] args) {
        PApplet.main("Problem08");
    }

}