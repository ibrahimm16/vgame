import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

public class Main {
	public static Main game;
	public Screen s;
	public ImportantMethods im;
	public Renderer r;
	public Player p;
	public Animations a;
	public Map m;
	public BattleMechanics bm;
	public Image i;
	public Graphics2D g;

	public enum GAMESTATE {
		inGame, battle;
	}

	public GAMESTATE gs = GAMESTATE.inGame;

	public Main() {
		im = new ImportantMethods();
		r = new Renderer();
	}

	public static void main(String[] args) {
		game = new Main();
		game.callMethods(0);
	}

	public void callMethods(int i) {
		if (i == 0) {
			im.startGame();
		}
	}

	public void repaint(Graphics g2) {
		g = (Graphics2D) g2;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (gs == GAMESTATE.inGame) {
			r.drawMainGame(g);
		}
		if (gs == GAMESTATE.battle) {
			r.drawBattle(g);
		}
	}
}
