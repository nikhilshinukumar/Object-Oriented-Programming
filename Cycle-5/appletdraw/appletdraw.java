package appletdraw;
import java.applet.Applet;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author Student
 */
public class appletdraw extends Applet {

    int x=300,y=100,r=50;
    public void paint(Graphics g) {
        g.drawLine(3,300, 200, 10);
        g.drawString("Line", 100, 100);
        g.drawOval(250, 50, 100, 100);
        g.drawRect(450, 50, 200, 100);
    }
}