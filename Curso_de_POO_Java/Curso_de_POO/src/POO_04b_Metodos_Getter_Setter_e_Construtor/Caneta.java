package POO_04b_Metodos_Getter_Setter_e_Construtor;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private boolean destampada;
    private String cor;

    public Caneta(String modelo, float ponta, boolean tampada, boolean destampada, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.destampada = destampada;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public boolean isDestampada() {
        return destampada;
    }

    public void setDestampada(boolean destampada) {
        this.destampada = destampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}