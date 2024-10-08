package Exercises;

//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
// seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
public class Exercise2 {
    public static void verifyCharInText(String texto, String letter){
        int quantityLetters = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (String.valueOf(texto.charAt(i)).equalsIgnoreCase(letter)) {
                quantityLetters++;
            }
        }
        System.out.println("A letra " + letter + " apareceu " + quantityLetters + " vezes");
    }
}
