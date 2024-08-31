
public class BirdApp {

	public static void main(String[] args) {
		Sky sky = new Sky();
		sky.acceptBird(new GoldenEagle());
		sky.acceptBird(new SerpantEagle());
		sky.acceptBird(new VegSparrow());
		sky.acceptBird(new NonVegSparrow());
	}

}
