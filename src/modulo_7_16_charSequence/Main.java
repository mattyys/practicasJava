package modulo_7_16_charSequence;

public class Main {

	public static void main(String[] args) {

		String frase = "Hola a todo el mundo!!";// se crea frase

		CharSequenceTokio charSequence = new ArrayCharSequenceTokio(frase);// se instancia ArrayCharSequenceTokio y se
		                                                                   // para la frase

		System.out.println(frase);// se imprimi la frase

		System.out.println(charSequence.charAt(7));// imprime el caracter en la posicion dada

		System.out.println(charSequence.length());// imprime la cantidad de elementos(char)

		System.out.println(charSequence.subSequence(7, 21));// imprime una secuencia de caracteres

		System.out.println(charSequence.subSequence(7, 7));// devuelve un ArrayCharSequenceTokio si start == end

		System.out.println(charSequence.subSequence(8, 1));// devuelve null si start > end

		System.out.println(charSequence.subSequence(-1, 21));// devuelve null si start esta fuera de rango

		System.out.println(charSequence.subSequence(7, 24));// devuelve null si end esta fuera de rango

		System.out.println(charSequence.toString());// devuelve un string de ArrayCharSequenceTokio
	}
}
