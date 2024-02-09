package Exercicios_Aleatorios_para_compreensao_em_POO;

public class CalculadoraEstruturada {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int resultadoSoma = somar(5, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);

        int resultadoSubtracao = subtrair(8, 4);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        int resultadoMultiplicacao = multiplicar(3, 2);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
    }
}
