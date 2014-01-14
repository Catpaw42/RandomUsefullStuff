

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Magnus Brandt Sl�gedal
 */
//Custom JPanel to draw with
@SuppressWarnings("serial")
public class DrawCardPane extends JPanel
{
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRoundRect(20, 10, 200, 350, 20, 20);
		g.setColor(Color.GREEN);
		g.fillRoundRect(20, 10, 200, 100, 20, 20);
		g.fillRoundRect(20, 110, 200, 250, 20, 20);
		g.setColor(Color.BLACK);
		g.drawRoundRect(20, 10, 200, 100, 20, 20);
		g.drawRoundRect(20, 110, 200, 250, 20, 20);
	}
}
