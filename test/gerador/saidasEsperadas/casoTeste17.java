package robosGerados;

import robocode.*;
import java.util.Queue;
import java.util.LinkedList;

public class MisterRobot17 extends Robot {

	public int _abs(int a) {
		Queue<Integer> __qTempInt = new LinkedList<>();
		
		if ((a < 0)) {
			__qTempInt.add((-a));
		}
		else {
			__qTempInt.add(a);
		}
		
		return __qTempInt.remove();
	}

	public int _addAbs(int a, int b) {
		return (_abs(a) + _abs(b));
	}

	public void init() {
		Queue<Integer> __qTempInt = new LinkedList<>();
		
		int a;
		int b;
		int c;
		int d;
		a = 41;
		c = 42;
		d = 43;
		if ((c > d)) {
			__qTempInt.add(c);
		}
		else {
			__qTempInt.add(d);
		}
		
		b = __qTempInt.remove();
		out.println((((((("|" + a) + " ") + b) + "|") + " = ") + _addAbs(a, b)));
	}

	public void loop() {
	}

	public void run() {
		init();
		while(true) { loop(); }
	}

}
