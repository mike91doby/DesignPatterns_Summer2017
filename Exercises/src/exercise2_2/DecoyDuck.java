package exercise2_2;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("look's like a decoy duck");
	}
}
