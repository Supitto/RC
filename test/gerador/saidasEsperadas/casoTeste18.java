package robosGerados;

import robocode.*; 

public class MisterRobot18 extends Robot {

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
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
