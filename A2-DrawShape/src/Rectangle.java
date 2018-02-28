public class Rectangle extends Shape {

	Rectangle(int widthCm, int heightCm) throws ShapeException {
		super(widthCm, heightCm);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		timeToDraw = (multipler * height) * 1000;
		Main.myFinch.setWheelVelocities(40, 40, (int)timeToDraw + 1000);
		Main.myFinch.setWheelVelocities(125, 0, 1000);
		
		// Draw backwards
		Main.myFinch.setWheelVelocities(-40, -40, 3550);
		
		// Draw width
		timeToDraw = (multipler * width) * 1000;
		Main.myFinch.setWheelVelocities(40, 40, (int)timeToDraw);
		
		// Turn
		Main.myFinch.setWheelVelocities(125, 0, 1000);
		
		// Draw backwards
		Main.myFinch.setWheelVelocities(-40, -40, 3550);
		
		// Draw height again
		timeToDraw = (multipler * height) * 1000;
		Main.myFinch.setWheelVelocities(40, 40, (int)timeToDraw + 1000);
		
		// Turn
		Main.myFinch.setWheelVelocities(125, 0, 1000);
		
		// Draw backwards
		Main.myFinch.setWheelVelocities(-40, -40, 3550);
		
		// Draw width
		timeToDraw = (multipler * width) * 1000;
		Main.myFinch.setWheelVelocities(40, 40, (int)timeToDraw);
	}
}
