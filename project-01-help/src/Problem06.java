import processing.core.*;

public class Problem06 extends PApplet {
    static final float RECT_WIDTH = 280;
    static final float RECT_HEIGHT = 60;

    float alpha = 1;
    float beta;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(40);
        textAlign(CENTER);


    }

    public void draw() {
        background(0, 0, 0);
        //color Sun

        pushMatrix();

        //Sun
        translate(width / 2f, height / 2f);
        fill(255, 204, 0);
        stroke(255, 204, 0);
        circle(0, 0, 200);


        // Venus
        rotate(alpha);
        translate(200, 0);
        fill(0, 255, 255);
        stroke(0, 0, 255);
        circle(0, 0, 80);


        // Earth
        translate(200, 0);
        fill(0, 0, 255);
        stroke(0, 0, 255);
        circle(0, 0, 80);

        //Moon
        rotate(beta);
        translate(90, 0);
        fill(255);
        stroke(0);
        circle(0, 0, 20);


        alpha += 0.02f;
        beta += 0.000001f;

        popMatrix();

        //Text about planet and orbit
        float rectSunX = width / 2f - RECT_WIDTH / 15f;
        float rectSunY = height / 9.5f - RECT_HEIGHT / 2f;

        float rectVenusX = width / 2f - RECT_WIDTH / 15f;
        float rectVenusY = height / 9.5f + RECT_HEIGHT / 2f;

        float rectEarthX = width / 2f - RECT_WIDTH / 15f;
        float rectEarthY = height / 11f + 3.5f * RECT_HEIGHT / 2f;

        float rectMoonX = width / 2f - RECT_WIDTH / 15f;
        float rectMoonY = height / 7f + 3.5f * RECT_HEIGHT / 2f;

        stroke(255); //white color
        fill(0, 0, 205);
        rect(rectSunX * 1.6f, rectSunY, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        text("Sun", rectSunX * 1.6f, rectSunY, RECT_WIDTH, RECT_HEIGHT);

        stroke(255);
        fill(0, 0, 205);
        rect(rectVenusX * 1.6f, rectVenusY, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        text("Venus", rectVenusX * 1.6f, rectVenusY, RECT_WIDTH, RECT_HEIGHT);

        stroke(255);
        fill(0, 0, 205);
        rect(rectEarthX * 1.6f, rectEarthY, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        text("Earth", rectEarthX * 1.6f, rectEarthY, RECT_WIDTH, RECT_HEIGHT);

        stroke(255);
        fill(0, 0, 205);
        rect(rectMoonX * 1.6f, rectMoonY, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        text("Moon", rectMoonX * 1.6f, rectMoonY, RECT_WIDTH, RECT_HEIGHT);


        //Orbit
        if (rectSunX <= mouseX/1.6f && mouseX/ 1.6f <= rectSunX * 1.6f + RECT_WIDTH && rectSunY <= mouseY && mouseY <= rectSunY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Sun", rectSunX * 1.6f, rectSunY, RECT_WIDTH, RECT_HEIGHT);
            translate(width / 2f, height / 2f);
            noFill();
            stroke(255, 0, 0);
            circle(0, 0, 210);

        }
        if (rectVenusX <= mouseX/1.6f && mouseX/1.6f <= rectVenusX * 1.6f + RECT_WIDTH && rectVenusY <= mouseY && mouseY <= rectVenusY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Venus", rectVenusX * 1.6f, rectVenusY, RECT_WIDTH, RECT_HEIGHT);
            noFill();
            stroke(255, 0, 0);
            translate(width / 2f, height / 2f);
            circle(0, 0, 405);
            rotate(alpha);
            translate(200, 0);
            noFill();
            stroke(255, 0, 0);
            circle(0, -5, 95);
        }

        if (rectEarthX <= mouseX/1.6f && mouseX/1.6f <= rectEarthX * 1.6f + RECT_WIDTH && rectEarthY <= mouseY && mouseY <= rectEarthY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Earth", rectEarthX * 1.6f, rectEarthY, RECT_WIDTH, RECT_HEIGHT);
            noFill();
            stroke(255, 0, 0);
            translate(width / 2f, height / 2f);
            circle(0, 0, 805);
            rotate(alpha);
            translate(400, 0);
            noFill();
            stroke(255, 0, 0);
            circle(0, -7, 95);
        }
        if (rectMoonX <= mouseX /1.6f && mouseX/1.6f <= rectMoonX * 1.6f + RECT_WIDTH && rectMoonY <= mouseY && mouseY <= rectMoonY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Moon", rectMoonX * 1.6f, rectMoonY, RECT_WIDTH, RECT_HEIGHT);
            translate(width / 2f, height / 2f);
            rotate(alpha);
            translate(400, 0);
            noFill();
            stroke(255, 0, 0);
            circle(0, -7, 185);
            rotate(beta);
            translate(93, 0);
            noFill();
            stroke(255, 0, 0);
            circle(-3, -11, 35);

        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}