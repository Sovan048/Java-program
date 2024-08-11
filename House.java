import java.applet.*;
import java.awt.*;
public class House extends Applet
{
	public void paint(Graphics g)
{
	
	g.drawRect(50,200,100,100);

	g.drawRect(75,225,25,75);

	g.drawLine(100,100,50,200);
	
	g.drawLine(100,100,150,200);
	}
}