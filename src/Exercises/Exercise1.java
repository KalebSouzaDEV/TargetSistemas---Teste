package Exercises;


//1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
// ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
public class Exercise1 {
    public static void numberInSequence(int numeroEntrada) {
        int n1 = 0;
        int n2 = 1;
        int n3 = (n1 + n2);

        while(numeroEntrada > n3) {
            n3 = (n1 + n2);
            n1 = n2;
            n2 = n3;
        }
        if (numeroEntrada == n3 || numeroEntrada == 0) {
            System.out.println("O número " + numeroEntrada + " está na sequência");
        } else {
            System.out.println("O número " + numeroEntrada + " não está na sequência");
        }

    }
}
