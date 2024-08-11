import java.applet.*;
import java.awt.*;

public class Figure1 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(150, 150, 200, 200);

        g.setColor(Color.black);
        g.fillRect(175, 175, 150, 150);

        g.setColor(Color.yellow);
        g.fillOval(180, 180, 140, 140);
    }
}

// <APPLET code="Figure1.java" height="500" width="500">
// </APPLET>