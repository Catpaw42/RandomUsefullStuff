

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * @author Magnus Brandt Sl�gedal
 */
@SuppressWarnings("serial")
public class CardGUI extends JFrame
{
	private String title = null;
	private String text = null;
	private String imageString = null;
	private JLabel pictureLabel;
	private JLabel titleLabel;
	private JLabel textLabel;
	
	public CardGUI()
	{
		//create objects
		DrawCardPane p = new DrawCardPane();
		titleLabel = new JLabel();
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Serif", Font.PLAIN, 22));
		pictureLabel = new JLabel();
		pictureLabel.setHorizontalAlignment(SwingConstants.CENTER);
		textLabel = new JLabel();
		Dimension dim = new Dimension(250, 400);

		//setup frame
		this.setSize(dim);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(800, 200);

		//setup panel
		p.setLayout(null);
		p.setPreferredSize(dim);
		p.add(titleLabel);
		p.add(pictureLabel);
		p.add(textLabel);
		
		//set positions on panel
		titleLabel.setBounds(25, 15, 190, 105);
		pictureLabel.setBounds(25, 125, 190, 50);
		textLabel.setBounds(25, 140, 190, 215);

		//add panel to frame
		this.add(p);
	}

	/**
	 * 
	 * @param cardType The type of card to be displayed
	 */
	//TODO: change this to receive a Card
	public void changeCard(String cardType)
	{
		switch (cardType)
		{
		case "GO_TO_JAIL":
			title = "Go to Jail";
			imageString = "GoToJail.jpg";
			text = "Go directly to jail, if you pass Start, you do not recieve cash";
			break;
		case "GET_OUT_OF_JAIL":
			
			break;
		default:
			break;
		}
		
		titleLabel.setText("<html><center>" + title + "</center></html>");
		pictureLabel.setIcon(new ImageIcon(imageString));
		textLabel.setText("<html><center>" + text + "</center></html>");
		this.setVisible(true);
	}
}
