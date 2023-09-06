package Factory;

public class Factory {

	public Shape getShape(String ShapeType) {
		if(ShapeType == null) {
			return null;
		}
		
		if(ShapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if(ShapeType.equalsIgnoreCase("square")) {
			return new square();
		}
		return null;
		
		
	}
	

}
