import processing.core.*;

public class Problem03 extends PApplet {
    static final float RECT_WIDHT = 150;
    static final float RECT_HEIGHT = 350;

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

        float rectTopLeftX = width / 2f - RECT_WIDHT / 2f;
        float rectTopLeftY = width / 4f - RECT_HEIGHT / 2f;

        fill(0, 0, 255);
        rect(rectTopLeftX, rectTopLeftY, RECT_HEIGHT, RECT_WIDHT);

        fill(0, 0, 100);
        ellipse(mouseX, mouseY, 100, 100);

        fill(255, 255, 0);
        text("mouseX: " + mouseX, width / 2f, height / 2f);
        text("mouseY: " + mouseY, width / 2f, height / 2f + height / 20f);

        if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDHT && rectTopLeftY <= mouseY && mouseY <= rectTopLeftY + RECT_HEIGHT) {
            fill(255, 255, 0);
            text("Year:2004.PYPL Index:20", width / 2f, height - height / 5f);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}
