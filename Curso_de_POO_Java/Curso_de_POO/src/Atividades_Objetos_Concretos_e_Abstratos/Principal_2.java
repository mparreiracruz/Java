package Atividades_Objetos_Concretos_e_Abstratos;
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

 2) objeto abstrato;
 >tomar banho

  caracteristicas (coisas que ela tem):
  >box
  >ducha
  >torneira
  >ralo

  métodos (coisas que ela faz):
  >higiene
  >massagem
  >molhar

  estados:
  >abrir box
  >fechar box
  >abrir torneira
  >fechar torneira


  objeto abstrato;
  >preparar almoço

  caracteristicas (coisas que ela tem):
  >alimentos
  >prato
  >garfo
  >faca

  métodos (coisas que ela faz):
  >saciedade
  >nutrição

  estados:
  >ligar fogão
  >desligar fogão
* */
public class Principal_2 {
    public static void main(String[] args) {
        Microfone m1 = new Microfone();
        m1.base = "Circular";
        m1.fio = 20;
        m1.haste = "Plastico";
        m1.caracteristicas();
        m1.ligado();
        m1.capturar_audio();

        Microfone m2 = new Microfone();
        m2.base = "Fibra de carbono";
        m2.caracteristicas();
    }
}