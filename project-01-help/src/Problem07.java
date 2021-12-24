import processing.core.*;

import javax.swing.*;

public class Problem07 extends PApplet {

    float stars;
    float rays;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        try {
            String strRadius = JOptionPane.showInputDialog("Number of stars [8,12]: ");
            stars = Float.parseFloat(strRadius);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INCORRECT NUMBER");
            System.exit(1);
        }
        if (stars < 8 || 12 < stars) {
            JOptionPane.showMessageDialog(null, "INCORRECT NUMBER");
            System.exit(1);
        }
        try {
            String strRadius1 = JOptionPane.showInputDialog("Number of rays [8,10,12]: ");
            rays = Float.parseFloat(strRadius1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INCORRECT NUMBER");
            System.exit(1);
        }
        if (rays < 8 || 12 < rays) {
        } else if (rays == 9) {
            {
                JOptionPane.showMessageDialog(null, "INCORRECT NUMBER");
                System.exit(1);
            }
        }
    }
    public void draw() {
        background(0, 0, 0);


        drawStar(width / 2f, height / 2f, height / 4f, 255f, 0f, 0f);

    }

        private void drawStar(float centerX, float centerY, float r, float red, float green, float blue) {
            pushMatrix();

            float n = 8;
            float alpha = 0;
            float dalpha = 2 * PI / 8;

            translate(centerX, centerY);
            stroke(red, green, blue);
            float prevX = 0;
            float prevY = 0;


            for (int i = 0; i <= n; ++i) {
                float curR = r;
                if (i % 2 == 1) {
                    curR /= 4;
                }
                float x = curR * cos(alpha);
                float y = curR * sin(alpha);
                line(0, 0, x, y);


                line(prevX, prevY, x, y);

                prevX = x;
                prevY = y;
                alpha += dalpha;
            }
            popMatrix();

        }


    public static void main(String[] args) {
        PApplet.main("Problem07");
    }

}