import processing.core.*;

public class Problem05 extends PApplet {
    static final int NUMBER_OF_CIRCLES = 16;

    public void settings() {
        fullScreen();
    }
    public void setup() {
        frameRate(2);
    }
    public void draw() {
        background(0, 0, 0);

        float r = min(width, width) / 2f;
        float dr = r / NUMBER_OF_CIRCLES;
        float redComp = 5;
        float dRedComp = 255 / NUMBER_OF_CIRCLES;

        for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
            fill(redComp, 0, 0);
            circle(width / 2f, height / 2f, 2 * r);
            r -= dr;
            redComp += dRedComp;
        }
        noLoop();
    }

    private void text(String java_programming_language_, int numberOfCircles) {
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}
