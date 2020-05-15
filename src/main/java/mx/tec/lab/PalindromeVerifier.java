package mx.tec.lab;

public class PalindromeVerifier {

	public static boolean verify(String input) {
		String inputAux = input.replaceAll("\\s", "");
		StringBuilder builder = new StringBuilder();
		builder.append(inputAux);
		builder.reverse();
		return builder.toString().equals(inputAux);
	}
}
