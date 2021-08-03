
public class ImportantMethods {

	public void startGame() {
		Main.game = new Main();
		Main.game.m = new Map();
		Main.game.a = new Animations();
		Main.game.a.loadImages();
		Main.game.s = new Screen();
		Main.game.s.setFrame();
		Main.game.p = new Player();
		Main.game.bm = new BattleMechanics();
	}

	public void tick() {
		Main.game.p.tick++;
		Main.game.p.walk();
		Main.game.bm.createParryCircle();
		Main.game.bm.updateParryCircle();
	}
}
