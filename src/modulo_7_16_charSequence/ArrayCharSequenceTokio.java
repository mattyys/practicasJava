package modulo_7_16_charSequence;

public class ArrayCharSequenceTokio implements CharSequenceTokio {

	private char[] cadena;

	public ArrayCharSequenceTokio(String cadena) {
		this.cadena = cadena.toCharArray();
	}

	@Override
	public int length() {
		int cont = 0;
		for (int i = 0; i < cadena.length; i++) {
			cont++;
		}
		return cont;

	}

	@Override
	public char charAt(int index) {
		char caracter = 0;
		if (index < 0 || index >= cadena.length) {
			return caracter;
		} else {
			for (int i = 0; i < cadena.length; i++) {
				if (i == index)
					caracter = cadena[i];
			}
		}
		return caracter;
	}

	@Override
	public CharSequenceTokio subSequence(int start, int end) {
		String sequence = "";

		if (start >= 0 && start < cadena.length) {
			if (end < cadena.length && end > start) {
				for (int i = 0; i < cadena.length; i++) {
					if (i >= start && i < end)
						sequence += cadena[i];
				}
			}
		}
		CharSequenceTokio charSqT = new ArrayCharSequenceTokio(sequence);
		return charSqT;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (char c : cadena) {
			builder.append(c);

		}
		return builder.toString();
	}

}
