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
 >ponta
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


public class Principal {
    public static void main(String[] args){

        Relogio r1 = new Relogio();
        r1.tela = "LCD";
        r1.pulseira = "silicone";
        r1.caixa = "metal";
        r1.bateria = 90;
        r1.caracteristicas();
        r1.horadodia();
        r1.cronometro();
        r1.contagemregressiva();
        r1.horamundial();

        Relogio r2 = new Relogio();
        r2.tela = "Analógica";
        r2.pulseira = "Ouro";
        r2.caracteristicas();
    }
}
