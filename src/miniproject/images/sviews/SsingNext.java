package miniProject4.com.kh.views;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SsingNext extends JPanel{

	private JFrame mf;
	private JPanel panel;
	private ImageIcon back;
	private ImageIcon talk;
	private ImageIcon charac01;
	private ImageIcon win;
	
	public SsingNext(JFrame mf) {
		this.mf = mf;
		panel = this;
		this.setLayout(null);
		back = new ImageIcon("image/ssing/sosokSing.png");
		talk = new ImageIcon("image/ssing/talkFrame.png");
		charac01 = new ImageIcon("image/ssing/Characters01.gif");
		win = new ImageIcon("image/ssing/win.png");
		this.addMouseListener(new clickPanel());
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(back.getImage(), 0, 0, null);
		g.drawImage(talk.getImage(), 5, 620, 1390, 250, null);
		g.drawImage(win.getImage(),350,50,700,170,null);
		if (charac01 != null) {
			g.drawImage(charac01.getImage(), 500, 250, 398, 398, this);
		}
		g.setFont(new Font("Neo둥근모", Font.BOLD, 40));
		g.drawString("만세~! 노래 능력치가 올랐다!!", 70, 750);
		
		setOpaque(false);
		super.paintComponent(g);
	}
	
	
	class clickPanel extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			//ChangePanel.replacePanel(mf, panel, new Ssing2());
			//ChangePanel cp = new ChangePanel(mf,panel, panel);
			
			ChangePanel.replacePanel(mf, panel, new Sosok(mf));
			
		}

	}
	
}
