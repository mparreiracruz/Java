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
public class Principal {
    public static void main(String[] args) {
        Relogio r1 = new Relogio(true, true, "couro", "16:27", "20:27", 43);
        r1.status();
    }
}
