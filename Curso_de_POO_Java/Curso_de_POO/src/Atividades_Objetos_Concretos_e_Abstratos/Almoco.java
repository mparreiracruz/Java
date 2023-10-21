package Atividades_Objetos_Concretos_e_Abstratos;
/*objeto abstrato;
 >preparar almoço

 caracteristicas (coisas que ela tem):
 >alimentos
 >prato
 >garfo
 >faca

 métodos (coisas que ela faz):
 >saciedade
 >nutrição

 estados:
 >ligar fogão
 >desligar fogão
*/
public class Almoco {
    String alimento;
    String prato;
    String garfo;
    String faca;
    boolean fome;
    void caracteristicas_4() {
        System.out.println("Eu vou comer: " + this.alimento);
        System.out.println("O meu prato é de: " + this.prato);
        System.out.println("O meu garfo é de: " + this.garfo);
        System.out.println("A minha faca é de: " + this.faca);
    }void estados_4() {
        if (this.fome == true) {
            System.out.println("Estou saciado.");
        }else{
            System.out.println("Estou com fome.");
            }
        }
        void comendo(){
        this.fome = false;
    }
    }