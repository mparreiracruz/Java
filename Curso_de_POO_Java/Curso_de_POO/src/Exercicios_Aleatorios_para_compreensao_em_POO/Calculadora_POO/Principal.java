package Exercicios_Aleatorios_para_compreensao_em_POO.Calculadora_POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Soma s1 = new Soma();
        System.out.println("Digite um número: ");
        float n1 = scanner.nextFloat();
        System.out.println("Digite outro número: ");
        float n2 = scanner.nextFloat();


        float resultado_soma = s1.somando(n1, n2);

        System.out.println("A soma dos dois números é: " + resultado_soma);
    }

}
