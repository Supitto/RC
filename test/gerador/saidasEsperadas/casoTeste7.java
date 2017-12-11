package robosGerados;

import robocode.*;

public class MisterRobot7 extends Robot {

	public double _sqDiff(float a, float b) {
		return Math.pow((a - b), 2);
	}

	public double _dist(float x1, float x2, float y1, float y2) {
		return Math.sqrt((_sqDiff(x2, x1) + _sqDiff(y2, y1)));
	}

	public void init() {
		int xp;
		int yp;
		xp = 41;
		yp = 42;
		dist = _dist(getX(), getY(), xp, yp);
		out.println(dist);
	}

	public void loop() {
		ahead(100);
		turnGunRight(180);
		ahead(100);
		turnGunRight(180);
	}

	public void run() {
		init();
		while(true) { loop(); }
	}

}
