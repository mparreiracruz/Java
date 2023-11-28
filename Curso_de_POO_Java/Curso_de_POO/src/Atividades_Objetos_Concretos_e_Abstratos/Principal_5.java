package Atividades_Objetos_Concretos_e_Abstratos;

import java.util.Scanner;

public class Principal_5 {
    public static void main(String[] args) {
        Fone f1 = new Fone();
        f1.marca = "MPOW FLAMES";

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o volume desejado de 0 à 10: " );
        int volume =  ler.nextInt();
        System.out.println("O seu volume atual é de: " + volume);

        f1.ligar_fone();
        f1.parear_fone();
        f1.info();
    }
}
