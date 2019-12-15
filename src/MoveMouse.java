import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

public class MoveMouse {
	public static final int WAIT_MIN = 1; // change this to modify waiting time
	public static final int WAIT_MILLISEC = 1000; // min * 60 s/min * 1000 ms/s
	public static final int MOVE_BY_PIXEL = 1; // in pixel

	public static void main(String... args) throws Exception {

		Robot robot = new Robot();
		PointerInfo pointerInfo;
		while (true) {
			pointerInfo = MouseInfo.getPointerInfo();
			Point p = pointerInfo.getLocation();

			int x = (int) p.getX();
			int y = (int) p.getY();

			robot.mouseMove(x + MOVE_BY_PIXEL, y);
			robot.mouseMove(x - MOVE_BY_PIXEL, y); 
			Thread.sleep(WAIT_MILLISEC);


		}
	}
}
