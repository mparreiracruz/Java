package POO_2b_Criando_Classes_e_Objetos_em_Java;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private int carga;
    protected boolean tampada;
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uso caneta " + this.cor);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("Porcetagem da carga: " + this.carga + "%");
        System.out.println("Está tampada ? " + this.tampada);

    }
    public void rabiscar() {
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}