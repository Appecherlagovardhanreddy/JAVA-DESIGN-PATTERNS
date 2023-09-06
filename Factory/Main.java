package Factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Factory Factory = new Factory();
			Shape s = Factory.getShape("Rectangle");
			s.draw();
	
        
	}

}
