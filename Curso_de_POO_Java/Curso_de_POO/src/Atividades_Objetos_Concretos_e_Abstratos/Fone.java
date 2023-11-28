package Atividades_Objetos_Concretos_e_Abstratos;

public class Fone {

        public String marca;
        protected boolean energia = true;
        protected boolean parear = true;

        public void info(){
            System.out.println("Esse fone é da marca: " + this.marca);
        }
        public void ligar_fone(){
            if(this.energia ==true) {
                System.out.println("O fone está ligado");
            } else {
                System.out.println("O fone está desligado");
            }
        }
        public void parear_fone(){
            if(this.parear==true) {
                System.out.println("O fone está pareado.");
            } else {
                System.out.println("O fone não foi pareado.");
            }
        }
    }
