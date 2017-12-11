package robosGerados;

import robocode.*;
import java.util.Queue;
import java.util.LinkedList;

public class MisterRobot11 extends Robot {

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
