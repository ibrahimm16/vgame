import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Player implements KeyListener, MouseListener {

	public int camx, camy, px, py, pxr, pxl, pyu, pyd, tick;
	public PlayerMethods pm;
	private KeyInteractions k;
	public double mapx;
	public double mapy;
	public boolean walkingLeft, walkingRight, walkingUp, walkingDown = false;
	int tickw = 0;

	public Player() {
		camx = 1200 / 2 - 32;
		camy = 900 / 2 - 32;
		pxr = 0;
		pxl = 0;
		pyu = 0;
		pyd = 0;
		mapx = 0;
		mapy = 0;
		tick = 0;
		Main.game.s.frame.addKeyListener((KeyListener) this);
		Main.game.s.frame.addMouseListener((MouseListener) this);
		pm = new PlayerMethods();
		k = new KeyInteractions();
	}

	public void walk() {
		if (walkingLeft) {
			pxl -= 2;
			px -= 2;
			if (pxl == 64) {
				mapx--;
				pxl = 0;
			}
		}
		if (walkingRight) {
			pxr += 2;
			px += 2;
			if (pxr == 64) {
				mapx++;
				pxr = 0;
			}
		}
		if (walkingDown) {
			pyd -= 2;
			py += 2;
			if (pyd == 64) {
				mapy++;
				pyd = 0;
			}
		}
		if (walkingUp) {
			pyu += 2;
			py -= 2;
			if (pyu == 64) {
				mapy--;
				pyu = 0;
			}
		}
	}

	public void keyPressed(KeyEvent e) {
		k.checkPressed(e.getKeyCode());
	}

	public void mousePressed(MouseEvent m) {
		int x = m.getX();
		int y = m.getY();
		Main.game.bm.checkParry(x, y);
	}

	public void keyReleased(KeyEvent e) {
		k.checkReleased(e.getKeyCode());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}
