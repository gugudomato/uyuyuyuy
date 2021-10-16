public class Quest3_luta {

    public static void main(String[] args){

        Quest3_lutador lutador1 = new Quest3_lutador(100, 10, "Ryu");
        Quest3_lutador lutador2 = new Quest3_lutador(100, 12, "Bison");

        lutador1.aplicarGolpe(lutador2);
        lutador1.aplicarGolpe(lutador2);
        lutador1.aplicarGolpe(lutador2);
        System.out.println("Energia: "+lutador2.energia);

        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        System.out.println("Energia: "+lutador1.energia);

    }
}
