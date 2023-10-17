package modulo_7_16_charSequence;

public class ArrayCharSequenceTokio implements CharSequenceTokio {

	private char[] cadena;

	public ArrayCharSequenceTokio(String cadena) {
		this.cadena = cadena.toCharArray();
	}

	@Override
	public int length() {
		return cadena.length;
	}

	@Override
	public char charAt(int index) {

		if (index < 0 || index >= cadena.length) {
			return '\0';
		} else {
			return cadena[index];
		}

	}

	@Override
	public CharSequenceTokio subSequence(int start, int end) {
		StringBuilder sequence = new StringBuilder();
		if (start != end) {
			if (start >= 0 && start < cadena.length && end <= cadena.length && end >= start) {
				for (int i = start; i < end; i++) {
					sequence.append(cadena[i]);
				}
			} else {
				return null;
			}
			return new ArrayCharSequenceTokio(sequence.toString());
		} else {
			return new ArrayCharSequenceTokio("");
		}

	}

	@Override
	public String toString() {
		return new String(cadena);
	}

}
