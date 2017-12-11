package robosGerados;

import robocode.*;

public class misterRobot extends Robot {

	public int _soma(int a, int b, int c) {
		return (a + (b + c));
	}

	public void printSoma(int a, int b, int c) {
		out.println(_soma(a, b, c));
	}

	public void init() {
		int soma;
		soma = (_soma(1, 2, 3) + (4 + 5));
		printSoma(soma, 6, 7);
	}

	public void loop() {
	}

	public void run() {
		init();
		while(true) { loop(); }
	}

}
