package br.letscode.bancobrasil.locadora.decorator;

public class StringVersao2 implements CharSequence {

    private String str;

    public StringVersao2(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        str.charAt(index);
        //fazer alguma coisa
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
