package Atividades_Objetos_Concretos_e_Abstratos.Usando_Getters_e_Setters;
/*
* 1)objeto concreto:
 >relogio

 caracteristicas (coisas que ela tem):
 >tela
 >pulseira
 >caixa
 >butões
 >bateria

 métodos (coisas que ela faz):
 >hora do dia
 >cronômetro
 >contagem regressiva
 >hora mundial

 estados:
 >ligado
 >desligado
 >luz acessa
 >luz desligada
* */
public class Relogio {
   private String tela_tipo;
   private boolean tela_on_off;
   public int tela_tempo;
   public String pulseira;
   public String caixa;
   private boolean botao_a;
   private boolean botao_b;
   private boolean botao_c;
   private boolean botao_d;
   public float bateria;

    public Relogio(String tela_tipo, boolean tela_on_off,int tela_tempo, String pulseira, String caixa, boolean botao_a, boolean botao_b, boolean botao_c, boolean botao_d, float bateria) {
        this.tela_tipo = tela_tipo;
        this.tela_on_off = tela_on_off;
        this.tela_tempo = tela_tempo;
        this.pulseira = pulseira;
        this.caixa = caixa;
        this.botao_a = botao_a;
        this.botao_b = botao_b;
        this.botao_c = botao_c;
        this.botao_d = botao_d;
        this.bateria = bateria;
    }

    public String getTela_tipo() {
        return tela_tipo;
    }

    public void setTela_tipo(String tela_tipo) {
        tela_tipo = tela_tipo;
    }

    public boolean isTela_on_off() {
        return tela_on_off;
    }

    public void setTela_on_off(boolean tela_on_off) {
        tela_on_off = tela_on_off;
    }

    public int getTela_tempo() {
        return tela_tempo;
    }

    public void setTela_tempo(int tela_tempo) {
        tela_tempo = tela_tempo;
    }

    public String getPulseira() {
        return pulseira;
    }

    public void setPulseira(String pulseira) {
        this.pulseira = pulseira;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    public boolean isBotao_a() {
        return botao_a;
    }

    public void setBotao_a(boolean botao_a) {
        this.botao_a = botao_a;
    }

    public boolean isBotao_b() {
        return botao_b;
    }

    public void setBotao_b(boolean botao_b) {
        this.botao_b = botao_b;
    }

    public boolean isBotao_c() {
        return botao_c;
    }

    public void setBotao_c(boolean botao_c) {
        this.botao_c = botao_c;
    }

    public boolean isBotao_d() {
        return botao_d;
    }

    public void setBotao_d(boolean botao_d) {
        this.botao_d = botao_d;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public void status_botoes(){
        if(botao_a = false){
            System.out.println("Botão A ativado");
        }
        else {
            System.out.println("Botão A desativado");
        }
    }

    public void tela_tempo(){
        if(tela_tempo > 30){
            System.out.println("Tela desligando");
        }
    }
    public void status_relogio(){
        System.out.println("Informações do relógio:");
        System.out.println("A tela está: "+ getTela_tempo());
        System.out.println("A tela é do tipo: " + getTela_tipo());
        System.out.println("A pulseira é do material: " + getPulseira());

    }
}
