public class Quest5_SUAP {

    public static void main(String[] args){

        double media;
        Quest5_discente Breno = new Quest5_discente("Gustavo", "111.222.533-72");

        Breno.n1 = 10.00;
        Breno.n2 = 10.00;
        Breno.n3 = 10.00;

        media = Breno.M();

        System.out.println("Media da aluna "+Breno.nome+": "+media);

        Breno.n2 = 0;

        media = Breno.M();

        System.out.println("Media da aluna "+Breno.nome+": "+media);
    }
}
