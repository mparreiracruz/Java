package POO_03b_Configurando_Visibilidade_de_Atributos_e_Metodos;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uso caneta " + this.cor);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("Porcetagem da carga: " + this.carga + "%");
        System.out.println("Está tampada ? " + this.tampada);

    }
    protected void rabiscar() {
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}