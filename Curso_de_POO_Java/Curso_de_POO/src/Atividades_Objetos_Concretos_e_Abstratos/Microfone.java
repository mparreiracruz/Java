package Atividades_Objetos_Concretos_e_Abstratos;

public class Microfone {
    //caracteristicas (coisas que ela tem):
    String base;
    float fio;
    String haste;
    boolean botao;
    void caracteristicas(){
        System.out.println("A base do microfone é: " + this.base);
        System.out.println("O fio mede:  " + this.fio + " metros.");
        System.out.println("A haste é feita de: " + this.haste);
    }

    void capturar_audio(){
        if(this.botao == true) {
            System.out.println("O botão está ligado");
        } else {
                System.out.println("O botão está desligado.");
            }
        }

    void ligado (){
        this.botao = false;
    }
}
