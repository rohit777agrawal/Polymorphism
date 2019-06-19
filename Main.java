class Car {
	
	private String name;
	private boolean engine;
	private int cylinder;
	private int wheel;
	
	public Car(String name, int cylinder) {
		this.name = name;
		this.cylinder = cylinder;
		this.wheel= 4;
		this.engine = true;
	}

	public String getName()
	{
		return name;
	}

	public int getCylinder() {
		return cylinder;
	}
	
	public String startEngine()
	{
		return "Car starting";
	}
	
	public String accelerate()
	{
		return "Car accelerate";
	}
	
	public String stop()
	{
		return "Car stopped";
	}
	
}

class Ford extends Car
{

	public Ford(String name, int cylinder) {
		super(name, cylinder);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Ford starting";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Ford accelerate";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Ford stopped";
	}	
	
}

public class Main {
	
	public static void main(String[] args)
	{
		Car car = new Car("Base car", 3);
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.stop());
		
		
		Ford ford = new Ford("Explorer", 7);
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.stop());
	}

}

