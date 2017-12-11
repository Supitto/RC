package robosGerados;

import robocode.*;

public class misterRobot extends Robot {

	public void printNum(int numA, int numB) {
		numB = numA;
		out.println(numB);
	}

	public void init() {
		out.println("Hello, World");
		printNum(42, 43);
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
