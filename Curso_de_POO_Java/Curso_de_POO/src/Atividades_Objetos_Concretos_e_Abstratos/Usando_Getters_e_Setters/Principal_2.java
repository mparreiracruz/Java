package Atividades_Objetos_Concretos_e_Abstratos.Usando_Getters_e_Setters;
/*
 objeto concreto:
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
* */
public class Principal_2 {
    public static void main(String[] args) {
        Microfone m1 = new Microfone("redonda", "revestimento de cobre", "plástico", false, false);
        m1.status_microfone();
        m1.captacao_de_audio();
    }
}
