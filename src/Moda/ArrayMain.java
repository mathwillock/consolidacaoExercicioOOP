package Moda;

public class ArrayMain {

    public static void main(String[] args) {

        Roupa [] lojaBrutalKill;
        lojaBrutalKill = new Roupa[5];

        lojaBrutalKill[0] = new Roupa("Silfos", "Branca", "propria", "Grande", "Lancamento", "camiseta - Silfos");
        lojaBrutalKill[1] = new Roupa("Faith", "Branca", "propria", "Grande", "Lancamento", "camiseta tradicional - Faith");
        lojaBrutalKill[2] = new Roupa("Falls", "Branca", "propria", "Medio", "Lancamento", "camiseta - Falls");
        lojaBrutalKill[3] = new Roupa("Maine", "Preta", "propria", "Extra Grande", "Lancamento", "camiseta - Maine");
        lojaBrutalKill[4] = new Roupa("Galeon", "Preta", "propria", "Grande", "Lancamento", "camiseta - Galeon");

        System.out.println(lojaBrutalKill[0]);
        System.out.println(lojaBrutalKill[1]);
        System.out.println(lojaBrutalKill[2]);
        System.out.println(lojaBrutalKill[3]);
        System.out.println(lojaBrutalKill[4]);

    }






}
