
public class BattleMechanics {

	public double circleX, circleY;
	public double circleWidth, circleHeight;
	public double randX, randY;
	public int parryCounter = 0;
	public int parryCheck = 0;
	public boolean createdCircle = false;
	public boolean permaloss = false;

	public BattleMechanics() {

	}

	public void createParryCircle() {
		if (!createdCircle && !permaloss && Main.game.gs == Main.GAMESTATE.battle) {
			randX = Math.random() * 800 + 200;
			randY = Math.random() * 600 + 100;
			circleWidth = 100;
			circleHeight = circleWidth;
			createdCircle = true;
			parryCheck = 0;
		}
	}

	public void updateParryCircle() {
		if (!permaloss && createdCircle && circleWidth > 64 && Main.game.gs == Main.GAMESTATE.battle) {
			circleWidth--;
			circleHeight--;
			circleX = randX - circleWidth / 2 + 32;
			circleY = randY - circleWidth / 2 + 32;
		} else {
			if (parryCheck == 0 && Main.game.gs == Main.GAMESTATE.battle) {
				permaloss = true;
			}
			createdCircle = false;
		}
	}

	public void checkParry(int x, int y) {
		double x2 = x * 1.0;
		double y2 = y * 1.0;
		double temp = x2 - (randX + 32);
		double temp2 = y2 - (randY + 32);
		double temp3 = temp * temp + temp2 * temp2;
		int i = (int) Math.sqrt(temp3);
		System.out.println(i);
		if (i <= circleWidth / 2 && i >= 0 && parryCheck == 0) {
			parryCounter++;
			parryCheck++;
		}
	}

}
