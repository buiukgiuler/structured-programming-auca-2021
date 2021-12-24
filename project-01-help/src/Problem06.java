import processing.core.*;

public class Problem06 extends PApplet {

    final int NUM_OF_CIRCLES = 100;

    static final float RECT_WIDTH = 280;
    static final float RECT_HEIGHT = 60;

    float alpha = 0;


    public void settings() {
        fullScreen();

    }

    public void setup() {
        textSize(40);
        textAlign(CENTER);

    }

    public void draw() {
        background(0, 0, 0);

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
        if (rectSunX <= mouseX / 1.6f && mouseX / 1.6f <= rectSunX * 1.6f + RECT_WIDTH && rectSunY <= mouseY && mouseY <= rectSunY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Sun", rectSunX * 1.6f, rectSunY, RECT_WIDTH, RECT_HEIGHT);
            noFill();
            stroke(255, 0, 0);
            circle(width / 2f, height / 2f, height / 2.5f);

        }
        if (rectVenusX <= mouseX / 1.6f && mouseX / 1.6f <= rectVenusX * 1.6f + RECT_WIDTH && rectVenusY <= mouseY && mouseY <= rectVenusY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Venus", rectVenusX * 1.6f, rectVenusY, RECT_WIDTH, RECT_HEIGHT);
            noFill();
            stroke(255, 0, 0);
            circle(width / 2f, height / 2f, height / 1.7f);
        }

        if (rectEarthX <= mouseX / 1.6f && mouseX / 1.6f <= rectEarthX * 1.6f + RECT_WIDTH && rectEarthY <= mouseY && mouseY <= rectEarthY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Earth", rectEarthX * 1.6f, rectEarthY, RECT_WIDTH, RECT_HEIGHT);
            noFill();
            stroke(255, 0, 0);
            circle(width / 2f, height / 2f, height / 1.07f);
        }
        if (rectMoonX <= mouseX / 1.6f && mouseX / 1.6f <= rectMoonX * 1.6f + RECT_WIDTH && rectMoonY <= mouseY && mouseY <= rectMoonY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Moon", rectMoonX * 1.6f, rectMoonY, RECT_WIDTH, RECT_HEIGHT);
            noFill();
            stroke(255, 0, 0);
            circle(width / 2f, height / 2f, height / 1.07f);
        }
// draw sun
        noStroke();
        float dS = height / 2.5f;
        float colorCompS = 5;
        float drS = dS / NUM_OF_CIRCLES;
        float dColorCompS = 255f / NUM_OF_CIRCLES;

        for (int i = 0; i < NUM_OF_CIRCLES; ++i) {
            fill(colorCompS, colorCompS, 0);
            circle(width / 2f, height / 2f, dS);
            dS -= drS;
            colorCompS += dColorCompS;
        }
        translate(width / 2f, height / 2f);
        rotate(alpha);

        float dV = height / 10f;
        float colorCompV = 5;
        float drV = dV / NUM_OF_CIRCLES;
        float dColorCompV = 255f / NUM_OF_CIRCLES;


        for (int i = 0; i < NUM_OF_CIRCLES; ++i) {
            fill(0, colorCompV, colorCompV);
            circle(width / 7f, height / 7f, dV);
            dV -= drV;
            colorCompV += dColorCompV;
        }
//draw Earth
        translate(width / 15f, height / 10f);
        float dE = height / 11f;
        float colorCompE = 5;
        float drE = dE / NUM_OF_CIRCLES;
        float dColorCompE = 255f / NUM_OF_CIRCLES;


        for (int i = 0; i < NUM_OF_CIRCLES; ++i) {
            fill(0, 0, colorCompE);
            circle(width / 9f, height / 4f, dE);
            dE -= drE;
            colorCompE += dColorCompE;
        }

//draw Monn
        noStroke();
        pushMatrix();
        rotate(-alpha * 4);
        translate(width / 15f, height / 10f);
        float dM = height / 40f;
        float colorCompM = 5;
        float drM = dM / NUM_OF_CIRCLES;
        float dColorCompM = 255f / NUM_OF_CIRCLES;
        popMatrix();

        for (int i = 0; i < NUM_OF_CIRCLES; ++i) {
            fill(colorCompM, colorCompM, colorCompM);
            circle(width / 6.5f, height / 6.5f, dM);
            dM -= drM;
            colorCompM += dColorCompM;


            alpha += 0.0003f;


        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}