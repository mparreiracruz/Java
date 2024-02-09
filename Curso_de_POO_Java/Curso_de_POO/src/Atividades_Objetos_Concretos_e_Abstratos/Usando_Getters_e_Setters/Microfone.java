package Atividades_Objetos_Concretos_e_Abstratos.Usando_Getters_e_Setters;

/*objeto concreto:
 >microfone

 caracteristicas (coisas que ela tem):
 >base
 >fio
 >haste

 métodos (coisas que ela faz):
 >captação de audio

 estados:
 >ligado
 >desligado
*/
public class Microfone {
    public String base_tipo;
    private String fio_tipo;
    private String haste_tipo;
    public boolean microfone_on_off;
    private boolean captacao_de_audio;
    public Microfone(String base_tipo, String fio_tipo, String haste_tipo, boolean microfone_on_off, boolean captacao_de_audio) {
        this.base_tipo = base_tipo;
        this.fio_tipo = fio_tipo;
        this.haste_tipo = haste_tipo;
        this.microfone_on_off = microfone_on_off;
        this.captacao_de_audio = captacao_de_audio;
    }

    public String getBase_tipo() {
        return base_tipo;
    }

    public void setBase_tipo(String base_tipo) {
        this.base_tipo = base_tipo;
    }

    public String getFio_tipo() {
        return fio_tipo;
    }

    public void setFio_tipo(String fio_tipo) {
        this.fio_tipo = fio_tipo;
    }

    public String getHaste_tipo() {
        return haste_tipo;
    }

    public void setHaste_tipo(String haste_tipo) {
        this.haste_tipo = haste_tipo;
    }

    public boolean isMicrofone_on_off() {
        return microfone_on_off;
    }

    public void setMicrofone_on_off(boolean microfone_on_off) {
        this.microfone_on_off = microfone_on_off;
    }

    public boolean isCaptacao_de_audio() {
        return captacao_de_audio;
    }

    public void setCaptacao_de_audio(boolean captacao_de_audio) {
        this.captacao_de_audio = captacao_de_audio;
    }

    public void captacao_de_audio(){
        if(microfone_on_off==true){
            System.out.println("O microfone está ativado e captando áudio");
        }
        else {
            System.out.println("O microfone está desativado");
        }
    }

    public void status_microfone(){
        System.out.println("O microfone tem a base" + getBase_tipo());
        System.out.println("O fio é de " + getFio_tipo());
        System.out.println("A haste é de "+ getHaste_tipo());
        System.out.println("A captação de áudio está: " + isCaptacao_de_audio());

    }
}
