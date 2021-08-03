import java.awt.Color;
import java.awt.Image;

public class Map {

	public int mapx = 256;
	public int mapy = 256;
	private Color c;

	public Map() {

	}

	public Image getTexture(int x2, int x3, int y2, int y3) {
		int x = 256 - x2 - x3;
		int y = 256 - y2 - y3;
		c = new Color(Main.game.a.map.getRGB(x, y));
		if (c.getRed() == 255 && c.getGreen() == 255 && c.getBlue() == 255) {
			return Main.game.i = Main.game.a.sgrass;
		} else if (c.getRed() == 0 && c.getGreen() == 0 && c.getBlue() == 0) {
			return Main.game.i = Main.game.a.wfloor;
		}
		return Main.game.i = Main.game.a.blackBox;
	}

	/*public boolean getRightTexture() {
		int x = (int) (Main.game.p.mapx + 257 + (Main.game.p.camx / 64.0));
		int y = (int) (Main.game.p.mapy + 256 + (Main.game.p.camy / 64.0));
		Main.game.r.x = x;
		Main.game.r.y = y;
		c = new Color(Main.game.a.map.getRGB(x, y));
		if (c.getRed() == 255 && c.getBlue() == 0 && c.getGreen() == 0) {
			return false;
		}
		return true;
	}*/
}
