import robocode.*;

public class misterRobot extends Robot {

	public int _soma(int a, int b) {
		return a + b;
	}

	public void printSoma(int a, int b) {
		out.println(_soma(a,b));
	}

	public void init() {
		printSoma(1,2);
	}

	public void loop() {
	}

	public void run() {
		init();
		while(true) { loop(); }
	}

}
