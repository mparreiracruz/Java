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
    public String hora_do_dia;
    public String hora_mundial;
    private boolean tela_on_off;
    public String pulseira;
    private boolean botoes_on_off;
    public int bateria;
    private boolean relogio_on_off;



    public Relogio(Boolean relogio_on_off, boolean botoes_on_off, String pulseira, String hora_do_dia, String hora_mundial, int bateria){
    this.hora_do_dia = hora_do_dia;
    this.hora_mundial = hora_mundial;
    this.tela_ligada();
    this.relogio_ligado();
    this.botao_ligado();
    this.pulseira = pulseira;
    this.bateria = bateria;
    }
    private void tela_ligada(){
        this.tela_on_off = true;
    }
    private void tela_desligada(){
        this.tela_on_off = false;
    }
    private void relogio_ligado(){
        this.relogio_on_off = true;
    }

    private void relogio_desligado(){
        this.relogio_on_off = false;
    }
    private void botao_ligado() {
        this.botoes_on_off = true;
    }
    public boolean gettTela_on_off() {
        return tela_on_off;
    }

    public void setTela_on_off(boolean tela_on_off) {
        this.tela_on_off = tela_on_off;
    }

    public String getPulseira() {
        return pulseira;
    }

    public void setPulseira(String pulseira) {
        this.pulseira = pulseira;
    }

    public boolean getBotoes_on_off() {
        return botoes_on_off;
    }

    public void setBotoes_on_off(boolean botoes_on_off) {
        this.botoes_on_off = botoes_on_off;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    public boolean getRelogio_on_off() {
        return relogio_on_off;
    }
    public void setRelogio_on_off(boolean relogio_on_off){
        this.relogio_on_off = relogio_on_off;
    }

    public void status(){
        System.out.println("Status do Relógio");
        System.out.println("são exatamente: " + hora_do_dia);
        System.out.println("Hora na Alemanha: " );
        System.out.println("O relógio está ativado ?" + this.getRelogio_on_off());
        System.out.println("A tela está ativada ?" + this.gettTela_on_off());
        System.out.println("A pulseira é de " + this.getPulseira());
        System.out.println("O botão está ativado ?" + this.getBotoes_on_off());
        System.out.println("A bateria está em " + this.getBateria() + "%");

    }
}
