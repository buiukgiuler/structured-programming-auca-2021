import processing.core.*;

public class Problem03 extends PApplet {
    static final float RECT_WIDTH = 580;
    static final float RECT_HEIGHT = 80;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(40);
        textAlign(CENTER);
        frameRate(30);
    }

    public void draw() {
        background(0, 0, 0);

        float rectX = width / 2f - RECT_WIDTH / 2f;
        float rectY = height / 4.5f - RECT_HEIGHT / 2f;

        float rectA = width / 2f - RECT_WIDTH / 2f;
        float rectB = height / 4.5f + RECT_HEIGHT / 2f;

        float rectM = width / 2f - RECT_WIDTH / 2f;
        float rectN = height / 4.5f + 3 * RECT_HEIGHT / 2f;

        stroke(0, 0, 255);
        fill(0, 0, 205);
        rect(rectX, rectY, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        text("Java Programming Language", rectX, rectY, RECT_WIDTH, RECT_HEIGHT);

        stroke(0, 0, 255);
        fill(0, 0, 205);
        rect(rectA, rectB, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        text("Kotlin Programming Language",rectA, rectB, RECT_WIDTH, RECT_HEIGHT);

        stroke(0, 0, 255);
        fill(0, 0, 205);
        rect(rectM, rectN, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        text("Scala Programming Language", rectM, rectN, RECT_WIDTH, RECT_HEIGHT);

        if (rectX <= mouseX && mouseX <= rectX + RECT_WIDTH && rectY <= mouseY && mouseY <= rectY + RECT_HEIGHT) {
            fill(255, 255, 0);
            text("Year: 1995. PYPL Index: 2", width / 2f, height - height / 4f);
            fill(255, 0, 0);
            text("Java Programming Language", rectX, rectY, RECT_WIDTH, RECT_HEIGHT);
        }
        if (rectA <= mouseX && mouseX <= rectA + RECT_WIDTH && rectB <= mouseY && mouseY <= rectB + RECT_HEIGHT) {
            fill(255, 255, 0);
            text("Year: 2011. PYPL Index: 11", width / 2f, height - height / 4f);
            fill(255, 0, 0);
            text("Kotlin Programming Language", rectA,rectB, RECT_WIDTH, RECT_HEIGHT);
        }
        if (rectM <= mouseX && mouseX <= rectM + RECT_WIDTH && rectN <= mouseY && mouseY <= rectN + RECT_HEIGHT) {
            fill(255, 255, 0);
            text("Year: 2004. PYPL Index: 20", width / 2f, height - height / 4f);
            fill(255, 0, 0);
            text("Scala Programming Language", rectM, rectN, RECT_WIDTH, RECT_HEIGHT);
        }
    }

    public static void main (String[]args){
        PApplet.main("Problem03");
    }
}