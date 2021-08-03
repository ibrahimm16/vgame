import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Screen implements ActionListener {
	public static JFrame frame;

	public void setFrame() {
		Timer timer = new Timer(20, this);
		frame = new JFrame();
		frame.add(Main.game.r);
		frame.setSize(1200, 900);
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.setLocation(400, 100);
		frame.setVisible(true);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Main.game.r.repaint();
		Main.game.im.tick();
	}
}
