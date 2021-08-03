import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Animations {

	public BufferedImage map;
	public Image wfloor;
	public Image sgrass;
	public Image player;
	public Image art;
	public Image blackBox;

	public Animations() {

	}
	
	public void loadImages() {
		try {
			map = ImageIO.read(Main.class.getResource("map.png"));
		} catch (IOException e) {
		}
		wfloor = new ImageIcon(Main.class.getResource("woodfloor.png")).getImage();
		sgrass = new ImageIcon(Main.class.getResource("shortgrass.png")).getImage();
		player = new ImageIcon(Main.class.getResource("bruv.png")).getImage();
		art = new ImageIcon(Main.class.getResource("a.png")).getImage();
		blackBox = new ImageIcon(Main.class.getResource("blackbox.png")).getImage();
	}
}
