import robocode.*;

public class misterRobot extends Robot {

	public void init() {
		out.println("Hello, World");
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
