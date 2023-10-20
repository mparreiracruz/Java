package Atividades_Objetos_Concretos_e_Abstratos;

public class Relogio {
    //caracteristicas (coisas que ela tem):
    String tela;
    String pulseira;
    String caixa;
    boolean botao_a = true;
    boolean botao_b = true;
    boolean botao_c = true;
    float bateria;
    //métodos (coisas que ela faz):

    void caracteristicas() {
        System.out.println("A tela é " + this.tela);
        System.out.println("A pulseira é de " + this.pulseira);
        System.out.println("A caixa é de " + this.caixa);
        System.out.println("A bateria está com " + this.bateria + "% de carga.");
    }

    void horadodia() {
        System.out.println("Horário: 14:35");
    }

    void cronometro() {
        if (this.botao_a == true) {
            System.out.println("O cronômentro está ativado.");
        } else {
            System.out.println("O cronômetro está parado.");
        }
    }

    void contagemregressiva() {
        if (this.botao_b==true) {
            System.out.println("A contagem regressiva está ativada.");
        } else {
            System.out.println("A contagem regressiva está desativada.");
        }
    }

    void horamundial() {
        if (this.botao_c==true) {
            System.out.println("São 19:35 na Alemanha");
        } else {
            System.out.println("Hora mundial desativada.");
        }
    }
}