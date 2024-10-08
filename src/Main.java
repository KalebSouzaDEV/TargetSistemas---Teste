import Exercises.Exercise1;
import Exercises.Exercise2;
import Exercises.Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar a sequência de Fibonacci");
        int numeroEntrada = scanner.nextInt();
        Exercise1.numberInSequence(numeroEntrada);

        scanner.nextLine();

        System.out.println("Digite um texto para verificar");
        String texto = scanner.nextLine();
        System.out.println("Digite uma letra para verificar se possui no texto");
        String letter = scanner.next();
        Exercise2.verifyCharInText(texto, letter);

        Exercise3.resultSOMA();
    }
}