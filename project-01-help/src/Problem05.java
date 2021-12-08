import processing.core.*;

public class Problem05 extends PApplet {
    static final int NUMBER_OF_CIRCLES = 50;
    static final int NUMBER_OF_CIRCLES1 = 10;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        frameRate(2);
    }


    public void draw()
        background(0, 0, 0);
        ( float centerX;
        float centerY;
        float centerred;
        float centergreen;
        float centerblue;)
    {   pushMatrix();

        int n = 8;
        float alpha= 0;
        float dalpha= 2*PI/n;

        translate(centerX,centerY);


        float circle1 = min(width, width) / 5f;
        float dcircle1 = circle1 / NUMBER_OF_CIRCLES1;
        float comp1 = 5;
        float dcomp1 = 255f / NUMBER_OF_CIRCLES1;

        float r = min(width, width) / 5f;
        float dr = r / NUMBER_OF_CIRCLES;
        float redComp = 5;
        float dRedComp = 255f / NUMBER_OF_CIRCLES;

        for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
            fill(redComp, 0, 0);
            circle(width / 2f, height / 2f, 2 * r);
            r -= dr;
            redComp += dRedComp;
        }
        noLoop();
        for (int i = 0; i < NUMBER_OF_CIRCLES1; ++i) {
            fill(comp1, 0, 0);
            circle(width / 3f, height / 3f, 2 * r);
            r -= dr;
            comp1 += dcomp1;
        }
        noLoop();
    }


    private void text(String java_programming_language_, int numberOfCircles) {
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}
