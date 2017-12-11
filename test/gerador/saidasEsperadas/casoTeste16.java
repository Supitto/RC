package robosGerados;

import robocode.*;
import java.util.Queue;
import java.util.LinkedList;

public class misterRobot extends Robot {

	public int _addAbs(int a, int b) {
		Queue<Integer> __qTempInt = new LinkedList<>();
		Queue<Boolean> __qTempBoolean = new LinkedList<>();
		
		if ((a < 0)) {
			__qTempBoolean.add(true);
		}
		else {
			__qTempBoolean.add(false);
		}
		
		if ((__qTempBoolean.remove() == true)) {
			if ((b < 0)) {
				__qTempBoolean.add(true);
			}
			else {
				__qTempBoolean.add(false);
			}
			
			if ((__qTempBoolean.remove() == true)) {
				__qTempInt.add(((-a) + (-b)));
			}
			else {
				__qTempInt.add(((-a) + b));
			}
			
			__qTempInt.add(__qTempInt.remove());
		}
		else {
			if ((b < 0)) {
				__qTempBoolean.add(true);
			}
			else {
				__qTempBoolean.add(false);
			}
			
			if ((__qTempBoolean.remove() == true)) {
				__qTempInt.add((a + (-b)));
			}
			else {
				__qTempInt.add((a + b));
			}
			
			__qTempInt.add(__qTempInt.remove());
		}
		
		return __qTempInt.remove();
	}

	public void init() {
		int a;
		int b;
		a = 41;
		b = 42;
		out.println((((((("|" + a) + " ") + b) + "|") + " = ") + _addAbs(a, b)));
	}

	public void loop() {
	}

	public void run() {
		init();
		while(true) { loop(); }
	}

}
