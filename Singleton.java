package JavaPractice;

public class Singleton {
	private static Singleton single_instance = null;
	public String s;

	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}
	public static Singleton Singleton() {
		if (single_instance == null) {
			single_instance = new Singleton();
			return single_instance;
		} else {
			return single_instance;
		}

	}

	static class GFG {
		public static void main(String args[]) {
			Singleton x = Singleton.Singleton();
			System.out.println(x.s);
		}
	}
}
