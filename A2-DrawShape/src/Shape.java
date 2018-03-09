import java.util.ArrayList;

public class Shape {
	static final int minWidthCm = 30;
	static final int maxWidthCm = 90;
	
	static final int minHeightCm = 30;
	static final int maxHeightCm = 90;
	
	int width;
	int height;
	double timeToDraw;
	static final int drawSpeed = 40;
	
	static final double multipler = 0.2; // Used to determine how long to draw.
	static ArrayList<String> shapesDrawn = new ArrayList<String>();
	
	Shape(int widthCm, int heightCm) throws ShapeException {
		if (widthCm >= minWidthCm && widthCm <= maxWidthCm) {
			this.width = widthCm;
		} else {
			throw new ShapeException("The width must be between " + minWidthCm + " and " + maxWidthCm + ". You entered the value " + widthCm);
		}
		
		if (heightCm >= minHeightCm && heightCm <= maxHeightCm) {
			this.height = heightCm;
		} else {
			throw new ShapeException("The height must be between " + minHeightCm + " and " + maxHeightCm + ". You entered the value " + heightCm);
		}
	}
	
	public static int[] GetMeasurements() {
		int[] measurements = new int[2];
		
		System.out.print("Width: ");
		int width = Main.scan.nextInt();
		System.out.print("Height: ");
		int height = Main.scan.nextInt();
		
		measurements[0] = width;
		measurements[1] = height;
		
		return measurements;
	}
}
