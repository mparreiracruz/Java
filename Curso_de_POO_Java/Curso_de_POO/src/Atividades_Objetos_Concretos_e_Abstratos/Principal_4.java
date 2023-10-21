package Atividades_Objetos_Concretos_e_Abstratos;
/*objeto abstrato;
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
*/
public class Principal_4 {
    public static void main(String[] args) {
        Almoco a1 = new Almoco();
        a1.alimento = "Salada";
        a1.prato = "Ouro";
        a1.garfo = "Prata";
        a1.faca = "Aço Valiriano";
        a1.comendo();
        a1.caracteristicas_4();
        a1.estados_4();

    }
}
