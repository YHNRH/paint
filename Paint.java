import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;
import java.awt.image.*;

public class Paint
{
    public static void main(String[] args)
    {
	JFrame jf = new JFrame();
	jf.setContentPane(cnv);
	jf.setSize(1000,1000);
	jf.setVisible(true);
	Graphics g = image.getGraphics();
	g.fillRect(0,0,1000,1000);
	cnv.addMouseMotionListener(new L());

	
    }
    public static class Canvas extends JPanel
    {
	
	public void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
	    g.drawImage(image,0,0,null);
	}
	
    }
    
    public static BufferedImage image = new BufferedImage(1000,1000,BufferedImage.TYPE_INT_RGB);

    public static Canvas cnv = new Canvas();
    public static class L implements MouseMotionListener
    {
	public void mouseDragged(MouseEvent e)
	{
	    Graphics g = image.getGraphics();
	    g.setColor(new Color(0xFF000000));
	    g.fillOval(e.getX()-1, e.getY()-1, 2,2);
	    cnv.repaint();
	 }
	public void mouseMoved(MouseEvent e)
	{}
    }
}
