package Exercises;

//3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
public class Exercise3 {
    public static void resultSOMA(){
        int indice = 12;
        int SOMA = 0;
        int k = 1;
        while (k < indice) {
            k++;
            SOMA = SOMA + k;
        }
        System.out.println("O resultado do exercício 3 é: " + SOMA);
    }
}
