
public class Application {
	
	public static void main(String[] args) {
		Animal shaggy = new Dog();
		shaggy.setName("Shaggy");
		System.out.println(shaggy.getSound());
		shaggy.tryToFly();

		Animal tweety = new Bird();
		tweety.setName("Tweety");
		System.out.println(tweety.getSound());
		tweety.tryToFly();
		
	}

}