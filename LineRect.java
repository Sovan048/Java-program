import java.applet.*;
import java.awt.*;
public class LineRect extends Applet
{
	public void paint(Graphics g)
{
	g.drawRect(100,100,100,200);
	
	g.drawLine(100,100,200,300);

	g.drawLine(100,300,200,100);

	g.fillRoundRect(210,310,50,40,5,5);
	}
}