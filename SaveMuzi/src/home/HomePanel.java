package home;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import main.SMFrame;

public class HomePanel extends JPanel{
	
	private SMFrame smframe;
	private Image background;
	private ImageIcon icon;
	
	public HomePanel(SMFrame smFrame) {
		this.smframe = smFrame;
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//background = Toolkit.getDefaultToolkit().getImage("res/background/backgroundHome.png");
		icon = new ImageIcon("res/background/backgroundHome.png");
		background = icon.getImage();
		
		paintComponent(getGraphics());
	}
	
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		g.drawImage(background, 0, 0, 100, 100, this);
	}
	
}
