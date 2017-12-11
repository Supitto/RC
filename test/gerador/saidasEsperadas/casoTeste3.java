package robosGerados;

import robocode.*;

public class MisterRobot3 extends Robot {

	public void printNum(int num) {
		out.println(num);
	}

	public void init() {
		out.println("Hello, World");
		printNum(42);
	}

	public void loop() {
		ahead(100);
		turnGunRight(360);
		back(100);
		turnGunRight(360);
	}

	public void run() {
		init();
		while(true) { loop(); }
	}

}
