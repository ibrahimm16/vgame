
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Renderer extends JPanel {

	private static final long serialVersionUID = -2076458284057457740L;
	public int x;
	public int y;
	private int pxDifference;
	private int pyDifference;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Main.game.repaint(g);
	}

	public void drawUI(Graphics2D g) {

	}

	public void drawMainGame(Graphics2D g) {
		if (Main.game.p.px != 64) {
			pxDifference = 64 - Main.game.p.px;
		}
		if (Main.game.p.py != 64) {
			pyDifference = 64 - Main.game.p.py;
		}
		g.translate(-(Main.game.p.px), Main.game.p.py);
		for (int x2 = -10; x2 < 11; x2++) {
			for (int y2 = -8; y2 < 9; y2++) {
				g.drawImage(
						Main.game.m.getTexture((int) Main.game.p.px + pxDifference, x2,
								(int) Main.game.p.py + pyDifference, y2),
						Main.game.p.camx + 64 * x2, Main.game.p.camy + 64 * y2, null);
			}
		}
		g.translate(Main.game.p.px, -(Main.game.p.py));
		g.setColor(Color.black);
		g.fillRect(0, 0, 200, 150);
		g.setColor(Color.white);
		g.drawRect(Main.game.p.camx, Main.game.p.camy, 64, 64);
		g.drawString("pxr: " + Main.game.p.pxr + " pxl: " + Main.game.p.pxl + " pyu: " + Main.game.p.pyu + " pyd: "
				+ Main.game.p.pyu, 10, 20);
		g.drawString("mapx: " + Main.game.p.mapx + " mapy: " + Main.game.p.mapy, 10, 40);
		g.drawString("x: " + x + " y: " + y, 10, 60);
		g.drawString("tick: " + Main.game.p.tick, 10, 80);
		g.setColor(Color.black);
		g.fillRect(0, 0, 1200, 5);
		g.fillRect(0, 0, 5, 900);
		g.fillRect(1195, 0, 5, 900);
		g.fillRect(0, 895, 1200, 5);
	}

	public void drawBattle(Graphics2D g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1200, 900);
		g.setColor(Color.white);
		g.drawString("Parry Counter: " + Main.game.bm.parryCounter, 10, 20);
		g.drawOval((int) Main.game.bm.randX, (int) Main.game.bm.randY, 64, 64);
		g.drawOval((int) Main.game.bm.circleX, (int) Main.game.bm.circleY, (int) Main.game.bm.circleWidth,
				(int) Main.game.bm.circleHeight);
		g.drawString("Parry", (int) Main.game.bm.randX + 20, (int) Main.game.bm.randY + 30);
		if (Main.game.bm.permaloss) {
			g.drawString("score: " + Main.game.bm.parryCounter, 300, 300);
		}
	}
}