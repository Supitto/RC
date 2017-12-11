import robocode.*;
import java.util.Queue;
import java.util.LinkedList;

public class misterRobot extends Robot {

	public int _addAbs(int a, int b) {
		Queue<Integer> __qTempInt = new LinkedList<>();
		
		if ((a < 0)) {
			if ((b < 0)) {
				__qTempInt.add((-b));
			}
			else {
				__qTempInt.add(b);
			}
			
			__qTempInt.add(((-a) + __qTempInt.remove()));
		}
		else {
			if ((b < 0)) {
				__qTempInt.add((-b));
			}
			else {
				__qTempInt.add(b);
			}
			
			__qTempInt.add((a + __qTempInt.remove()));
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
