public class PlayerMethods {

	public PlayerMethods() {

	}

	public void wu() {
		Main.game.p.walkingUp = true;
	}

	public void wd() {
		Main.game.p.walkingDown = true;
	}

	public void wl() {
		Main.game.p.walkingLeft = true;
	}

	public void wr() {
		Main.game.p.walkingRight = true;
	}

	public void wuRelease() {
		Main.game.p.walkingUp = false;
	}

	public void wdRelease() {
		Main.game.p.walkingDown = false;
	}

	public void wlRelease() {
		Main.game.p.walkingLeft = false;
	}

	public void wrRelease() {
		Main.game.p.walkingRight = false;
	}
}