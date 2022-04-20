package example.gangan.Bo;

public abstract class MyDisplay {
	public void display(){
		getCar().display();
	}

	public abstract Car getCar();
}
