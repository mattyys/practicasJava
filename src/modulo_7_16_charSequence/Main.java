package modulo_7_16_charSequence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Hola a todo el mundo!!";
		CharSequenceTokio charSequence = new ArrayCharSequenceTokio(frase);

		System.out.println(frase);
		System.out.println(charSequence.charAt(7));
		System.out.println(charSequence.length());
		System.out.println(charSequence.subSequence(7, 21));
		System.out.println(charSequence.toString());
	}
}
