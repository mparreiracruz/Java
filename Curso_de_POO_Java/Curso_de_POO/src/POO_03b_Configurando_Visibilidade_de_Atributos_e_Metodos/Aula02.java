package POO_03b_Configurando_Visibilidade_de_Atributos_e_Metodos;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Crystal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar();
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
