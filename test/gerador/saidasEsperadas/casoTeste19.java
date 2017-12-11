package robosGerados;

import robocode.*; 

public class MisterRobot19 extends Robot {

	public void onScannedRobot(ScannedRobotEvent e) {
		int power;
		power = 1;
		fire(power);
	}	

	public void init() {
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
