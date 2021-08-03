import java.util.ArrayList;

public class MouseInteractions {
	private int xLoc, yLoc;
	public ArrayList<Integer> xClicks = new ArrayList<Integer>();
	public ArrayList<Integer> yClicks = new ArrayList<Integer>();

	public MouseInteractions() {
		xLoc = 0;
		yLoc = 0;
	}

	public void checkClick(int x, int y) {
		xLoc = x;
		yLoc = y;
		xClicks.add(xLoc);
		yClicks.add(yLoc);
		if (xClicks.size() > 3) {
			xClicks.remove(0);
			yClicks.remove(0);
		}
	}

	private boolean checkHitRect(int x, int y, int width, int height) {
		if (xLoc <= x + width && xLoc >= x) {
			if (yLoc <= y + height && yLoc >= y) {
				return true;
			}
		}
		return false;
	}

	private void checkState100() {
		if (checkHitRect(20, 20, 250, 75)) {
		}
	}

	private void checkState101() {
	}
}
