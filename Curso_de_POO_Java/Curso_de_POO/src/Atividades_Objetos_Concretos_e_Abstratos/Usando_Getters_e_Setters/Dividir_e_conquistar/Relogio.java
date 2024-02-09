package Atividades_Objetos_Concretos_e_Abstratos.Usando_Getters_e_Setters.Dividir_e_conquistar;

public class Relogio {
    private boolean tela_on_off;
    private boolean botao_a;
    private float bateria;

    public Relogio(boolean tela_on_off, boolean botao_a, float bateria) {
        this.tela_on_off = tela_on_off;
        this.botao_a = botao_a;
        this.bateria = bateria;
    }

    public boolean isTela_on_off() {
        return tela_on_off;
    }

    public void setTela_on_off(boolean tela_on_off) {
        this.tela_on_off = tela_on_off;
    }

    public boolean isBotao_a() {
        return botao_a;
    }

    public void setBotao_a(boolean botao_a) {
        this.botao_a = botao_a;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public void status_tela() {
        if (tela_on_off == true) {
            System.out.println("A tela está ligada");
        } else{
            System.out.println("A tela está desligada");
        }

    }
    public void status_botao_a(){
        if(botao_a==true){
            System.out.println("botão ativado");
        }
    }
}

