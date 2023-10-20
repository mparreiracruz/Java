package POO_2b_Criando_Classes_e_Objetos_em_Java;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.modelo = "Bic";
        c1.carga = 90;
        c1.status();
    }
}
