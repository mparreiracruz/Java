package Atividades_Objetos_Concretos_e_Abstratos;

public class Estante {
    private String modelo;
    public String cor;
    protected boolean abrir;

    private String getModelo(){
        return this.modelo;
    }
    private void setModelo(String m){
        this.modelo = m;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    protected boolean getAbrir(){
        return this.abrir;
    }
    protected void setAbrir(boolean a){
        this.abrir = a;
    }
}
