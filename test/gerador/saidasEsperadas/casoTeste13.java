package robosGerados;

import robocode.*;
import java.util.Queue;
import java.util.LinkedList;

public class MisterRobot13 extends Robot {

	public int _addAbs(int a, int b) {
		Queue<Integer> __qTempInt = new LinkedList<>();
		
		if (((a + b) < 0)) {
			__qTempInt.add((-(a + b)));
		}
		else {
			__qTempInt.add((a + b));
		}
		
		return __qTempInt.remove();
	}

	public void init() {
		int a;
		int b;
		a = 41;
		b = 42;
		out.println(_addAbs(a, b));
	}

	public void loop() {
	}

	public void run() {
		init();
		while(true) { loop(); }
	}

}
