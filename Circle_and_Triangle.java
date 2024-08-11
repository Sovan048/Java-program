import java.applet.Applet;
import java.awt.*;

public class Circle_and_Triangle extends Applet {

    public void paint(Graphics g) {
        g.setColor(new Color(0x4B7CBB));
        int[] xpoints = {350, 150, 150};
        int[] ypoints = {350, 350, 150};
        int npoints = 3;
        g.fillPolygon(xpoints, ypoints, npoints);

        g.setColor(new Color(0xC7582E));
        g.fillOval(228, 128, 145, 145);
    }
}
