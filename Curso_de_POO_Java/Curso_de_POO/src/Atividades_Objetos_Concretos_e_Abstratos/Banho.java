package Atividades_Objetos_Concretos_e_Abstratos;
/*
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
*/
public class Banho {
    float box;
    boolean ducha;
    boolean torneira;
    String ralo;

    void caracteristicas_3(){
        System.out.println("O box mede " + this.box + " metros quadrados.");
        System.out.println("O ralo é " + this.ralo);
    }
    void estados_3(){
        if(this.ducha==true) {
            System.out.println("A ducha está aberta.");
        } else {
            System.out.println("A ducha está fechada.");
                }
        if(this.torneira==true) {
            System.out.println("A torneira está aberta.");
        }else {
            System.out.println("A torneira está fechada.");

        }
    }
    void abrir_ducha(){
        this.ducha = true;

    }
    void abrir_torneira(){
        this.torneira = true;
    }

}



