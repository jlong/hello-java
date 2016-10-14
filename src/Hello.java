
public class Hello {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.printf("Hello %s!", args[0]);
		} else {
			System.out.println("Hello world!");
		}
	}

}
