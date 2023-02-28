package controller;

public class Modulos {
	public int calcDigitos (String [] v, int t, int c) {
		if (c == t) { //caso o acumulador c seja igual ao tamanho do vetor gerado por split, retorna c.
			return c;
		} else {
			c++;
			return calcDigitos(v, t, c);
		}
	}
}
