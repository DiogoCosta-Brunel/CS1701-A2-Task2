public class Rectangle extends Shape {

	Rectangle(int widthCm, int heightCm) throws ShapeException {
		super(widthCm, heightCm);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		timeToDraw = (multipler * height) * 1000;
		Main.myFinch.setWheelVelocities(drawSpeed, drawSpeed, (int)timeToDraw + 1000);
		turnRight();
		
		// Draw width
		timeToDraw = (multipler * width) * 1000;
		Main.myFinch.setWheelVelocities(drawSpeed, drawSpeed, (int)timeToDraw);
		turnRight();
		
		// Draw height again
		timeToDraw = (multipler * height) * 1000;
		Main.myFinch.setWheelVelocities(drawSpeed, drawSpeed, (int)timeToDraw + 1000);
		turnRight();
		
		// Draw width
		timeToDraw = (multipler * width) * 1000;
		Main.myFinch.setWheelVelocities(drawSpeed, drawSpeed, (int)timeToDraw);
	}
	
	public void turnRight() {
		Main.myFinch.setWheelVelocities(150, -75, 1000);
	}
	
	public void turnLeft() {
		Main.myFinch.setWheelVelocities(-75, 150, 1000);
	}
}
