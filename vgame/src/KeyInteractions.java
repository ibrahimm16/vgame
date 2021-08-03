import java.awt.event.KeyEvent;

public class KeyInteractions {

	public KeyInteractions() {

	}

	public void checkPressed(int i) {
		if (i == KeyEvent.VK_0) {
			System.exit(0);
		}
		if (i == KeyEvent.VK_1) {
			if (Main.game.gs == Main.GAMESTATE.inGame) {
				Main.game.gs = Main.GAMESTATE.battle;
			} else {
				Main.game.gs = Main.GAMESTATE.inGame;
			}
		}
		if (i == KeyEvent.VK_R) {
			Main.game.bm = new BattleMechanics();
		}
		if (i == KeyEvent.VK_W || i == KeyEvent.VK_UP) {
			Main.game.p.pm.wu();
		}
		if (i == KeyEvent.VK_A || i == KeyEvent.VK_LEFT) {
			Main.game.p.pm.wl();
		}
		if (i == KeyEvent.VK_S || i == KeyEvent.VK_DOWN) {
			Main.game.p.pm.wd();
		}
		if (i == KeyEvent.VK_D || i == KeyEvent.VK_RIGHT) {
			Main.game.p.pm.wr();
		}
	}

	public void checkReleased(int i) {
		if (i == KeyEvent.VK_W || i == KeyEvent.VK_UP) {
			Main.game.p.pm.wuRelease();
		}
		if (i == KeyEvent.VK_A || i == KeyEvent.VK_LEFT) {
			Main.game.p.pm.wlRelease();
		}
		if (i == KeyEvent.VK_S || i == KeyEvent.VK_DOWN) {
			Main.game.p.pm.wdRelease();
		}
		if (i == KeyEvent.VK_D || i == KeyEvent.VK_RIGHT) {
			Main.game.p.pm.wrRelease();
		}
	}
}
