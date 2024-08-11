import java.awt.*;
import javax.swing.*;

public class Display_Message 
{
    public static void main(String[] args) {
        new Frame();
    }    
}

class Frame extends JFrame
{
    Frame() {
        add(new Label());
        setTitle("Displaying messege in Applet");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class Label extends JLabel
{
    Label() {
        setText("Hello World!");
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        setFont(new Font("MV Boli", Font.PLAIN, 24));
        setForeground(Color.GREEN);
        setBackground(Color.BLACK);
        setOpaque(true);
    }
}