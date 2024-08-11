import javax.swing.*;
import java.awt.*;

public class CircleAndTriangle {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {

    Mypanel panel;

    MyFrame() {
        panel = new Mypanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class Mypanel extends JPanel {
    Mypanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(new Color(0x4B7CBB));
        int[] xpoints = {350, 150, 150};
        int[] ypoints = {350, 350, 150};
        int npoints = 3;
        g2D.fillPolygon(xpoints, ypoints, npoints);

        g2D.setPaint(new Color(0xC7582E));
        g2D.fillOval(228, 128, 145, 145);
    }
}