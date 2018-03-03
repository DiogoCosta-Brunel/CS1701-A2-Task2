
public class Triangle {
	
	double angleA, angleB, angleC;
	int sideA, sideB, sideC;

	public Triangle(int sideA, int sideB, int sideC) throws ShapeException {
		// TODO Auto-generated constructor stub
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		
		boolean validTriangle = checkValidity();
		System.out.println(validTriangle);
	}
	
	public void draw() {
		
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
	
	boolean checkValidity() {
		angleC = Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB)));
		angleA = Math.toDegrees(Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)));
		angleB = Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)));
		
		System.out.println(angleC + " " + angleA + " " + angleB);
		System.out.println(angleC + angleA + angleB);
		
		if ((angleA + angleB + angleC) == 180) {
			return true;
		} else {
			return false;
		}
	}

}
