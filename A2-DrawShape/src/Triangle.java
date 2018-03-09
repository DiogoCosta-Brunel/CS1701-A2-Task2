
public class Triangle extends Shape {
	
	double angleA, angleB, angleC;
	int sideA, sideB, sideC;
	static final int minCm = 30, maxCm = 90;

	public Triangle(int sideA, int sideB, int sideC) throws ShapeException {
		super(sideA, sideB);
		if (sideA >= minCm && sideA <= maxCm) {
			this.sideA = sideA;
		} else {
			throw new ShapeException("Side A must be between " + minCm + " and " + maxCm + ". You entered the value " + sideA);
		}
		
		if (sideB >= minCm && sideB <= maxCm) {
			this.sideB = sideB;
		} else {
			throw new ShapeException("Side B must be between " + minCm + " and " + maxCm + ". You entered the value " + sideB);
		}
		
		if (sideC >= minCm && sideC <= maxCm) {
			this.sideC = sideC;
		} else {
			throw new ShapeException("Side B must be between " + minCm + " and " + maxCm + ". You entered the value " + sideC);
		}
		
		boolean validTriangle = checkValidity();
		if (validTriangle) {
			draw();
		}
	}
	
	public void draw() {
		timeToDraw = (multipler * height) * 1000;
		Main.myFinch.setWheelVelocities(drawSpeed, drawSpeed, (int)timeToDraw + 1000);
		Main.myFinch.setWheelVelocities(255, 0, 1000);
		Main.myFinch.setWheelVelocities(drawSpeed, drawSpeed, (int)timeToDraw + 1000);
		Main.myFinch.setWheelVelocities(150, -75, 1000);
		Main.myFinch.setWheelVelocities(drawSpeed, drawSpeed, (int)timeToDraw + 1000);
	}
	
	// Overriding the Shape method
	public static int[] GetMeasurements() {
		int[] measurements = new int[3];
		
		System.out.print("Side A: ");
		int sideA = Main.scan.nextInt();
		System.out.print("Side B: ");
		int sideB = Main.scan.nextInt();
		System.out.print("Side C: ");
		int sideC = Main.scan.nextInt();
		
		measurements[0] = sideA;
		measurements[1] = sideB;
		measurements[2] = sideC;
		
		return measurements;
	}
	
	boolean checkValidity() throws ShapeException {
		angleC = Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB)));
		angleA = Math.toDegrees(Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)));
		angleB = Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)));
		
		angleC = (int) angleC;
		angleA = (int) angleA;
		angleB = (int) angleB;
		
		System.out.println(angleA + angleB + angleC);
		
		if ((angleA + angleB + angleC) == 180) {
			return true;
		} else {
			throw new ShapeException("Not a valid triangle!");
		}
	}

}
