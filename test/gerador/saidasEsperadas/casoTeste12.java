package robosGerados;

import robocode.*;
import java.util.Queue;
import java.util.LinkedList;

public class MisterRobot12 extends Robot {

	public int _addAbs(int a, int b) {
		Queue<Integer> __qTempInt = new LinkedList<>();
		
		if ((a < 0)) {
			__qTempInt.add((-a));
		}
		else {
			__qTempInt.add(a);
		}
		
		if ((b < 0)) {
			__qTempInt.add((-b));
		}
		else {
			__qTempInt.add(b);
		}
		
		return (__qTempInt.remove() + __qTempInt.remove());
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
