import robocode.*; 

public class misterRobot extends Robot {

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}	

	void init() {
	}

	void loop() {
		ahead(100);
		turnGunRight(360);
		back(100);
		turnGunRight(360);
	}

	public void run() {
		init();
		while (true) { loop(); }
	}

}
