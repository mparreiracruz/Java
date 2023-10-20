package POO_2b_Criando_Classes_e_Objetos_em_Java;

public class Caneta {
    String modelo;
    String cor;
    float ponta;

    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uso caneta " + this.cor);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("Porcetagem da carga: " + this.carga + "%");
        System.out.println("Está tampada ? " + this.tampada);

    }
    void rabiscar() {
  
    }

    void tampar() {

    }

    void destampar() {

    }
}





