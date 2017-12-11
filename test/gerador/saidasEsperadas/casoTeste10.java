package robosGerados;

import robocode.*;

public class MisterRobot10 extends Robot {

	public double _dist(float x1, float x2, float y1, float y2) {
		return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
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
