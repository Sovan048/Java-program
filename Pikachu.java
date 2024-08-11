import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class Pikachu extends Applet {
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.white);

        // Draw Pikachu's body
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 200, 200);

        // Draw Pikachu's ears
        g.setColor(Color.black);
        g.fillArc(80, 80, 80, 120, 45, 270);
        g.fillArc(240, 80, 80, 120, 225, 270);

        // Draw Pikachu's eyes
        g.setColor(Color.white);
        g.fillOval(140, 150, 40, 40);
        g.fillOval(220, 150, 40, 40);

        // Draw Pikachu's pupils
        g.setColor(Color.black);
        g.fillOval(150, 160, 20, 20);
        g.fillOval(230, 160, 20, 20);

        // Draw Pikachu's nose
        g.fillOval(190, 190, 20, 20);

        // Draw Pikachu's mouth
        g.setColor(Color.red);
        g.drawArc(160, 220, 80, 50, -180, -180);

        // Draw Pikachu's cheeks
        g.setColor(Color.pink);
        g.fillOval(105, 200, 40, 40);
        g.fillOval(255, 200, 40, 40);
    }
}