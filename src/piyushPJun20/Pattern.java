package piyushPJun20;

public class Pattern {

	void patternprint(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length() - i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Pattern().patternprint("Globant");
	}
}
