import processing.core.*;

public class Problem03 extends PApplet {
    static final float RECT_WIDHT = 100;
    static final float RECT_HEIGHT = 650;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(40);
        textAlign(CENTER);
        frameRate(40);

    }

    public void draw() {
        background(0, 0, 0);

        float rectTopLeftX = width / 2.8f - RECT_WIDHT / 2.5f;
        float rectTopLeftY = width / 4f - RECT_HEIGHT / 2f;

        float rectTopLeftM = width / 2.8f - RECT_WIDHT / 2.5f;
        float rectTopLeftN = width / 4f - RECT_HEIGHT / 2.9f;

        float rectTopLeftA = width / 2.8f - RECT_WIDHT / 2.5f;
        float rectTopLeftB = width / 4f - RECT_HEIGHT / 4.9f;

        fill(0, 0, 255);
        stroke(0,255,0);
        rect(rectTopLeftX, rectTopLeftY, RECT_HEIGHT, RECT_WIDHT);

        fill(0, 0, 255);
        stroke(0,255,0);
        rect(rectTopLeftM, rectTopLeftN, RECT_HEIGHT, RECT_WIDHT);

        fill(0, 0, 255);
        stroke(0,255,0);
        rect(rectTopLeftA, rectTopLeftB, RECT_HEIGHT, RECT_WIDHT);

        fill(255);
        textAlign(LEFT);
        text("Java Programming Language " ,rectTopLeftX*2.1f/1.9f, rectTopLeftY*2.1f/1.5f);

        fill(255);
        textAlign(LEFT);
        text("Kotlin Programming Language " ,rectTopLeftM*2.3f/2.1f, rectTopLeftN*2.1f/1.7f);

        fill(255);
        textAlign(LEFT);
        text("Scala Programming Language " ,rectTopLeftA*2.1f/1.9f, rectTopLeftB*2.1f/1.8f);


        if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDHT && rectTopLeftY <= mouseY && mouseY <= rectTopLeftY + RECT_HEIGHT) {
            fill(255, 255, 0);
            text("Year:2004.PYPL Index:20", width / 3f, height - height / 3f);

        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}
