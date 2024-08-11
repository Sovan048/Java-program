import javax.swing.*;
import java.awt.*;

class Figure2 {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {

    MyPanel panel;
    MyFrame() {
        panel = new MyPanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {
    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        int[] x1points = {50, 250, 250};
        int[] y1points = {250, 250, 50};
        int npoints = 3;
        g2D.fillPolygon(x1points, y1points, npoints);

        g2D.setPaint(Color.yellow);
        int[] x2points = {250, 450, 250};
        int[] y2points = {250, 250, 50};
        g2D.fillPolygon(x2points, y2points, npoints);

        g2D.setPaint(Color.green);
        int[] x3points = {250, 450, 250};
        int[] y3points = {250, 250, 450};
        g2D.fillPolygon(x3points, y3points, npoints);
    }
}
