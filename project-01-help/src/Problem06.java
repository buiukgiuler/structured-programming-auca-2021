import processing.core.*;

public class Problem06 extends PApplet {

    float alpha=0;
    float beta;

    public void settings() {
        fullScreen();
    }

    public void setup() {


    }

    public void draw() {
        background(0, 0, 0);

        pushMatrix();

        //Sun
        translate(width / 2f, height / 2f);
        fill(255, 204, 0);
        stroke(255, 204, 0);
        circle(0, 0, 200);


        // Venus
        rotate(alpha);
        translate(250, 0);
        fill(0, 0, 255);
        stroke(0, 0, 255);
        circle(0, 0, 90);

        // Earth
        rotate(alpha*2);
        translate(400, 0);
        fill(0, 0, 255);
        stroke(0, 0, 255);
        circle(0, 0, 70);

        //Moon
        rotate(beta);
        translate(100, 0);
        fill(255, 0, 255);
        stroke(255, 0, 255);
        circle(0, 0, 20);

        alpha += 0.01f;
        beta += 0.01f;

        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}