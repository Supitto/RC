package robosGerados;

import robocode.*;

public class misterRobot extends Robot {

	public double _sqDiff(int a, int b) {
		return Math.pow((a - b), 2);
	}

	public double _dist(int x1, int x2, int y1, int y2) {
		return Math.sqrt((_sqDiff(x2, x1) + _sqDiff(y2, y1)));
	}

	public String _pontoToLiteral(int a, int b) {
		return (((("(" + a) + ", ") + b) + ")");
	}

	public void init() {
		int xp;
		int yp;
		xp = 41;
		yp = 42;
		dist = _dist(getX(), getY(), xp, yp);
		out.println(((("Distancia para o ponto" + _pontoToLiteral(xp, yp)) + " = ") + dist));
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
