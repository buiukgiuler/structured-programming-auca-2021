import processing.core.*;

public class Problem02 extends PApplet {

    float x;
    float y;
    float dx;
    float dy;

    public void settings() {
        fullScreen();
     size(800,600);

    }

    public void setup() {
        x = width / 2f;
        y = height / 2f;
        dx = random(-12.5f, 12.5f);
        dy = random(-2.5f, 2.5f);

    }

    public void draw() {
        background(0, 0, 0);
        fill(255, 255, 0);
        circle(x, y, 50);
        x += dx;
        y += dy;

        if (x >= width) {
            x = width - 1;
            dx = -dx;

        }
        if (x < 0) {
            x = 0;
            dx = -dx;

        }
        if (y >= height) {
            y = height - 1;
            dy = -dy;

        }
        if (y < 0) {
            y = 0;
            dy = -dy;
        }
    }

     public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}